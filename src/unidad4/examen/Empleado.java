package unidad4.examen;

public abstract class Empleado {
    public String nombre;
    public String direccion;
    public String numeroDeTelefono;
    public Integer experiencia;

    public Empleado(String nombre, String direccion, String numeroDeTelefono, Integer experiencia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDeTelefono = numeroDeTelefono;
        this.experiencia = experiencia;
    }

    public abstract void imprimir();

}
