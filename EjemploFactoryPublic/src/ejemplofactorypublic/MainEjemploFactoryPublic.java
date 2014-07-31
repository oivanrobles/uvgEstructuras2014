/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplofactorypublic;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class MainEjemploFactoryPublic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Scanner teclado = new Scanner (System.in);
        String cadena;
   
        System.out.print("Ingrese apellido,nombre o nombre apellido ");
        cadena = teclado.nextLine();
        System.out.println("leyo: "+cadena);
        
        NameFactory _nFactory = new NameFactory();
        
        Namer _namer = _nFactory.getNamer(cadena);
        
        // la Factory instancia la clase adecuada:
         // a. nombre apellido
         // b. apellido,nombre
        System.out.println("Nombre: "+ _namer.getFirst());
        System.out.println("Apellido: " + _namer.getLast());
    }
    
}
