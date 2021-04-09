package com.ucc.ucc_saam.HelperClasses.HomeAdapter;

public class AlbumHelperClass {
    int imagen;
    String titulo, organizacion, fecha;

    public AlbumHelperClass(int imagen, String titulo, String organizacion, String fecha) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.organizacion = organizacion;
        this.fecha = fecha;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public String getFecha() {
        return fecha;
    }
}
