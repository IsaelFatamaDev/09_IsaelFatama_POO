package pkg09_isaelfatama_poo;

public class Main {

    public static void main(String[] args) {

        Presentacion obpresentacion = new Presentacion();
        obpresentacion.presentacionScanner();

        //CALCULADORA
        Calculadora objcalculadora = new Calculadora();
        objcalculadora.presentar();
        objcalculadora.preguntar();
        objcalculadora.suma();
        objcalculadora.resta();
        objcalculadora.multiplicar();
        objcalculadora.dividir();
        objcalculadora.responder();

        //PERSONA
        Persona persona = new Persona();
        persona.presentarPersona();
        persona.preguntarPersona();
        persona.hablar();
        persona.edad();
        persona.orden();

        //ANIMAL
        obpresentacion.presentacionOption();
        Animal obAnimal = new Animal();
        obAnimal.preguntarAnimal();
        obAnimal.informacionAnimal();

        //AUTO
        Auto obAuto = new Auto();
        obAuto.presentarAuto();
        obAuto.preguntarga();
        obAuto.mostrarMarca();
        obAuto.cambiarColor();
        obAuto.detener();

    }

}
