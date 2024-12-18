package clase10;

public class CapturameException extends Exception {

    String pokemon; //Las exceptions son clases y pueden tener atributos y metodos propios

    public CapturameException(String mensaje, String pokemon) {
        super("Error capturando pokemon: " + pokemon + mensaje);
        this.pokemon = pokemon;
    }

    public CapturameException(String mensaje, String pokemon, Throwable cause) {
        super("Error capturando pokemon: " + pokemon + mensaje, cause);
        this.pokemon = pokemon;
    }

    public String getPokemon() {
        return pokemon;
    }
}
