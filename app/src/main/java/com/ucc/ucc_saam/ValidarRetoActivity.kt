package com.ucc.ucc_saam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_validar_reto.*

class ValidarRetoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validar_reto)

        btnCerrarValidarReto.setOnClickListener {
            super.onBackPressed()
        }
    }
}