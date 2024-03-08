package joptions.and.scanner;
import java.util.Scanner;


public class JOptionsE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = scanner.next();
        
        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}
