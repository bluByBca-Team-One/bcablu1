package com.example.bluapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bluapp.R

class UbahPinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ubah_pin, container, false)

        // Back button
        view.findViewById<ImageView>(R.id.btnBack)?.setOnClickListener {
            requireActivity().onBackPressed()
        }

        val etCurrentPin = view.findViewById<EditText>(R.id.etCurrentPin)
        val etNewPin = view.findViewById<EditText>(R.id.etNewPin)
        val etConfirmPin = view.findViewById<EditText>(R.id.etConfirmNewPin)

        view.findViewById<Button>(R.id.btnSimpanPin).setOnClickListener {
            val currentPin = etCurrentPin.text.toString()
            val newPin = etNewPin.text.toString()
            val confirmPin = etConfirmPin.text.toString()

            when {
                currentPin.isEmpty() || newPin.isEmpty() || confirmPin.isEmpty() -> {
                    Toast.makeText(context, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
                }
                currentPin.length != 6 || newPin.length != 6 || confirmPin.length != 6 -> {
                    Toast.makeText(context, "PIN harus 6 digit!", Toast.LENGTH_SHORT).show()
                }
                newPin != confirmPin -> {
                    Toast.makeText(context, "PIN tidak cocok!", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(context, "PIN berhasil diubah!", Toast.LENGTH_SHORT).show()
                    requireActivity().onBackPressed()
                }
            }
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