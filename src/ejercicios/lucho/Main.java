package ejercicios.lucho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2, 5)));

        // do a huge list of strings
        List<String> materiasValidas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            materiasValidas.add(UUID.randomUUID().toString());
        }

        List<String> materiasPorValidar = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            materiasPorValidar.add(UUID.randomUUID().toString());
        }

        long startTime2 = System.nanoTime();
        int diferencias2 = isValid(materiasPorValidar, materiasValidas);
        long endTime2 = System.nanoTime();

        System.out.println("Tiempo: " + (endTime2 - startTime2)/1000000 + " milisegundos");
        System.out.println("Diferencias: " + diferencias2);

        long startTime = System.nanoTime();
        int diferencias = isValidLento(materiasPorValidar, materiasValidas);
        long endTime = System.nanoTime();

        System.out.println("Tiempo: " + (endTime - startTime)/1000000 + " milisegundos");
        System.out.println("Diferencias: " + diferencias);
    }

    public static int[] countBy(int x, int n){
        List<Integer> multiplos = new ArrayList<>();
        int last = x;
        for (int i = 0; i < n; i++) {
            multiplos.add(last);
            last += x;
        }
        int[] multiplosArray = multiplos.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return multiplosArray;
    }

    // Dada una lista de materias, validar si alguna de ellas no pertenece a la lista de materias de la universidad
    // La complejidad algoritmica de esta fucion es O(materias.size() + materiasValidas.size())
    public static int isValid(List<String> materias, List<String> materiasValidas) {
        int diferencias = 0;

        Map<String, Boolean> materiasValidasMap = materiasValidas.stream()
                .collect(Collectors.toMap(materia -> materia, materia -> true)); // O(materiasValidas.size())

        for (String materia : materias) { //O( materias.length() )
            if(!materiasValidasMap.containsKey(materia)) { // O(1)

            }
        }
        return diferencias;
    }

    //La complejidad algoritmica de esta fucion es O(materias.size() * materiasValidas.size())
    public static int isValidLento(List<String> materias, List<String> materiasValidas) {
        int diferencias = 0;
        for (String materia : materias) {
            if(!materiasValidas.contains(materia)) { // Por cada materia hago O(materiasValidas.size())
                diferencias++;
            }
        }
        return diferencias;
    }
}
