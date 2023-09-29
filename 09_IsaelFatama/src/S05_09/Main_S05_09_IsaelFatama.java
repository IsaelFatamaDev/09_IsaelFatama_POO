package S05_09;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_S05_09_IsaelFatama {

    public static void main(String[] args) {
        Libro_09 libro = new Libro_09();

        libro.titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        libro.autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        libro.genero = JOptionPane.showInputDialog("Ingrese el género del libro:");
        libro.añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del libro:"));
        libro.editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro:");
        libro.precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro:"));

        libro.infoJ();

        Estudiante_09 estudiante = new Estudiante_09();

        estudiante.nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        estudiante.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        estudiante.carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante:");
        estudiante.universidad = JOptionPane.showInputDialog("Ingrese la universidad del estudiante:");
        estudiante.direccion = JOptionPane.showInputDialog("Ingrese la dirección del estudiante:");
        estudiante.telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del estudiante:");

        estudiante.mostrarDatosJOptionPane();

        Scanner scanner = new Scanner(System.in);

        CuentaBancaria_09 cuenta = new CuentaBancaria_09();
        System.out.println("Ingrese los datos de la cuenta bancaria:");
        cuenta.ingresarDatosDesdeScanner();

        Auto_09 auto = new Auto_09();
        System.out.println("\nIngrese los datos del auto:");
        auto.ingresarDatosDesdeScanner();

        cuenta.ingresarDinero(1000);
        cuenta.retirarDinero(500);
        cuenta.consultarSaldo();
        cuenta.cambiarTipoCuenta("Ahorros");

        auto.arrancar();
        auto.acelerar();
        auto.frenar();
        auto.detener();
    }
}
