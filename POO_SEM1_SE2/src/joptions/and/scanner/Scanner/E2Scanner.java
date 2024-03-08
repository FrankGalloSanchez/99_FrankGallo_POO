/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptions.and.scanner.Scanner;
import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();
        
        double tasaCambio = 1.21;
        
        double euros = dolares * tasaCambio;
        System.out.println("La cantidad equivalente en euros es: " + euros);
        
        scanner.close();
    }
}
   
