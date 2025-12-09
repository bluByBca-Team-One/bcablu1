package com.example.bluapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.bluapp.R
import com.example.bluapp.TransaksiActivity
import com.example.bluapp.KeuanganActivity
import com.example.bluapp.ProfileActivity

class PortfolioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_portfolio, container, false)

        // Tab navigation (atas)
        view.findViewById<TextView>(R.id.tabTracker)?.setOnClickListener {
            // Ganti ke TrackerFragment
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, TrackerFragment())
                .commit()
        }

        view.findViewById<TextView>(R.id.tabHome)?.setOnClickListener {
            // Ganti ke HomeFragment
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, com.example.bluapp.fragments.HomeFragment())
                .commit()
        }

        // Bottom navigation
        view.findViewById<TextView>(R.id.navTransaksi)?.setOnClickListener {
            startActivity(Intent(requireContext(), TransaksiActivity::class.java))
        }

        view.findViewById<TextView>(R.id.navKeuangan)?.setOnClickListener {
            startActivity(Intent(requireContext(), KeuanganActivity::class.java))
        }

        view.findViewById<TextView>(R.id.navRiwayat)?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, TrackerFragment())
                .commit()
        }

        view.findViewById<TextView>(R.id.navProfil)?.setOnClickListener {
            startActivity(Intent(requireContext(), ProfileActivity::class.java))
        }

        // QR Button
        view.findViewById<CardView>(R.id.btnQR)?.setOnClickListener {
            Toast.makeText(context, "Scan QR", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
