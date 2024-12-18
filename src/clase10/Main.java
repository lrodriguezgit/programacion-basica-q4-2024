package clase10;

import clase10.pokedex.Pokedex;
import clase10.pokedex.PokemonNotFoundException;

public class Main {

    public static void main(String[] args) {
        Integer numero = null;
        try {
            //numero.toString();
            //capturarPokemon("asd");
            atraparPokemon("Pikachuuu");
            String hola = "Esto nunca se va a ejecutar";
            System.out.println(hola);
        } catch (CalienteException ex) {
            ex.printStackTrace();
        } catch (CapturameException ex) {
            ex.printStackTrace();
            ex.getPokemon();
            numero = 0;
        } catch (RuntimeException ex) { //Podemos capturar genericamente todas las exceptions o runtimeExceptions
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(numero);
    }

    //Usamos throws para delegar el control de la exception a quien llama a la funcion
    public static String capturarPokemon(String pokemon) throws CapturameException {
        if (pokemon.equals("Pikachu")) {
            return "Pikachu";
        } else if (pokemon.equals("Charmander")) {
            //Esta exception NO es necesario que la capturemos por ser una RuntimeException
            throw new CalienteException("Ese pokemon esta muy caliente");
        }
        //Esta exception tenemos que capturarla si o si por ser una Exception
        throw new CapturameException("No puedes capturar este pokemon", pokemon);
    }

    public static String atraparPokemon(String pokemon) throws CapturameException {
        Pokedex pokedex = new Pokedex();
        try {
            return pokedex.getPokemonInfo(pokemon);
        } catch (PokemonNotFoundException ex) {
            throw new CapturameException("No puedes capturar este pokemon", pokemon, ex);
        }
    }

}
