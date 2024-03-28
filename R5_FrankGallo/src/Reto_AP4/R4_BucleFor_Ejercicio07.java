/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_AP4;
import java.util.Random;
/**
 *
 * @author FrankGallo
 */
public class R4_BucleFor_Ejercicio07 {
        public static void main(String[] args) {
        int longitud = 8; 
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            contrasena.append(caracter);
        }

        System.out.println("Contraseña generada: " + contrasena.toString());
    }
}
