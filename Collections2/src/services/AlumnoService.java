/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class AlumnoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> listaAlumnos = new ArrayList();

    public AlumnoService() {
        this.listaAlumnos = new ArrayList();
    }

    private Alumno crearAlumno() {

        ArrayList<Integer> listaNotas = new ArrayList();
        Alumno a1 = new Alumno();
        Integer nota1, nota2, nota3;

        System.out.println("Ingrese el nombre");
        a1.setNombre(leer.next());

        System.out.println("Ingrese las 3 notas que obtuvo el alumno");

        System.out.println("Nota 1: ");
        nota1 = leer.nextInt();
        listaNotas.add(nota1);

        System.out.println("Nota 2: ");
        nota2 = leer.nextInt();
        listaNotas.add(nota2);

        System.out.println("Nota 3: ");
        nota3 = leer.nextInt();
        listaNotas.add(nota3);

        a1.setListaNotas(listaNotas);

        return a1;
    }

    public void fabricaAlumnos() {

        String respuesta;
        System.out.println("-------Creando Alumnos-------");

        do {
            listaAlumnos.add(crearAlumno());

            System.out.println("Desea crear otro alumno? s/n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarAlumnos() {

        listaAlumnos.forEach((aux) -> {
            System.out.println(aux);
        });

    }
    
    public void notaFinal(){
        
        System.out.println("Ingrese el nombre del alumno al que quiere calcular"
                + " la nota final");
        
        String a1 = leer.next();
        Boolean encontrado = false;
        
        for(Alumno aux : listaAlumnos){
            
            if(aux.getNombre().equalsIgnoreCase(a1)){
                Integer totalNotas = aux.getListaNotas().get(1) + 
                        aux.getListaNotas().get(2) + aux.getListaNotas().get(2);
                
                Integer promedio = totalNotas / 3;
                
                System.out.println("El promedio de " + aux.getNombre() + "es de:"
                        + " " + promedio);
                encontrado = true;
            }
        }
        
        if (!encontrado){
            System.out.println("El alumno no esta en la lista");
        }

    }

}
