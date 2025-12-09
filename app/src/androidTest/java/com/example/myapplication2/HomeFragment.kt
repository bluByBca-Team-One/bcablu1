package com.example.bluapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.bluapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Button Pindah Dana
        view.findViewById<AppCompatButton>(R.id.btnPindahDana)?.setOnClickListener {
            Toast.makeText(context, "Pindah Dana", Toast.LENGTH_SHORT).show()
        }

        // Button QRIS
        view.findViewById<AppCompatButton>(R.id.btnQris)?.setOnClickListener {
            Toast.makeText(context, "QRIS", Toast.LENGTH_SHORT).show()
        }

        // FAB (QR Code di tengah)
        view.findViewById<FloatingActionButton>(R.id.fab)?.setOnClickListener {
            Toast.makeText(context, "Scan QR", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}