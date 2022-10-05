/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author tomic
 */
public class Alumno {
    
    private String nombre;
    
    private ArrayList <Integer> listaNotas;
    
    public Alumno (){
        
    };
    
    public Alumno(String nombre, ArrayList<Integer> notas){
        this.nombre = nombre;
        this.listaNotas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }
    
    
    
}
