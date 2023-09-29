package S05_09;

import javax.swing.JOptionPane;

public class Libro_09 {
    String titulo;
    String autor;
    String genero;
    int añoPublicacion;
    String editorial;
    double precio;

    // Métodos
    public void info() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Precio: S/." + precio);
    }

    public void infoJ() {
        String mensaje = "Título: " + titulo + "\nAutor: " + autor + "\nGénero: " + genero
                         + "\nAño de Publicación: " + añoPublicacion + "\nEditorial: " + editorial
                         + "\nPrecio: $" + precio;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Libro", JOptionPane.INFORMATION_MESSAGE);
    }
}
