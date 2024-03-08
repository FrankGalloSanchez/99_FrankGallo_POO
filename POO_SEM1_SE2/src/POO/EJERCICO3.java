/*Hacer todas las operaciones een una sola salida*/
package POO;

public class EJERCICO3 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 10;
        
        String resultado = "Suma: " + (a + b) + "\n" +
                           "Resta: " + (a - b) + "\n" +
                           "Multiplicación: " + (a * b) + "\n" +
                           "División: " + (a / b);
        
        System.out.println(resultado);
    }
}  
