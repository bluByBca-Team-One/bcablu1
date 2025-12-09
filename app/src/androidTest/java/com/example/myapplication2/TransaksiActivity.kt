package com.example.bluapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TransaksiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_transaksi_blu)

        // Back button
        findViewById<ImageView>(R.id.back).setOnClickListener {
            finish()
        }

        // Spinner rekening
        val spinner = findViewById<Spinner>(R.id.spinner_rekening)
        val rekening = arrayOf("BCA - 1234567890", "Mandiri - 0987654321", "BRI - 5555666677")
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, rekening)

        // Input jumlah
        val inputJumlah = findViewById<EditText>(R.id.input_jumlah)

        // Button Lanjut
        findViewById<Button>(R.id.btn_lanjut).setOnClickListener {
            val jumlah = inputJumlah.text.toString()
            if (jumlah.isEmpty()) {
                Toast.makeText(this, "Masukkan jumlah!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Transfer $jumlah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}