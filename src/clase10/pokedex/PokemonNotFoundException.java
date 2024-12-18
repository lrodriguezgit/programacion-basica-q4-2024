package clase10.pokedex;

public class PokemonNotFoundException extends RuntimeException {
    public PokemonNotFoundException(String pokemon) {
        super("No existe el pokemon " + pokemon);
    }
}
