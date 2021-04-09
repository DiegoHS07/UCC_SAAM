package com.ucc.ucc_saam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.RetoAdapter
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.RetoHelperClass
import kotlinx.android.synthetic.main.activity_home.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setUpRecyclerView()

        bottom_navigation.selectedItemId = R.id.page_inicio
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
        //Mis Retos RecyclerView
        misRetosRecyclerView.setHasFixedSize(true)
        misRetosRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val misRetos = ArrayList<RetoHelperClass>()

        misRetos.add(RetoHelperClass(R.drawable.libros,"Donar libros", "50 pts.","Donaciones","Biblioteca Dario E. chandia", "Dona uno de tus libros favoritos para esta organización."))
        misRetos.add(RetoHelperClass(R.drawable.juguetes,"Donar un juguete", "30 pts.", "Donaciones", "Bienestar familiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))
        misRetos.add(RetoHelperClass(R.drawable.libros,"Visitar una biblioteca", "50 pts.", "Visitas","Biblioteca Dario E. chandia", "Visita y lee uno de tus libros favoritos en esta organización."))
        misRetos.add(RetoHelperClass(R.drawable.ropa,"Donar ropa", "40 pts.", "Donaciones", "Bienestar Familiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))

        val adapterMisRetos = RetoAdapter(misRetos)
        misRetosRecyclerView.adapter = adapterMisRetos

        //Retos Populares RecyclerView
        retosPopularesRecyclerView.setHasFixedSize(true)
        retosPopularesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val retosPopulares = ArrayList<RetoHelperClass>()

        retosPopulares.add(RetoHelperClass(R.drawable.libros,"Donar libros", "50 pts.","Donaciones","Biblioteca Dario E. chandia", "Dona uno de tus libros favoritos para esta organización."))
        retosPopulares.add(RetoHelperClass(R.drawable.juguetes,"Donar un juguete", "30 pts.", "Donaciones", "Bienestar familiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))
        retosPopulares.add(RetoHelperClass(R.drawable.ropa,"Donar ropa", "40 pts.", "Donaciones", "Bienestar Familiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."))
        retosPopulares.add(RetoHelperClass(R.drawable.libros,"Visitar una biblioteca", "50 pts.", "Visitas","Biblioteca Dario E. chandia", "Visita y lee uno de tus libros favoritos en esta organización."))

        val adapterRetosPopulares = RetoAdapter(retosPopulares)
        retosPopularesRecyclerView.adapter = adapterRetosPopulares

    }
}