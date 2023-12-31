package clase03_poo;

public class Clase03_POO {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 30;

        Persona persona2 = new Persona();
        persona2.nombre = "María";
        persona2.edad = 12;

        System.out.println(persona1.presentarse());
        persona1.Edad();

        System.out.println("La edad de " + persona1.getNombre() + " en días es: " + persona1.edadEnDias());
        System.out.println("¿Es mayor de edad? " + (persona1.esMayorDeEdad() ? "Sí" : "No"));

        System.out.println();

        System.out.println(persona2.presentarse());
        persona2.Edad();
        System.out.println("La edad de " + persona2.getNombre() + " en días es: " + persona2.edadEnDias());
        System.out.println("¿Es mayor de 18 años? " + (persona2.esMayorDeEdad() ? "Sí" : "No"));
    }
}
