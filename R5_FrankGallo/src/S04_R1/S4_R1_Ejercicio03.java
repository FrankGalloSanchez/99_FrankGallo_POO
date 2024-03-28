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
public class S4_R1_Ejercicio03 {
    public static void main(String[] args) {
        
        int A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número (A):"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número (B):"));

        if (A % 2 == 0 && B % 2 == 0) {
            JOptionPane.showMessageDialog(null, "A es par y B es par.");
        }
        else if (A % 2 != 0 && B % 2 != 0) {
            JOptionPane.showMessageDialog(null, "A es impar y B es impar.");
        }
        else if (A % 2 != 0 && B % 2 == 0) {
            JOptionPane.showMessageDialog(null, "A es impar y B es par.");
        }
        else {
            JOptionPane.showMessageDialog(null, "A es par y B es impar.");
        }
    }
}
