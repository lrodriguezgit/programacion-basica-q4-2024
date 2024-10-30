package clase6;

//Esto asi como esta es un pojo
public class Pelicula {
    //Atributos
    private String nombre; //Abstraccion y encapsulamiento
    private String director;
    private int releaseYear; //Private es un modificador de acceso que solo permite acceso a la propia clase
    protected int duration; //Protected es un modificador de acceso que solo permite acceso a la propia clase o a sus descendientes

    public String sinopsis; //Public es un modificador de acceso que permite acceso a todas las clases
    //WARNING: no se suele hacer atributos public para poder mantener la abstraccion y encapsulamiento

    //Constructor
    public Pelicula(String nombre, String director, int releaseYear, int duration) {
        this.nombre = nombre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    //Metodos
    public String getNombre() {
        return nombre.toString();
    }

    public void setNombre(String nombre) {
        if(nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres");
        }
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
