package com.ucc.ucc_saam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.RetoAdapter
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.RetoHelperClass
import kotlinx.android.synthetic.main.activity_home.bottom_navigation
import kotlinx.android.synthetic.main.activity_retos.*


class RetosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retos)

        setUpRecyclerView()

        bottom_navigation.selectedItemId = R.id.page_retos
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_album -> {
                    val intent = Intent(this, AlbumActivity::class.java)
                    startActivity(intent)
                }
                R.id.page_retos -> {
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
                    val intent = Intent(this, PerfilActivity::class.java)
                    startActivity(intent)
                }
            }
            true
        }
    }

    private fun setUpRecyclerView() {
        //Donaciones RecyclerView
        donacionesRecyclerView.setHasFixedSize(true)
        donacionesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val donaciones = ArrayList<RetoHelperClass>()

        donaciones.add(RetoHelperClass(R.drawable.libros,"Donar libros", "50 pts.","Donaciones","Biblioteca Dario E. chandia", "Dona uno de tus libros favoritos para esta organización."))
        donaciones.add(RetoHelperClass(R.drawable.juguetes,"Donar un juguete", "30 pts.", "Donaciones", "Bienestar familiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))
        donaciones.add(RetoHelperClass(R.drawable.ropa,"Donar ropa", "40 pts.", "Donaciones", "Bienestar Familiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))


        val adapterDonaciones = RetoAdapter(donaciones)
        donacionesRecyclerView.adapter = adapterDonaciones

        //Visitas RecyclerView
        visitasRecyclerView.setHasFixedSize(true)
        visitasRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val visitas = ArrayList<RetoHelperClass>()

        visitas.add(RetoHelperClass(R.drawable.libros,"Visitar una biblioteca", "50 pts.", "Visitas","Biblioteca Dario E. chandia", "Visita y lee uno de tus libros favoritos en esta organización."))
        visitas.add(RetoHelperClass(R.drawable.comida,"Visitar un centro comunitario", "45 pts.","Visitas", "Bienestar familiar","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))
        visitas.add(RetoHelperClass(R.drawable.juguetes,"Visitar una guarderia", "30 pts.","Visitas", "Bienestar familiar","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))


        val adapterVisitas = RetoAdapter(visitas)
        visitasRecyclerView.adapter = adapterVisitas

    }
}