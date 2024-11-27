package clase9;

public class Nota {
    String trimestre;
    Integer nota;

    public Nota(String trimestre, int nota) {
        this.trimestre = trimestre;
        this.nota = nota;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
