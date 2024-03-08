/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptions.and.scanner.Scanner;

import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola, " + nombre + "!");
        
        scanner.close();
    }
}
