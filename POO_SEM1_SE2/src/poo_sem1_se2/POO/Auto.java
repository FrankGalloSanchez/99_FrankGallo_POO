package poo_sem1_se2.POO;

import java.util.Scanner;

public class Auto {
    private String marca;
    private String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del auto:");
        String marca = scanner.nextLine();
        
        System.out.println("Ingrese el modelo del auto:");
        String modelo = scanner.nextLine();
        
        Auto auto = new Auto(marca, modelo);
        auto.mostrarDatos();
        
        scanner.close();
    }
}
