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
public class R4_CondicionalIf_Ejercicio09 {
   
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elige (1 para piedra, 2 para papel, 3 para tijeras): ");
        int eleccionUsuario = scanner.nextInt();

        int eleccionComputadora = (int) (Math.random() * 3) + 1;

        if (eleccionUsuario == eleccionComputadora) {
            System.out.println("Empate.");
        } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                   (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                   (eleccionUsuario == 3 && eleccionComputadora == 2)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡La computadora gana!");
        }

        scanner.close();
    }
}
   