/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Demo;

/**
 *
 * @author javie
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objetos de Persona y Animal
        Persona persona1 = new Persona("Javier", 17);
        Persona persona2 = new Persona("María",14);
        Animal animal1 = new Animal("Perro", "ladrar");

        // Llamar a métodos sobrecargados
        persona1.saludar();
        persona2.saludar("Hola que tal :)");
        System.out.println("");
        animal1.hacerSonido();
    }
    
}
