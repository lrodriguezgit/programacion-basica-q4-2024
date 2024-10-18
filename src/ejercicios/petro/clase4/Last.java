package ejercicios.petro.clase4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Last {

  public static void main(String[] args) {

    last();
  }
  public static <T> T last(final List<T> list) {
    // esta verga es de T y no propio de LIST o de ARRAY por ende le da la tocoquera
    return list.getLast();
  }
  public static char last(final String string) {
    List<Character> charList = new ArrayList<>();
    for(char characteear : string.toCharArray()){
      charList.add(characteear);
    };
    return charList.getLast();
  }
  public static <T> T last(final T... list) {
    List<T> listO = new ArrayList<>();
    listO.addAll(Arrays.asList(list));
    return listO.getLast();
  }
}
