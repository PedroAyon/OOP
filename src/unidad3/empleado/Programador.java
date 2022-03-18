package unidad3.empleado;

/**
 * @author Pedro Ayon
 */
public class Programador extends Empleado {
    int lineasDeCodigoPorHora;
    String lenguajeFavorito;

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeFavorito) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeFavorito = lenguajeFavorito;
    }

    @Override
    public String clasificacion() {
        return super.clasificacion();
    }

    @Override
    public String toString() {
        return "Programador{" +
               "nombre='" + nombre + '\'' +
               ", cedula='" + cedula + '\'' +
               ", edad=" + edad +
               ", casado=" + casado +
               ", salario=" + salario +
               ", lineasDeCodigoPorHora=" + lineasDeCodigoPorHora +
               ", lenguajeFavorito='" + lenguajeFavorito + '\'' +
               '}';
    }

    public void programar() {
        System.out.println("Estoy programando en " + this.lenguajeFavorito);
    }

}
