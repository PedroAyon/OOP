package unidad1.examen;

/**
 * @author Pedro Ayon
 */
public class Rectangulo {
    private final int base;
    private final int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    private int area() {
        return this.base * this.altura;
    }

    private int perimetro() {
        return this.base * 2 + this.altura * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
               "base =" + base +
               ", altura =" + altura +
               ", area =" + this.area() +
               ", perimetro =" + this.perimetro() +
               '}';
    }
}
