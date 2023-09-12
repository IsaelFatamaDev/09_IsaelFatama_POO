/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase03_poo;

/**
 *
 * @author javie
 */
public class Persona {

    String nombre;
    int edad;

    public void Nombre() {
        System.out.println("Cristian");
    }

    public void Apellidos() {
        System.out.println("Cueva");
    }

    public void Edad(int edad) {
        System.out.println("Tengo " + edad + " años");
    }

    public void acciones() {
        System.out.println("Estoy Caminando");
    }

    public int edadendias(int edad) {
        return edad * 365;
    }

    public int ObtenerEdad(int par) {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String presentarse() {
        return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
