/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvideo;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    private int codigoPelicula;
    private String titulo;
    private String director;

    public Pelicula() {
    }

    public Pelicula(int codigoPelicula, String titulo, String director) {
        this.codigoPelicula = codigoPelicula;
        this.titulo = titulo;
        this.director = director;
    }
    public int getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(int codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    @Override
    public String toString() {
        return  codigoPelicula + ", " + titulo + ", " + director;
    }
}
