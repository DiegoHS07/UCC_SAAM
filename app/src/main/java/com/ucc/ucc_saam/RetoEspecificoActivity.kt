package com.ucc.ucc_saam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.RetoHelperClass
import kotlinx.android.synthetic.main.activity_reto_especifico.*
import kotlinx.android.synthetic.main.reto_card_design.*

class RetoEspecificoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto_especifico)

        //Variables
        val bundle = intent.extras
        val reto = bundle?.getSerializable("reto") as RetoHelperClass

        setup(reto)

    }

    private fun setup(reto: RetoHelperClass){

        reto_especifico_titulo.text = reto.title
        reto_especifico_categoria.text = reto.category
        reto_especifico_imagen.setImageResource(reto.image)
        reto_especifico_organizacion.text = reto.organitation
        reto_especifico_descripcion.text = reto.description

        reto_especifico_regresar.setOnClickListener{
            super.onBackPressed()
        }

        btnAceptarReto.setOnClickListener{
            val challengeIntent = Intent(this, AceptarRetoActivity::class.java)
            startActivity(challengeIntent)
        }

        btnValidarReto.setOnClickListener{
            val challengeIntent = Intent(this, ValidarRetoActivity::class.java)
            startActivity(challengeIntent)
        }

    }
}