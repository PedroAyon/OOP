package unidad1y2.fracciones;

/**
 * @author Pedro Ayon
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 5;
        this.denominador = 5;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion fraccion) {
        if (this.denominador == fraccion.denominador) {
            return new Fraccion(this.numerador + fraccion.numerador, this.denominador);
        } else {
            int numerador = this.numerador * fraccion.denominador + fraccion.numerador * this.denominador;
            int denominador = this.denominador * fraccion.denominador;
            return new Fraccion(numerador, denominador);
        }
    }

    public Fraccion restar(Fraccion fraccion) {
        if (this.denominador == fraccion.denominador) {
            return new Fraccion(this.numerador - fraccion.numerador, this.denominador);
        } else {
            int numerador = this.numerador * fraccion.denominador - fraccion.numerador * this.denominador;
            int denominador = this.denominador * fraccion.denominador;
            return new Fraccion(numerador, denominador);
        }
    }
    
    public Fraccion multiplicar(Fraccion fraccion) {
        int numerador = this.numerador * fraccion.numerador;
        int denominador = this.denominador * fraccion.denominador;
        return new Fraccion(numerador, denominador);
    }
    
    public Fraccion dividir(Fraccion fraccion) {
        int numerador = this.numerador * fraccion.denominador;
        int denominador = this.denominador * fraccion.numerador;
        return new Fraccion(numerador, denominador);
    }

    @Override
    public String toString() {
        return "Fracción: " + this.numerador + " / " + this.denominador;
    }
}
