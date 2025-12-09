package com.example.bluapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bluapp.R

class NotifikasiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notifikasi_profile, container, false)

        // Back button
        view.findViewById<ImageView>(R.id.btnBack)?.setOnClickListener {
            requireActivity().onBackPressed()
        }

        // Switch listeners
        view.findViewById<Switch>(R.id.switchTransaksi)?.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Aktif" else "Nonaktif"
            Toast.makeText(context, "Notifikasi Transaksi: $status", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Switch>(R.id.switchPromo)?.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Aktif" else "Nonaktif"
            Toast.makeText(context, "Promo & Diskon: $status", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Switch>(R.id.switchBerita)?.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Aktif" else "Nonaktif"
            Toast.makeText(context, "Berita & Update: $status", Toast.LENGTH_SHORT).show()
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