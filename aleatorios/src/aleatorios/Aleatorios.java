/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorios;

import java.util.Random;

/**
 *
 * @author fernando
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] numeros = new int[80];
        
       for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100);
            System.out.println(numeros[i]);
        }
       
    }
    
}
