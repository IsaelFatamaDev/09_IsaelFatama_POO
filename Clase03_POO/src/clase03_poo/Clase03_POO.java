package clase03_poo;

public class Clase03_POO {

    /* Crear 1 clase persona
    -Atributos
    -Métodos
    -Sobrecarga de métodos
    -Métodos con valores de retornos (Mínimo 3 tipos de datos diferentes)
    -2 métodos con parámetros y argumentos   
    -Crear 2 objetos */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 25;

        Persona persona2 = new Persona();
        persona2.nombre = "María";
        persona2.edad = 30;

        persona1.Nombre();
        persona1.Edad(persona1.edad);
        persona1.acciones();
        System.out.println("La edad de " + persona1.getNombre() + " en días es: " + persona1.edadendias(persona1.edad));

        persona2.Apellidos();
        persona2.Edad(persona2.edad);
        persona2.acciones();
        System.out.println("La edad de " + persona2.getNombre() + " en días es: " + persona2.edadendias(persona2.edad));

    }

}
