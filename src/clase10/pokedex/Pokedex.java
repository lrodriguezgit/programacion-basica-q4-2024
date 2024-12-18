package clase10.pokedex;

import java.util.Map;

public class Pokedex {

    Map<String, String> pokemonData = Map.of(
            "Pikachu", "Este es el pokemon mas grande",
            "Charmander", "Este es el pokemon mas pequeño",
            "Bulbasaur", "Este es el pokemon mas pequeño",
            "Squirtle", "Este es el pokemon mas grande");

    public String getPokemonInfo(String pokemon) {
        if(pokemonData.containsKey(pokemon)) {
            return pokemonData.get(pokemon);
        } else {
            throw new PokemonNotFoundException(pokemon);
        }
    }
}
