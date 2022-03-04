package unidad1.fracciones;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(5, 3);
        Fraccion fraccion2 = new Fraccion(3, 5);

        Fraccion suma = fraccion1.sumar(fraccion2);
        System.out.println(suma);

        Fraccion resta = fraccion1.restar(fraccion2);
        System.out.println(resta);

        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        System.out.println(multiplicacion);

        Fraccion division = fraccion1.dividir(fraccion2);
        System.out.println(division);

    }
}
