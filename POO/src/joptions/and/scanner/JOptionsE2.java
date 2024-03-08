package joptions.and.scanner;
    import javax.swing.JOptionPane;

public class JOptionsE2 {
    public static void main(String[] args) {
        String inputCelsius = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
        double celsius = Double.parseDouble(inputCelsius);
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: " + fahrenheit);
    }
}