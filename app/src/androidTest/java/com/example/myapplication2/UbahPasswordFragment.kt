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

class UbahPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ubah_password_profile, container, false)

        // Back button
        view.findViewById<ImageView>(R.id.btnBack)?.setOnClickListener {
            requireActivity().onBackPressed()
        }

        val etOldPassword = view.findViewById<EditText>(R.id.etOldPassword)
        val etNewPassword = view.findViewById<EditText>(R.id.etNewPassword)
        val etConfirmPassword = view.findViewById<EditText>(R.id.etConfirmNewPassword)

        view.findViewById<Button>(R.id.btnSimpanPassword).setOnClickListener {
            val oldPass = etOldPassword.text.toString()
            val newPass = etNewPassword.text.toString()
            val confirmPass = etConfirmPassword.text.toString()

            when {
                oldPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty() -> {
                    Toast.makeText(context, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
                }
                newPass.length < 8 -> {
                    Toast.makeText(context, "Password min. 8 karakter!", Toast.LENGTH_SHORT).show()
                }
                newPass != confirmPass -> {
                    Toast.makeText(context, "Password tidak cocok!", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(context, "Password berhasil diubah!", Toast.LENGTH_SHORT).show()
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