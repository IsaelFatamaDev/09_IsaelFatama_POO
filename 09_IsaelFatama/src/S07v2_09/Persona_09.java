package S07v2_09;

public class Persona_09 {

    String nombre;
    int edad;

    public String presentarse() {
        return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
    }

    public void Edad() {
        System.out.println("Tengo " + edad + " años");
    }

    public void acciones() {
        System.out.println("Estoy Caminando");
    }

    public int edadEnDias() {
        return edad * 365;
    }

    public int ObtenerEdad(int par) {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean esMayorDeEdad(int edadLimite) {
        return edad >= edadLimite;
    }
}
