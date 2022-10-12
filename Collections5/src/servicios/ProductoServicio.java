/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author tomic
 */
public class ProductoServicio {

    private Scanner read;
    private HashMap<String, Double> lista;

    public ProductoServicio() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.lista = new HashMap();
    }

    private Producto crearProducto() {

        Producto p1 = new Producto();

        System.out.println("Ingrese el nombre del producto");
        p1.setNombre(read.next());

        System.out.println("Ingrese el precio");
        p1.setPrecio(read.nextDouble());

        return p1;

    }

    public void cargarProductos() {

        String aux;

        do {

            System.out.println("-------Creando Producto-------");

            Producto p1 = crearProducto();

            System.out.println("Quiere crear otro producto? s/n");

            aux = read.next();

            lista.put(p1.getNombre(), p1.getPrecio());

        } while (aux.equalsIgnoreCase("s"));

    }

    public void mostrarProductos() {

        for (Map.Entry<String, Double> entry : lista.entrySet()) {

            String nombreProducto = entry.getKey();
            Double precioProducto = entry.getValue();

            System.out.println(nombreProducto + ": " + precioProducto + "\n");

        }

    }

    public void cambiarPrecioProducto() {

        System.out.println("Ingrese un producto a modificar");

        String producto = read.next();

        for (Map.Entry<String, Double> entry : lista.entrySet()) {

            String key = entry.getKey();
            Double value = entry.getValue();
            Boolean encontrado = false;

            if (key.equalsIgnoreCase(producto)) {

                System.out.println("Ingrese un nuevo valor");

                entry.setValue(read.nextDouble());

                encontrado = true;

            }

            if (!encontrado) {
                System.out.println("el producto no se encuentra en el listado");
            }

        }

    }

    public void eliminarProducto() {

        System.out.println("Ingrese un producto a eliminar");
        String producto = read.next();

        Iterator<Map.Entry<String, Double>> iterator = lista.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Double> entry = iterator.next();

            if (entry.getKey().equalsIgnoreCase(producto)) {
                iterator.remove();
            }
        }

    }

    public void menu() {

        int respuesta;

        do {

            System.out.println("Ingrese su seleccion: \n"
                    + "1: Agregar Productos \n"
                    + "2: Modificar Producto \n"
                    + "3: Mostrar Productos \n"
                    + "4: Eliminar producto \n"
                    + "5: Salir\n");

            respuesta = read.nextInt();

            switch (respuesta) {

                case 1:
                    cargarProductos();
                    break;
                case 2:
                    cambiarPrecioProducto();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Gracias por usar la APP.");
                    break;

            }

        } while (respuesta != 5);

    }

}
