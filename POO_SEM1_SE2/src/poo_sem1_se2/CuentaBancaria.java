package poo_sem1_se2;

import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        String titular = scanner.nextLine();
        
        System.out.println("Ingrese el saldo de la cuenta:");
        double saldo = scanner.nextDouble();
        
        CuentaBancaria cuenta = new CuentaBancaria(titular, saldo);
        cuenta.mostrarDatos();
        
        scanner.close();
    }
}
