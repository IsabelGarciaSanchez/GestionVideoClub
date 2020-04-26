/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvideo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int codigoCliente;
    private String nombreApellidos;
    private ArrayList<Pelicula> listaPeliculas;

    public Cliente() {
        listaPeliculas= new ArrayList<Pelicula>();
    }

    public Cliente(int codigoCliente, String nombreApellidos){
        this.codigoCliente = codigoCliente;
        this.nombreApellidos = nombreApellidos;
        listaPeliculas= new ArrayList<Pelicula>();
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    public boolean alquilar(Pelicula pelicula) {
    
    	if (listaPeliculas.contains(pelicula)) {
			return false;
		} else {
			listaPeliculas.add(pelicula);
			return true;
		}
    		
    }
    
    public void mostrarPeliculas(){
        for (int i = 0; i < listaPeliculas.size(); i++) {
            Pelicula pe = listaPeliculas.get(i);
            System.out.println(pe.getTitulo());
        }
    }
    
    @Override
    public String toString() {
        return  codigoCliente + ", " + nombreApellidos + ", " + listaPeliculas ;
    }
}
