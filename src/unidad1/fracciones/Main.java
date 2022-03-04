package unidad1.fracciones;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(5, 3);
        Fraccion fraccion2 = new Fraccion(3, 5);

        System.out.println("Fraccion 1 -> " + fraccion1);
        System.out.println("Fraccion 2 -> " + fraccion2);

        Fraccion suma = fraccion1.sumar(fraccion2);
        System.out.println("Suma -> " + suma);

        Fraccion resta = fraccion1.restar(fraccion2);
        System.out.println("Resta -> " + resta);

        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        System.out.println("Multiplicacion -> " + multiplicacion);

        Fraccion division = fraccion1.dividir(fraccion2);
        System.out.println("Division -> " + division);

    }
}
