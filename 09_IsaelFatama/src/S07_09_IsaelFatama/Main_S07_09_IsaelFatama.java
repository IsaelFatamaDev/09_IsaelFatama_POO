/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_09_IsaelFatama;

/**
 *
 * @author LAB_1
 */
public class Main_S07_09_IsaelFatama {
    public static void main(String[] args) {
        System.out.println("ACTIVIDAD DE CALCULADORA 1");
        System.out.println("");

        S07_Calculadora1 miCalculadora1 = new S07_Calculadora1();
        miCalculadora1.sumar(5, 3);
        miCalculadora1.restar(15, 4);
        miCalculadora1.multiplicar(2, 1);
        miCalculadora1.dividir(8, 2);
        miCalculadora1.dividir(6, 0);
        System.out.println("");
        System.out.println("ACTIVIDAD DE CALCULADORA 2");
        System.out.println("");

        S07_Calculadora2 cal2 = new S07_Calculadora2();
        int resultadoSuma = cal2.sumar(3, 2);
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = cal2.restar(10, 4);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultiplicacion = cal2.multiplicar(7, 6);
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        S07_Calculadora2.dividir(8, 2);
        S07_Calculadora2.dividir(6, 0);
    }
}
