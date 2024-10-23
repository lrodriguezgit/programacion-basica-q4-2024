package clase4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<>(); //El operador new crea un nuevo objeto de tipo ArrayList
        List<String> miLista2;
        List<List<Integer>> miLista3;

        miLista.add(10); //Agrega un elemento al final de la lista
        miLista.add(1032);
        miLista.add(1, 958); //Agrega un elemento en la posicion especificada y corre el resto de elementos hacia la derecha

        List<Integer> miLista5 = List.of(628, 862, 7);

        miLista.addAll(miLista5);
        miLista.addAll(1, miLista5);

        List<Integer> miLista6 = Arrays.asList(862, 7);
        if(miLista.containsAll(miLista6)) { //Devuelve true si todos los elementos de la lista pasada como parametro estan en la lista
            System.out.println("Mi lista contiene todos los elementos de miLista6");
        } else {
            System.out.println("Algun elemento de miLista6 no esta dentro de miLista");
        }
        if(miLista.contains(7)) { //Devuelve true si la lista contiene el elemento pasado como parametro
            System.out.println("Mi lista contiene el 7");
        }

        if(!miLista.isEmpty()) {
            System.out.println("Mi lista no esta vacia");
        }
        List<Integer> miLista7 = new ArrayList<>();
        for (int i = 0; i < miLista.size(); i++) { //El size() devuelve la cantidad de elementos presentes en la lista
            Integer elementoEnI = miLista.get(i); //El get( i ) devuelve el elemento en la posicion i, empezando en la posicion 0
            miLista7.add(elementoEnI + 1);
        }
        System.out.println(miLista7);

        miLista7.clear();
        for (Integer elemento : miLista) {
            miLista7.add(elemento + 1);
        }
        System.out.println(miLista7);

        System.out.println(miLista);

        miLista.remove(Integer.valueOf(958)); //Elimina el primer elemento que sea igual al parametro
        miLista.remove(0); //Elimina el primer elemento de la lista

        List<Integer> miLista4 = new ArrayList<>();
        miLista4.add(10);
        miLista4.add(1032);
        miLista.removeAll(miLista4); //Elimina todos los elementos de la lista que esten en la lista pasada como parametro

        miLista.clear(); //Limpia la lista
    }

}
