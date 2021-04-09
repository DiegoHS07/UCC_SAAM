package com.ucc.ucc_saam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.AlbumAdapter
import com.ucc.ucc_saam.HelperClasses.HomeAdapter.AlbumHelperClass
import kotlinx.android.synthetic.main.activity_album.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.bottom_navigation
import kotlinx.android.synthetic.main.activity_retos.*

class AlbumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)

        setUpRecyclerView()

        bottom_navigation.selectedItemId = R.id.page_album
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_album -> {

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
                    val intent = Intent(this, PerfilActivity::class.java)
                    startActivity(intent)
                }
            }
            true
        }
    }

    private fun setUpRecyclerView() {
        //album RecyclerView
        albumRecyclerView.setHasFixedSize(true)
        albumRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val album = ArrayList<AlbumHelperClass>()

        album.add(AlbumHelperClass(R.drawable.comida,"Visitar un comedor", "Organización: Comedor comunitario Jardin", "Fecha: 10-05-2020"))
        album.add(AlbumHelperClass(R.drawable.libros,"Donar libros", "Organización: Cruz Roja Colombiana", "Fecha: 21-06-2020"))
        album.add(AlbumHelperClass(R.drawable.juguetes,"Donar un juguete", "Organización: Cruz Roja Colombiana", "Fecha: 01-03-2021"))

        val adapterAlbum = AlbumAdapter(album)
        albumRecyclerView.adapter = adapterAlbum

    }
}