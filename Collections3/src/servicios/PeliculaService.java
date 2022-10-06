/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import utilidades.Comparators;

/**
 *
 * @author tomic
 */
public class PeliculaService {

    private ArrayList<Pelicula> lista;
    private Scanner leer;

    public PeliculaService() {

        this.lista = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");

    }

    ;
    
    private Pelicula crearPelicula() {

        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        p1.setTitulo(leer.next());

        System.out.println("Ingrese el director de la pelicula");
        p1.setDirector(leer.next());

        System.out.println("Ingrese la duracion en horas de la pelicula");
        p1.setDuracion(leer.nextDouble());

        return p1;

    }

    public void fabricaPeliculas() {

        String respuesta;

        do {

            Pelicula p1 = crearPelicula();
            lista.add(p1);

            System.out.println("Quiere ingresar otra pelicula? s/n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void mostrarPeliculas() {

        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }

    public void mostrarPeliculasLargas() {

        for (Pelicula aux : lista) {

            if (aux.getDuracion() >= 1) {
                System.out.println(aux);
            }

        }
    }

    public void mostrarPeliculasOrdenadasPorDuracion() {

        lista.sort(Comparators.ordenarPorDuracionAscendente);

        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }

    public void mostrarPeliculaPorTitulo() {

        lista.sort(Comparators.ordenarPorTitulo);

        for (Pelicula aux : lista) {
            System.out.println(aux);
        }

    }

    public void mostrarPeliculaPorDirector() {

        lista.sort(Comparators.ordenarPorDirector);

        for (Pelicula aux : lista) {
            System.out.println(aux);
        }

    }

}
