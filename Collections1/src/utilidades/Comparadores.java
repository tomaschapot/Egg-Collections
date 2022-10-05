/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Perro;
import java.util.Comparator;

/**
 *
 * @author tomic
 */
public class Comparadores {

    public static Comparator<Perro> ordenarPorNombreDesc = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {

            return p2.getRaza().compareTo(p1.getRaza());

        }
    };

}
