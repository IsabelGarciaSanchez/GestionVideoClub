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
public class GestionVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		//CREAMOS UNA ARRAYLIST PELICULAS Y DE CLIENTES
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		//AÑADIMOS LAS PELICULAS AL ARRAYLIST DE PELICULAS ;)
		
		peliculas.add(new Pelicula(123, "El señor de los anillos","Peter") );
		peliculas.add(new Pelicula(234, "Buscando a nemo","Andrew") );
		peliculas.add(new Pelicula(345, "La guerra de las galaxias","George") );
		peliculas.add(new Pelicula(456, "El padrino","Francis") );
		peliculas.add(new Pelicula(678, "Annabelle","John") );
		peliculas.add(new Pelicula(789, "Titanic","James") );
		peliculas.add(new Pelicula(891, "El rey león","Rob") );
		peliculas.add(new Pelicula(812, "Piratas del caribe","Rob") );
		peliculas.add(new Pelicula(122, "Jurassic Park","Steven") );
		peliculas.add(new Pelicula(186, "Harry potter","Chris") );	

		 
		
    }
    
}
