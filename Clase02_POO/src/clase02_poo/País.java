package clase02_poo;

import java.util.Scanner;

public class País {

    String nombre;
    int personas;
    int deuda;
    String moneda;

    public String Nombre() {
        return "El nombre del País es: " + nombre;
    }

    public String persona() {
        return "La cantidad de personas es: " + personas + " en total";
    }

    public String deuda() {
        return "La deuda es: " + deuda + " " + moneda;
    }

    public String moneda() {
        return "La moneda del país es: " + moneda;
    }

    public void preguntar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del país");
        nombre = sc.nextLine();

        System.out.println("Ingresa la cantidad de personas del país");
        String personasStr = sc.nextLine();
        personas = Integer.parseInt(personasStr);

        System.out.println("Ingresa la deuda que tienen");
        String deudaStr = sc.nextLine();
        deuda = Integer.parseInt(deudaStr);

        System.out.println("Ingresa el tipo de moneda que tiene tu país");
        moneda = sc.nextLine();

    }
}
