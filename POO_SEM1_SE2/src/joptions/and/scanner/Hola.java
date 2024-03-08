package joptions.and.scanner;

import javax.swing.JOptionPane;

public class Hola {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + "!");
    }
}

