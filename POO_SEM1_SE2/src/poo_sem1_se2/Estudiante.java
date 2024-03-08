package poo_sem1_se2;
import javax.swing.JOptionPane;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad);
    }

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        
        Estudiante estudiante = new Estudiante(nombre, edad);
        estudiante.mostrarDatos();
    }
}
