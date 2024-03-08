package poo_sem1_se2.POO;

import javax.swing.JOptionPane;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Título: " + titulo + "\nAutor: " + autor);
    }

    public static void main(String[] args) {
        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        
        Libro libro = new Libro(titulo, autor);
        libro.mostrarDatos();
    }
}
