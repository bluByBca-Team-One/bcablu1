package com.example.bluapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.bluapp.fragments.HomeFragment
import com.example.bluapp.fragments.TrackerFragment
import com.example.bluapp.fragments.PortfolioFragment
import com.example.bluapp.fragments.TagihanFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load default fragment (HomeFragment sebagai halaman awal)
        loadFragment(HomeFragment())

        // Setup Bottom Navigation
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        // Menu Kiri
        findViewById<TextView>(R.id.navTransaksi)?.setOnClickListener {
            startActivity(Intent(this, TransaksiActivity::class.java))
        }

        findViewById<TextView>(R.id.navKeuangan)?.setOnClickListener {
            startActivity(Intent(this, KeuanganActivity::class.java))
        }

        // Menu Kanan
        findViewById<TextView>(R.id.navRiwayat)?.setOnClickListener {
            loadFragment(TrackerFragment())
            Toast.makeText(this, "Riwayat", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.navProfil)?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        // Button QR di tengah
        findViewById<CardView>(R.id.btnQR)?.setOnClickListener {
            Toast.makeText(this, "Scan QR Code", Toast.LENGTH_SHORT).show()
            // Nanti bisa tambah intent ke QR Scanner Activity
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    // Optional: Handle back button
    override fun onBackPressed() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment is HomeFragment) {
            // Kalau di Home, keluar aplikasi
            finish()
        } else {
            // Kalau di fragment lain, balik ke Home
            loadFragment(HomeFragment())
        }
    }
}