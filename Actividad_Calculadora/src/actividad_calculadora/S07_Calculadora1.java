package actividad_calculadora;

public class S07_Calculadora1 {

    public void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }

    public void restar(int a, int b) {
        int resultado = a - b;
        System.out.println("La resta de " + a + " y " + b + " es: " + resultado);
    }

    public void multiplicar(int a, int b) {
        int resultado = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
    }

    public void dividir(int a, int b) {
        if (b != 0) {
            double resultado = (double) a / b;
            System.out.println("La división de " + a + " y " + b + " es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
