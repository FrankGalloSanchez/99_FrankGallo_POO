/*Tener dos variables y realizar las 4 operaciones pero que se ingrese los datos usando JOptionPane y que el resultado se muestre 1 ventanas con JOptionPane*/
package POO;
import javax.swing.JOptionPane;

public class EJERCICIO7 {
    public static void main(String[] args) {
    String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

     
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);

       
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        
        String mensaje = "La suma es: " + suma + "\n"
                        + "La resta es: " + resta + "\n"
                        + "La multiplicación es: " + multiplicacion + "\n"
                        + "La división es: " + division;

       
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

