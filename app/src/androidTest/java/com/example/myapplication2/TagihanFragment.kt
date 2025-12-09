package com.example.bluapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bluapp.R

class TagihanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tagihan, container, false)

        // Back button
        view.findViewById<ImageView>(R.id.btnBack)?.setOnClickListener {
            requireActivity().onBackPressed()
        }

        // Tombol Bayar
        view.findViewById<TextView>(R.id.btnBayarPLN)?.setOnClickListener {
            Toast.makeText(context, "Bayar PLN - Rp 350.000", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.btnBayarBPJS)?.setOnClickListener {
            Toast.makeText(context, "Bayar BPJS - Rp 150.000", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<TextView>(R.id.btnBayarIndihome)?.setOnClickListener {
            Toast.makeText(context, "Bayar Indihome - Rp 420.000", Toast.LENGTH_SHORT).show()
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

        view.findViewById<TextView>(R.id.tabProfil)?.setOnClickListener {
            Toast.makeText(context, "Profil", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}