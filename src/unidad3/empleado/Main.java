package unidad3.empleado;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Empleado empleado = new Empleado("Juan", "1234", 18, false, 100);
        empleado.aumentarSalario(50);
        System.out.println(empleado);

        Programador programador = new Programador("Pedro", "1234", 18, false, 100, 500, "Java");
        programador.aumentarSalario(50);
        System.out.println(programador);
        programador.programar();
    }
}
