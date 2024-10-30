package clase6;

//Herencia
public class Cortometraje extends Pelicula {

    private String formatoVideo;

    //Constructor
    public Cortometraje(String nombre, String director, int releaseYear, int duration, String formatoVideo) {
        super(nombre, director, releaseYear, duration);
        this.formatoVideo = formatoVideo;
    }

    public String getFormatoVideo() {
        return formatoVideo;
    }

    @Override
    public void setDuration(int duration) {
        if(duration > 45) {
            throw new IllegalArgumentException("La duracion de un cortometraje no puede ser mayor a 45");
        }
        super.setDuration(duration);
    }
}
