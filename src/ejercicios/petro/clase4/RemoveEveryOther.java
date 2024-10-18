package ejercicios.petro.clase4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/java
public class RemoveEveryOther {
  public static void main(String[] args) {
    Object[] cosas = { "Hello", "Goodbye", "Hello Again" };
    removeEveryOther(cosas);
  }
  public static Object[] removeEveryOther(Object[] arr) {
    // si le asigno el array directamente fija el tamaño de la lista.
    List<Object> lista = new ArrayList<>(Arrays.asList(arr));
    for (int i = lista.size() - 1; i >= 0; i--){
      if(i % 2 != 0) {
        lista.remove(i);
      }
    }
    return lista.toArray();
  }
}
