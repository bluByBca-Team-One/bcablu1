package com.example.bluapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Back button
        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        // Menu items
        findViewById<RelativeLayout>(R.id.itemPengaturanUmum).setOnClickListener {
            Toast.makeText(this, "Pengaturan Umum", Toast.LENGTH_SHORT).show()
        }

        findViewById<RelativeLayout>(R.id.itemKeamananPin).setOnClickListener {
            Toast.makeText(this, "Keamanan & PIN", Toast.LENGTH_SHORT).show()
        }

        findViewById<RelativeLayout>(R.id.itemNotifikasi).setOnClickListener {
            Toast.makeText(this, "Pengaturan Notifikasi", Toast.LENGTH_SHORT).show()
        }

        findViewById<RelativeLayout>(R.id.itemBantuan).setOnClickListener {
            Toast.makeText(this, "Bantuan & FAQ", Toast.LENGTH_SHORT).show()
        }

        findViewById<RelativeLayout>(R.id.itemKeluarAkun).setOnClickListener {
            // Logout - kembali ke Login
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        // Bottom navigation
        findViewById<TextView>(R.id.tabTransaksi).setOnClickListener {
            Toast.makeText(this, "Transaksi", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.tabKeuangan).setOnClickListener {
            Toast.makeText(this, "Keuangan", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.tabRiwayat).setOnClickListener {
            Toast.makeText(this, "Riwayat", Toast.LENGTH_SHORT).show()
        }
    }
}