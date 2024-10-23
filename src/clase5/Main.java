package clase5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("random", "Es un aleatorio");
        diccionario.get("random");

        Map<String, List<Integer>> libretaDeNotas = new HashMap<>();
        libretaDeNotas.put("matematica", new ArrayList<>(List.of(7, 8, 9)));
        libretaDeNotas.get("matematica").add(10);

        if (libretaDeNotas.containsKey("lengua")) {
            List<Integer> notasLengua = libretaDeNotas.get("lengua");
            notasLengua.add(10);
        } else {
            libretaDeNotas.put("lengua", new ArrayList<>(List.of(10)));
        }

        List<Integer> notasEF = libretaDeNotas.getOrDefault("educacion fisica", new ArrayList<>());
        notasEF.add(10);
        libretaDeNotas.put("educacion fisica", notasEF);
        /* Representacion visual de libretaDeNotas
        {
            matematica: [7, 8, 9, 10],
            lengua: [10],
            educacion fisica: [10]
        }
        */

        //La busqueda en un mapa es mucho muy rapida
        List<String> materias = List.of("lengua", "matematica", "ef");
        materias.contains("ef"); //Hace una busqueda lineal, lo que significa que recorre todos los elementos en el peor caso -> O(n) siendo n la cantidad de elementos
        // [ "lengua", "matematica", "ef" ]

        Map<String, Integer> promedios = new HashMap<>();
        promedios.put("matematica", 7);
        promedios.put("lengua", 8);
        promedios.put("ef", 9);

        // Como funciona un mapa por dentro:
        // Hay una funciona que se llama hashCode() y devuelve un entero que representa el objeto
        // hashCode("matematica") -> 1249879 % 10 -> 9  // El hashcode se resuelve en O(1)
        // hashCode("lengua") -> 4  // El hashcode se resuelve en O(1)
        // El mapa guarda el elemento en la posicion que tiene el hashcode de la clave
        // [        (lengua,8)            (matematica,7)    ]
        //   0 1 2 3     4        5 6 7 8       9        10
        // promedios.get("matematica") -> 7

        // EL hashcode puede dar igual para dos claves distintas
        // hashCode("ef") -> 9
        // A esto se le llama colision y se puede resolver de muchas formas, una de ellas es guardando una lista de valores en la misma posicion
        // [        (lengua,8)            [(matematica,7),(ef,9)]      ]
        //   0 1 2 3     4        5 6 7 8            9              10

        // Un mapa para salvar memoria empieza con un array de pocas posiciones y a medida que se va llenando cuando llega a un
        // punto critico definido (depende de cada implementacion de mapa) tiene que agrandarse.
        // [         (lengua,8)                                               (ef,9)        (matematica,7)                      ]
        //   0 1 2 3     4        5 6 7 8            9              10          34                 79                      100

        //Para obtener los datos dentro de un mapa, es muy util para poder iterarlos
       Set<String> keys = promedios.keySet();
       Collection<Integer> values = promedios.values();
       Set<Map.Entry<String, Integer>> entries = promedios.entrySet();

       //Para transformar una lista a un mapa se usa la funcion collect
        List<String> materiasValidas = List.of("matematica", "lengua", "ef");
        Map<String, Boolean> materiasValidasMap = materiasValidas.stream()
                .collect(Collectors.toMap(materia -> {
                    String hola = "hola";
                    return materia + hola;
                }, materia -> true));
        //La primer funcion lambda devuelve la clave y la segunda devuelve el valor

    }
}
