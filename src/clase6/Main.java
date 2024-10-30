package clase6;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("El viaje", "Alfred Hitchcock", 1959, 120);
        pelicula.setNombre("El viaje 2");

        System.out.println(pelicula);

        Cortometraje cortometraje = new Cortometraje("El viaje corto", "Alfred Hitchcock", 1959, 45, "HD");
        cortometraje.getNombre();
        String formatoVideo = cortometraje.getFormatoVideo();

        //cortometraje.setDuration(60); Tira error porque se ejecuta el metodo setDuration de la clase Cortometraje y no cumple la validacion

        //Se puede asignar una instancia de Cortometraje a una variable de tipo Pelicula
        Pelicula corto = cortometraje;
        corto.setDuration(60); //Esto tira error o no tira error?

        //Se puede asignar una instancia de Pelicula a una variable de tipo Cortometraje ??
        //Cortometraje corto2 = pelicula; //No se puede porque Pelicula no hereda de Cortometraje, es decir no es un cortometraje

    }

}
