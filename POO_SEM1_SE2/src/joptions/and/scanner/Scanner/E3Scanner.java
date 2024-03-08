package joptions.and.scanner.Scanner;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad en años: ");
        int edadAnios = scanner.nextInt();
        
        System.out.print("Ingrese su edad en meses adicionales: ");
        int edadMeses = scanner.nextInt();
        
        System.out.print("Ingrese su edad en días adicionales: ");
        int edadDias = scanner.nextInt();
        
        int totalDias = edadAnios * 365 + edadMeses * 30 + edadDias;
        
        int aniosCalculados = totalDias / 365;
        int mesesCalculados = (totalDias % 365) / 30;
        int diasCalculados = (totalDias % 365) % 30;
        
        System.out.println("Su edad es aproximadamente: " + aniosCalculados + " años, " + mesesCalculados + " meses y " + diasCalculados + " días.");
        
        scanner.close();
    }
}
