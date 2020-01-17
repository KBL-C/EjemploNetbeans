/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogithub;

import java.util.Scanner;

/**
 *
 * @author ITP1DAM
 */
public class EjemploGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        Scanner sci = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número");
        numero = sci.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numero *1);
        }
        
    }
    
}
