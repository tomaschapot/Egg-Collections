/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections4;

import servicios.PaisService;

/**
 *
 * @author tomic
 */
public class Collections4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisService pS = new PaisService();
        
        pS.paisFactory();
        pS.mostrarLista();
        pS.ordenarPaisesPorNombre();
        pS.removerPais("totopa");
        pS.mostrarLista();
    }
    
}
