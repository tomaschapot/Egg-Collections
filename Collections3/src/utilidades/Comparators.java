/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author tomic
 */
public class Comparators {

    public static Comparator<Pelicula> ordenarPorDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());

        }
    };

    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
