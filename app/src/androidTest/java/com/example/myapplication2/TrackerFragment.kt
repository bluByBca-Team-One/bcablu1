package com.example.bluapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bluapp.R

class TrackerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tracker, container, false)

        // Tab navigation
        view.findViewById<TextView>(R.id.tabHome)?.setOnClickListener {
            Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.tabPortfolio)?.setOnClickListener {
            Toast.makeText(context, "Portfolio", Toast.LENGTH_SHORT).show()
        }

        // Toggle Akun/Kartu
        view.findViewById<TextView>(R.id.toggleAkun)?.setOnClickListener {
            Toast.makeText(context, "AKUN aktif", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.toggleKartu)?.setOnClickListener {
            Toast.makeText(context, "Kartu", Toast.LENGTH_SHORT).show()
        }

        // Bottom navigation
        view.findViewById<TextView>(R.id.navTransaksi)?.setOnClickListener {
            Toast.makeText(context, "Transaksi", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.navKeuangan)?.setOnClickListener {
            Toast.makeText(context, "Keuangan", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.navRiwayat)?.setOnClickListener {
            Toast.makeText(context, "Riwayat", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.navProfil)?.setOnClickListener {
            Toast.makeText(context, "Profil", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}