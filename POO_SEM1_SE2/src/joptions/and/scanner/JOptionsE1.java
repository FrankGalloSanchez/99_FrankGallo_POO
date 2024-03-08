package joptions.and.scanner;

import javax.swing.JOptionPane;

public class JOptionsE1 {
    public static void main(String[] args) {
        String inputBase = JOptionPane.showInputDialog("<html><h2 style='color: #2E86C1;'>Ingrese la base del rectángulo:</h2></html>");
        double base = Double.parseDouble(inputBase);
        
        String inputAltura = JOptionPane.showInputDialog("<html><h2 style='color: #2E86C1;'>Ingrese la altura del rectángulo:</h2></html>");
        double altura = Double.parseDouble(inputAltura);
        
        double area = base * altura;
        
        JOptionPane.showMessageDialog(null, "<html><h2 style='color: #2E86C1;'>El área del rectángulo es: " + area + "</h2></html>");
    }
}
