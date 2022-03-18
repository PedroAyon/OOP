package unidad3.empleado;

/**
 * @author Pedro Ayon
 */
public class Empleado {
    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String clasificacion() {
        if (this.edad <= 24) return "Principiante";
        if (this.edad <= 35) return "Intermedio";
        return "Senior";
    }

    public void aumentarSalario(int porcentaje) {
        this.salario = this.salario * (100 + porcentaje) / 100;
    }

    @Override
    public String toString() {
        return "Empleado{" +
               "nombre='" + nombre + '\'' +
               ", cedula='" + cedula + '\'' +
               ", edad=" + edad +
               ", casado=" + casado +
               ", salario=" + salario +
               '}';
    }

}
