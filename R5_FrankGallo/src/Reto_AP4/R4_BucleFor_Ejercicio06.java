/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_AP4;

import java.util.Scanner;

/**
 *
 * @author FrankGallo
 */
public class R4_BucleFor_Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas que las luces estarán apagadas: ");
        int horasApagadas = scanner.nextInt();

        double costoEnergiaPorHora = 0.12;
        double costoBombilla = 1.5;

        double ahorroEnergia = horasApagadas * costoEnergiaPorHora;
        double ahorroBombillas = horasApagadas / 5000.0 * costoBombilla;

        System.out.println("Ahorro de energía por " + horasApagadas + " horas: S/" + ahorroEnergia);
        System.out.println("Ahorro de bombillas por " + horasApagadas + " horas: S/" + ahorroBombillas);

        scanner.close();
    }
}
