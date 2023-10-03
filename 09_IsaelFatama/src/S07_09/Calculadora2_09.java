/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_09;

/**
 *
 * @author LAB_1
 */
public class Calculadora2_09 {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void dividir(int a, int b) {
        if (b != 0) {
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}