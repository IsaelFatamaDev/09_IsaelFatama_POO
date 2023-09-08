package clase02_poo;

public class Calculadora {
    // Atributos
    private int numero1;
    private int numero2;


    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void numero1(int numero1) {
        this.numero1 = numero1;
    }

    public void numero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public int dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        return 0;
    }

    public int sumar(int num) {
        return numero1 + num;
    }

    public int restar(int num) {
        return numero1 - num;
    }

    public int multiplicar(int num) {
        return numero1 * num;
    }

    public int dividir(int num) {
        if (num != 0) {
            return numero1 / num;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        return 0;
    }
}
