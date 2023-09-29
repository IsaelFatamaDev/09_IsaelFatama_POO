package S05_09;

import javax.swing.JOptionPane;

public class Estudiante_09 {
    // Atributos
    String nombre;
    int edad;
    String carrera;
    String universidad;
    String direccion;
    String telefono; 

    // Métodos
    public void mostrarDatosConsola() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Universidad: " + universidad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    public void mostrarDatosJOptionPane() {
        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera
                         + "\nUniversidad: " + universidad + "\nDirección: " + direccion
                         + "\nTeléfono: " + telefono;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
}
