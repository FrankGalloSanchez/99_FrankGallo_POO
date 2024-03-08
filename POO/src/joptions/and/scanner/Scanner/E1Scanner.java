package joptions.and.scanner.Scanner;
import java.util.Scanner;



public class E1Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidadCalificaciones = scanner.nextInt();
        
        double suma = 0;
        for (int i = 1; i <= cantidadCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }
        
        double promedio = suma / cantidadCalificaciones;
        System.out.println("El promedio de las calificaciones es: " + promedio);
        
        scanner.close();
    }
}
