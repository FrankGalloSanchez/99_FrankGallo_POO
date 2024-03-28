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
public class R4_CondicionalIf_Ejercicio05 {
    
    public static void main(String[] args) {
        int variable1 = 4;
        int variable2 = 13;

        if (variable1 > variable2) {
            System.out.println(variable1 + " es mayor que " + variable2);
        } else if (variable2 > variable1) {
            System.out.println(variable2 + " es mayor que " + variable1);
        } else {
            System.out.println("Las variables son iguales");
        }
    }
    
}
