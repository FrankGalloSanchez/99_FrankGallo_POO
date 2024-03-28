/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S04_R1;
import javax.swing.JOptionPane;
/**
 *
 * @author Frank Gallo
 */
public class S4_R1_Ejercicio02 {
    public static void main(String[] args) {
        int numeroHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tus números de horas"));

        if (numeroHoras > 8) {
            System.out.println("Trabajaste más de 8 horas");
            int horasExtras = numeroHoras - 8;
            int sueldoTotal = 80 + (horasExtras * 10);
                    
            System.out.println("Tus Horas extras son: " + horasExtras);
            System.out.println("Tus sueldo extras son: " + (horasExtras * 10));
            System.out.println("Tu sueldo es:" + sueldoTotal);
        } else {
            System.out.println("Tu sueldo es: " + (numeroHoras * 10));
        }
    }
}
