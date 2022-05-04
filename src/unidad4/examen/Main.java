package unidad4.examen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Programador(
                "Pedro",
                "CalleX #809, Ciudad Madero, Tamaulipas",
                "8331234567",
                3,
                8
        ));

        empleados.add(new Gerente(
                "Juan",
                "CalleZ #103, Tampico, Tamaulipas",
                "8339876543",
                10,
                50
        ));

        for (Empleado empleado : empleados) {
            if (empleado instanceof Programador)
                ((Programador) empleado).escribirCodigo();
            else if (empleado instanceof Gerente)
                ((Gerente) empleado).reporteEstatusProyecto();
            empleado.imprimir();
        }
    }
}
