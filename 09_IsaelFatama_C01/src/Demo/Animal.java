/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author javie
 */
public class Animal {
    // Atributos de la clase Animal
    String tipo;
    String sonido;

    // Constructor con sobrecarga
    public Animal(String tipo, String sonido) {
        this.tipo = tipo;
        this.sonido = sonido;
    }

    public Animal(String tipo) {
        this.tipo = tipo;
        this.sonido = "Sonido desconocido";
    }

    // Método que no recibe parámetros
    public void hacerSonido() {
        System.out.println("El " + tipo + " puede " + sonido);
    }
}
