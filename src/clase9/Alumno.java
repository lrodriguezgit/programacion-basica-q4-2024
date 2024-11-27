package clase9;

public class Alumno extends Persona {
    private Libreta libreta; //Un alumno TIENE una libreta

    public double getPromedio(Materia materia) {
        return libreta.getPromedio(materia);
    }

    public Libreta getLibreta() {
        return libreta;
    }
}
