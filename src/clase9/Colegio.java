package clase9;

import java.util.List;

public class Colegio {
    List<Cursada> cursos;

    public List<Alumno> getAlumnosByProfesor(Profesor profesor) {
        for (Cursada curso : cursos) {
            if (curso.getProfesor().equals(profesor)) {
                return curso.getAlumnos();
            }
        }
        return null;
    }
}
