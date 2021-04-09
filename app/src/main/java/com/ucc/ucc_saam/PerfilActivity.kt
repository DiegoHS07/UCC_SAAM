package com.ucc.ucc_saam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.bottom_navigation
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        bottom_navigation.selectedItemId = R.id.page_perfil
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_album -> {
                    val intent = Intent(this, AlbumActivity::class.java)
                    startActivity(intent)
                }
                R.id.page_retos -> {
                    val intent = Intent(this, RetosActivity::class.java)
                    startActivity(intent)
                }
                R.id.page_inicio -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.page_rango -> {
                    //val intent = Intent(this, RangoActivity::class.java)
                    //startActivity(intent)
                }
                R.id.page_perfil -> {
                }
            }
            true
        }

        buttonConfiguracion.setOnClickListener {
            val intent = Intent(this, ConfiguracionActivity::class.java)
            startActivity(intent)
        }
    }
}