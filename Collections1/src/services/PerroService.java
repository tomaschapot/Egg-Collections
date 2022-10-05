/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author tomic
 */
public class PerroService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Perro> listaMascotas;

    public PerroService() {
        this.listaMascotas = new ArrayList();
    }

    ;
   
   private Perro crearPerro() {

        Perro p1 = new Perro();

        System.out.println("Ingrese la raza del perro");

        p1.setRaza(read.next());

        return p1;
    }

    public void fabricaPerros() {

        String respuesta;

        do {

            System.out.println("Creando Mascota");
            Perro p1 = crearPerro();

            listaMascotas.add(p1);

            System.out.println("Quiere crear otra mascota s/n");

            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void mostrarMascotas() {

        for (Perro aux : listaMascotas) {

            System.out.println(aux);
        }

    }

    public void removerPerro() {

        Iterator<Perro> it = listaMascotas.iterator();

        String perroARemover;
        Boolean encontrado = false;
        System.out.println("Ingrese el nombre del perro a remover");

        perroARemover = read.next();

        while (it.hasNext()) {

            if (it.next().getRaza().equalsIgnoreCase(perroARemover)) {

                it.remove();
                encontrado = true;

            }
        }

        if (!encontrado) {
            System.out.println("El perro no se encuentra en la lista");
        }
        
        listaMascotas.sort(Comparadores.ordenarPorNombreDesc);

    }

}
