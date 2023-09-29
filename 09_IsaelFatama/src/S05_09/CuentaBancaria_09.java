/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_09;

/**
 *
 * @author javie
 */
import java.util.Scanner;

public class CuentaBancaria_09 {
    // Atributos
    String titular;
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // Métodos
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han ingresado $" + cantidad + " en la cuenta.");
    }

    public void retirarDinero(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se han retirado S/." + cantidad + " de la cuenta.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: S/." + saldo);
    }

    public void cambiarTipoCuenta(String nuevoTipo) {
        tipoCuenta = nuevoTipo;
        System.out.println("El tipo de cuenta se ha cambiado a: " + nuevoTipo);
    }

    public void ingresarDatosDesdeScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el titular de la cuenta: ");
        titular = scanner.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        saldo = scanner.nextDouble();
        System.out.print("Ingrese el tipo de cuenta: ");
        tipoCuenta = scanner.next();
    }
}

