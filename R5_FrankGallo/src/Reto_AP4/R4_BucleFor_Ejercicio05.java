/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_AP4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class R4_BucleFor_Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número para la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
