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
public class R4_CondicionalIf_Ejercicio03 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("La diferencia entre el mayor y el menor es: " + diferenciaMayorMenor(num1, num2));
        
        scanner.close();
    }
    
    public static double diferenciaMayorMenor(double num1, double num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else if (num2 > num1) {
            return num2 - num1;
        } else {
            return 0;
        }
    }
      
}
