/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Lluís
 */
public class Numeros {

    public static void main(String[] args) {

        int[] array = new int[4];
        
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Introdueix 5 numeros");
            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();
            array[i] = num;

            int auxMenor = array[0];
            
            for (int j = 0; j < array.length; j++) {
                if (array[j] < auxMenor) {
                    auxMenor = array[i];
                }
            }
            
            System.out.println("El número més petit és: " + auxMenor);
        }

        

    }
}
