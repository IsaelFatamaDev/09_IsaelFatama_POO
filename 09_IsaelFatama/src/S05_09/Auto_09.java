/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_09;

/**
 *
 * @author javie
 */
import java.util.Scanner;

public class Auto_09 {
    // Atributos
    String marca;
    String modelo;
    int año;
    double precio;

    // Métodos
    public void arrancar() {
        System.out.println("El auto está arrancando.");
    }

    public void detener() {
        System.out.println("El auto se ha detenido.");
    }

    public void acelerar() {
        System.out.println("El auto está acelerando.");
    }

    public void frenar() {
        System.out.println("El auto está frenando.");
    }

    public void ingresarDatosDesdeScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del auto: ");
        marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del auto: ");
        modelo = scanner.nextLine();
        System.out.print("Ingrese el año del auto: ");
        año = scanner.nextInt();
        System.out.print("Ingrese el precio del auto: ");
        precio = scanner.nextDouble();
    }
}

