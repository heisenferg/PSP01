/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero;
        ArrayList <Integer> numeros = new ArrayList <Integer>();
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(entrada);
        String lineateclado = null;
        try {
            System.out.println("Proceso lector...");
            while ((lineateclado = bf.readLine()) != null) {
                numero = bf.readLine();
                numeros.add(Integer.parseInt(numero));
            //    Collections.sort(numeros);

            }
            Collections.sort(numeros);
            System.out.println("Números ordenados :" + numeros);
        } catch (IOException ex) {
            System.err.println("Error de escritura");
            System.err.println(ex.toString());
        }

    }

}
