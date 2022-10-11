/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import utilidades.Comparators;

/**
 *
 * @author tomic
 */
public class PaisService {

    private Scanner read;
    private Set<Pais> listaPaises;

    public PaisService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.listaPaises = new HashSet();
    }

    ;
    
    private Pais crearPais() {

        Pais p1 = new Pais();

        System.out.println("Ingrese el nombre del Pais");
        p1.setNombre(read.next());

        return p1;

    }

    public void mostrarLista() {

        for (Pais aux : listaPaises) {
            System.out.println(aux.getNombre());
        }

    }

    public void paisFactory() {

        String exit;

        do {

            System.out.println("Creando Pais");
            Pais p1 = crearPais();
            listaPaises.add(p1);

            System.out.println("Quiere ingresar otro pais? s/n");
            exit = read.next();

        } while (exit.equalsIgnoreCase("s"));

        if (exit.equalsIgnoreCase("n")) {
            mostrarLista();
        }

    }

    public void ordenarPaisesPorNombre() {

        ArrayList<Pais> lista = new ArrayList(listaPaises);

        lista.sort(Comparators.compararNombrePais);

        for (Pais aux : lista) {
            System.out.println(aux.getNombre());
        }
    }

    public void removerPais(String pais) {

        Iterator iterador = listaPaises.iterator();

        while (iterador.hasNext()) {

            Pais p1 = (Pais) iterador.next();

            if (p1.getNombre().equals(pais)) {

                iterador.remove();

            }

        }

    }

}
