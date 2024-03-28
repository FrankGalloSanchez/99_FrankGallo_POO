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
public class R4_BucleFor_Ejercicio08 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double media = suma / cantidad;
        System.out.println("La media aritmética es: " + media);

        scanner.close();
    }
}
