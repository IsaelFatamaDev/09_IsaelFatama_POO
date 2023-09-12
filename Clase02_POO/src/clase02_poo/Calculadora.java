package clase02_poo;

class Calculadora {

    int num1;
    int num2;
    int resultado;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar(int par) {
        return num1 + num2;
    }

    public int restar(int par) {
        return num1 - num2;
    }

    public int multiplicar(int par) {
        return num1 * num2;
    }

    public int dividir(int par) {
        return num1 / num2;
    }

    public void imprimirResultado() {
        System.out.println(resultado);
    }
}