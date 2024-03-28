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
public class S4_R1_Ejercicio01 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 5) + 1;
        int intentos = 0;

        while (true) {
            String respuestaUsuario = JOptionPane.showInputDialog(null, "Adivina un número entre 1 y 5:");
            int numeroUsuario = Integer.parseInt(respuestaUsuario);
            intentos++;
            if (numeroUsuario == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break; 
            } else {
                JOptionPane.showMessageDialog(null, "Incorrecto. Intenta de nuevo.");
            }
        }
    }
}

