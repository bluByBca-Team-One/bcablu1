package com.example.bluapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KeuanganActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_keuangan_blu)

        // Menu items (pakai findViewById untuk include layout)
        findViewById<View>(R.id.itemSaving)?.setOnClickListener {
            Toast.makeText(this, "bluSaving", Toast.LENGTH_SHORT).show()
            // startActivity(Intent(this, SavingActivity::class.java))
        }

        findViewById<View>(R.id.itemInvest)?.setOnClickListener {
            Toast.makeText(this, "bluInvest", Toast.LENGTH_SHORT).show()
            // startActivity(Intent(this, BluinvestActivity::class.java))
        }

        findViewById<View>(R.id.itemPayment)?.setOnClickListener {
            Toast.makeText(this, "Metode Pembayaran", Toast.LENGTH_SHORT).show()
        }

        findViewById<View>(R.id.itemSecurity)?.setOnClickListener {
            Toast.makeText(this, "Keamanan", Toast.LENGTH_SHORT).show()
        }

        findViewById<View>(R.id.itemInsurance)?.setOnClickListener {
            Toast.makeText(this, "Asuransi", Toast.LENGTH_SHORT).show()
            // startActivity(Intent(this, InsuranceActivity::class.java))
        }

        findViewById<View>(R.id.itemGift)?.setOnClickListener {
            Toast.makeText(this, "Gift", Toast.LENGTH_SHORT).show()
        }
    }
}