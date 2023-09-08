package pkg09_isaelfatama_poo;

import javax.swing.JOptionPane;

public class Auto {

    String marca;
    String color;
    String velocidadStr;
    int velocidad;

    public void mostrarMarca() {
        String mensaje = "La marca del carro es: " + marca + "\n"
                + "El color del carro es: " + color + "\n"
                + "La velocidad del carro es: " + velocidad + " Km/h";

        JOptionPane.showMessageDialog(null, mensaje, "Información del Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    public void detener() {
        velocidad = 0;
        JOptionPane.showMessageDialog(null, "El carro se ha detenido por completo.", "Detener Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cambiarColor() {
        String nuevoColor = JOptionPane.showInputDialog("Ingrese el nuevo color del carro:");
        color = nuevoColor;
        JOptionPane.showMessageDialog(null, "El color del carro se ha cambiado a " + color + ".", "Cambio de Color", JOptionPane.INFORMATION_MESSAGE);
    }

    public void preguntarMarca() {
        marca = JOptionPane.showInputDialog("Ingrese la marca del carro:");
        JOptionPane.showMessageDialog(null, "La marca del carro se ha establecido como: " + marca, "Marca del Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    public void preguntarga() {
        marca = JOptionPane.showInputDialog("Ingrese la marca del automóvil:");
        color = JOptionPane.showInputDialog("Ingrese el color del automóvil:");
        velocidadStr = JOptionPane.showInputDialog("Ingrese la velocidad inicial del automóvil (en km/h):");
        velocidad = Integer.parseInt(velocidadStr);
    }

    public void presentarAuto() {
        System.out.println("");
        System.out.println("===============");
        System.out.println("====AUTOS======");
        System.out.println("===============");
        System.out.println("");
    }
}
