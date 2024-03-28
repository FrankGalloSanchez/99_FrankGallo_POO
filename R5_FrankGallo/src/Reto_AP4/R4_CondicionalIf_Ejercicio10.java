import java.util.Scanner;

public class R4_CondicionalIf_Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numeroUsuario;

        System.out.println("Adivina el número entre 1 y 100.");

        do {
            System.out.print("Introduce tu adivinanza: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario > numeroAleatorio) {
                System.out.println("Demasiado alto.");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("Demasiado bajo.");
            }
        } while (numeroUsuario != numeroAleatorio);

        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
        scanner.close();
    }
}

