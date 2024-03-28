/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_AP4;

import java.util.Scanner;

/**
 *
 * @FrankGallo
 */
public class R4_CondicionalIf_Ejercicio01 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

    }
    
}
