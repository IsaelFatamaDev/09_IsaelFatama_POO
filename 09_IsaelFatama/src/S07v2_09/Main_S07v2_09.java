package S07v2_09;

public class Main_S07v2_09 {
        public static void main(String[] args) {
        Persona_09 persona1 = new Persona_09();
        persona1.nombre = "Juan";
        persona1.edad = 30;

        Persona_09 persona2 = new Persona_09();
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
