package com.example.bluapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bluapp.R

class PengaturanUmumFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pengaturan_umum_profile, container, false)

        // Back button
        view.findViewById<ImageView>(R.id.btnBack)?.setOnClickListener {
            requireActivity().onBackPressed()
        }

        // Menu items
        view.findViewById<RelativeLayout>(R.id.itemBahasa)?.setOnClickListener {
            Toast.makeText(context, "Ganti Bahasa", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<RelativeLayout>(R.id.itemTema)?.setOnClickListener {
            Toast.makeText(context, "Ganti Tema", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<RelativeLayout>(R.id.itemVersi)?.setOnClickListener {
            Toast.makeText(context, "Versi 1.25.0", Toast.LENGTH_SHORT).show()
        }

        // Bottom navigation
        view.findViewById<TextView>(R.id.tabTransaksi)?.setOnClickListener {
            Toast.makeText(context, "Transaksi", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.tabKeuangan)?.setOnClickListener {
            Toast.makeText(context, "Keuangan", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.tabRiwayat)?.setOnClickListener {
            Toast.makeText(context, "Riwayat", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}