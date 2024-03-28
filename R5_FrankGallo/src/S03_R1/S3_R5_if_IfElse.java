/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S03_R1;

/**
 *
 * @author user
 */
public class S3_R5_if_IfElse {
    public static void main(String[] args) {
        boolean a = false;
        int b = 5;
        if (a){
            System.out.println("Hola");
        }
         if (a){
            System.out.println("Ejecucion True");
         }else{
             System.out.println("ejecucion false");
        }
         if (b == 10){
             System.out.println("b vale 10");
         }else if (b == 20){
             System.out.println("b vale 20");
         }else if (b == 30){
             System.out.println("b vale 30");
         }else{
             System.out.println("no cumple");
         }
    }
}
