package clase9;

import java.util.List;

public class Profesor extends Persona {
    List<Materia> materiasPosibles;

    public void calificar(Alumno alumno, Materia materia, String trimestre, int nota) {
        Libreta libreta = alumno.getLibreta();
        libreta.agregarNota(materia, trimestre, nota);
    }
}
