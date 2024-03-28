    package Reto_AP4;

    import java.util.Scanner;

    public class R4_CondicionalIf_Ejercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            if (num1 >= 0) {
                System.out.println(num1 + " es positivo");
            } else {
                System.out.println(num1 + " es negativo");
            }

            if (num2 >= 0) {
                System.out.println(num2 + " es positivo");
            } else {
                System.out.println(num2 + " es negativo");
            }

            scanner.close();
        }
    }
