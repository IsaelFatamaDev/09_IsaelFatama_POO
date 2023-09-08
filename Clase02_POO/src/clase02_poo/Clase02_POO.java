package clase02_poo;

public class Clase02_POO {

    public static void main(String[] args) {
        /*
    }
        Pais obPais = new Pais();

        obPais.preguntar();
        System.out.println(obPais.Nombre());
        System.out.println(obPais.persona());
        System.out.println(obPais.moneda());
        System.out.println(obPais.deuda());
        */
        Calculadora miCalculadora = new Calculadora(10, 5);

        System.out.println("Suma: " + miCalculadora.sumar());
        System.out.println("Resta: " + miCalculadora.restar());
        System.out.println("Multiplicación: " + miCalculadora.multiplicar());
        System.out.println("División: " + miCalculadora.dividir());
        System.out.println("");
        System.out.println("=========");
        System.out.println("");
        System.out.println("Suma con sc: " + miCalculadora.sumar(3));
        System.out.println("Resta con sc: " + miCalculadora.restar(2));
        System.out.println("Multiplicación con sc: " + miCalculadora.multiplicar(4));
        System.out.println("División con sc: " + miCalculadora.dividir(2));

    }

}
