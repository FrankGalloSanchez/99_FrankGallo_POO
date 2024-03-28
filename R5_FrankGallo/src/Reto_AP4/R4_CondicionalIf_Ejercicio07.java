/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_AP4;

/**
 *
 * @FrankGallo
 */
public class R4_CondicionalIf_Ejercicio07 {
    
    public static void main(String[] args) {
        double montoCompra = 850.0;
        double descuento = 0.0;

        if (montoCompra > 100) {
            descuento = 0.1; // 10% de descuento
        } else if (montoCompra > 50) {
            descuento = 0.05; // 5% de descuento
        }

        double precioTotal = montoCompra * (1 - descuento);
        System.out.println("El precio total de la compra es: " + precioTotal);
    }
}
