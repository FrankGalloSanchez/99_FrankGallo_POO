package POO;
import javax.swing.JOptionPane;

public class EJERCICIO5 {
    public static void main(String[] args) {

        String inputNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        double numero1 = Double.parseDouble(inputNumero1);
        
        String inputNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double numero2 = Double.parseDouble(inputNumero2);
        
        double resultado = numero1 + numero2;
        
        System.out.println("El resultado es: " + resultado);     
    }
}
