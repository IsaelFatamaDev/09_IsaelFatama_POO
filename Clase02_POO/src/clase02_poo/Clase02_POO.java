package clase02_poo;

public class Clase02_POO {

    public static void main(String[] args) {
        País obPais = new País();

        obPais.preguntar();
        System.out.println(obPais.Nombre());
        System.out.println(obPais.persona());
        System.out.println(obPais.moneda());
        System.out.println(obPais.deuda());

    }

}
