/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author javie
 */
public class Persona {
    // Atributos de la clase Persona
    String nombre;
    int edad;

    // Constructor con sobrecarga
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que no recibe parámetros
    public void saludar() {
        System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Método sobrecargado que recibe un mensaje como parámetro
    public void saludar(String mensaje) {
        System.out.println(mensaje + " Soy " + nombre + " y tengo " + edad + " años.");
    }
}

