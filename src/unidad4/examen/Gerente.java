package unidad4.examen;

public class Gerente extends Empleado {
    Integer miembrosDelEquipo;

    public Gerente(String nombre, String direccion, String numeroDeTelefono, Integer experiencia, Integer miembrosDelEquipo) {
        super(nombre, direccion, numeroDeTelefono, experiencia);
        this.miembrosDelEquipo = miembrosDelEquipo;
    }

    public void reporteEstatusProyecto() {
        System.out.println("El proyecto va bien 👍");
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Gerente {" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                ", experiencia=" + experiencia +
                ", miembrosDelEquipo=" + miembrosDelEquipo +
                '}';
    }
}
