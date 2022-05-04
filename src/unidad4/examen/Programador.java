package unidad4.examen;

public class Programador extends Empleado {
    Integer cantidadDeLenguajes;

    public Programador(String nombre, String direccion, String numeroDeTelefono, Integer experiencia, Integer cantidadDeLenguajes) {
        super(nombre, direccion, numeroDeTelefono, experiencia);
        this.cantidadDeLenguajes = cantidadDeLenguajes;
    }

    public void escribirCodigo() {
        System.out.println("System.out.println(\"Hello wolrd!\");");
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Programador {" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                ", experiencia=" + experiencia +
                ", cantidadDeLenguajes=" + cantidadDeLenguajes +
                '}';
    }
}
