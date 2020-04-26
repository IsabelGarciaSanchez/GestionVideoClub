/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvideo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GestionVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                boolean iniciado = true;
                Scanner sc = new Scanner(System.in);
                int op;

		//CREAMOS UNA ARRAYLIST PELICULAS Y DE CLIENTES
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		//AÑADIMOS LAS PELICULAS AL ARRAYLIST DE PELICULAS ;)
		
		peliculas.add(new Pelicula(123, "El señor de los anillos","Peter"));
		peliculas.add(new Pelicula(234, "Buscando a nemo","Andrew"));
		peliculas.add(new Pelicula(345, "La guerra de las galaxias","George"));
		peliculas.add(new Pelicula(456, "El padrino","Francis"));
		peliculas.add(new Pelicula(678, "Annabelle","John"));
		peliculas.add(new Pelicula(789, "Titanic","James"));
		peliculas.add(new Pelicula(891, "El rey león","Rob"));
		peliculas.add(new Pelicula(812, "Piratas del caribe","Rob"));
		peliculas.add(new Pelicula(122, "Jurassic Park","Steven"));
		peliculas.add(new Pelicula(186, "Harry potter","Chris"));	

        while (iniciado == true) {  
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Consultar datos cliente");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion del menú: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    String nombreyapellidos;
                    int codCli;
                    System.out.println("Introduce un codigo para el cliente: ");
                    codCli = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce el nombre y apellidos del cliente");
                    nombreyapellidos = sc.nextLine();                    
                    
                    clientes.add(new Cliente(codCli, nombreyapellidos));
                    break;
                    
                case 2:
                    int codCliDatos;
                    System.out.println("Introduce el codigo del cliente");
                    codCliDatos = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cli = clientes.get(i);
                        if (cli.getCodigoCliente() == codCliDatos) {
                            System.out.println(cli);
                        }
                    }
                    break;
                    
                case 3:
                    String nomPeliAlquilar;
                    int codCliAlquilar;
                    Cliente cliAlquilar = null;
                    Pelicula peliAlquilar = null;
                    System.out.print("Introduce el nombre del cliente: ");
                    codCliAlquilar = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cli = clientes.get(i);
                        if (cli.getCodigoCliente() == codCliAlquilar) {
                            cliAlquilar = cli;
                        }
                    }

                    System.out.print("Introduce el nombre de la pelicula que va a alquilar el cliente");
                    nomPeliAlquilar = sc.nextLine();
                    for (int i = 0; i < peliculas.size(); i++) {
                        Pelicula peli = peliculas.get(i);
                        if (peli.getTitulo().equalsIgnoreCase(nomPeliAlquilar)) {
                            peliAlquilar = peli;
                        }
                    }

                    if (cliAlquilar.alquilar(peliAlquilar)) {
                        System.out.println("Pelicula alquilada correctamente");
                    } else {
                        System.out.println("Esta pelicula ya ha sido alquilada solo se puede alquilar una vez la pelicula");
                    }


                    break;

                
                case 4:                    
                    iniciado = false;
                    System.out.println("Adios!");
                    break;

                default:
                    
            }
        }
    }
    
}
