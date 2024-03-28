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
public class R4_BucleFor_Ejercicio09 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de la moneda original: ");
        double cantidad = scanner.nextDouble();

        System.out.print("Ingrese la tasa de cambio: ");
        double tasaCambio = scanner.nextDouble();

        double cantidadConvertida = cantidad * tasaCambio;

        System.out.println("La cantidad convertida es: " + cantidadConvertida);

        scanner.close();
    }
}
