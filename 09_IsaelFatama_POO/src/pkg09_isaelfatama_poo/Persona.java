package pkg09_isaelfatama_poo;

import java.util.Scanner;

public class Persona {

    // Atributos
    String nombres;
    int edad;

    // Métodos
    public void preguntarPersona() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre de la persona: ");
        nombres = scanner.nextLine();
        
        System.out.print("Ingresa la edad: ");
        String edadStr = scanner.nextLine();
        edad = Integer.parseInt(edadStr);
        System.out.println("");
    }

    public void hablar() {
        System.out.println("Hola soy " + nombres);
    }

    public void edad() {
        System.out.println("Tengo " + edad + " años");
    }

    public void orden() {
        System.out.println("Oye " + nombres + ", levanta la mano");
    }

    public void presentarPersona() {
        System.out.println("");
        System.out.println("   ===============  ");
        System.out.println("   ==  PERSONAS ==  ");
        System.out.println("   ===============  ");
        System.out.println("");
    }
}