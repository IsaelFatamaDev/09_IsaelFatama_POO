package actividad_calculadora;

public class Actividad_Calculadora {

    public static void main(String[] args) {
        System.out.println("ACTIVIDAD DE CALCULADORA 1");
        System.out.println("");

        S07_Calculadora1 miCalculadora1 = new S07_Calculadora1();
        miCalculadora1.sumar(5, 3);
        miCalculadora1.restar(10, 4);
        miCalculadora1.multiplicar(7, 6);
        miCalculadora1.dividir(8, 2);
        miCalculadora1.dividir(6, 0);
        System.out.println("");
        System.out.println("ACTIVIDAD DE CALCULADORA 2");
        System.out.println("");

        S07_Calculadora2 miCalculadora2 = new S07_Calculadora2();
        int resultadoSuma = miCalculadora2.sumar(5, 3);
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = miCalculadora2.restar(10, 4);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultiplicacion = miCalculadora2.multiplicar(7, 6);
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        S07_Calculadora2.dividir(8, 2);
        S07_Calculadora2.dividir(6, 0);
    }
}
