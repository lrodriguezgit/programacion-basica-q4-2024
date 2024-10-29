package ejercicios.petro.clase5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Vowels {
  public static void main(String[] args) {
    getCountLetters("albaricoque");
  }

  public static int getCountVowelsArrays(String str) {
    char[] charArray = str.toCharArray();
    int counter = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'){
        counter++;
      }
    }
    return counter;
  }
  // Este cumple con "contar todas las letras" y retorna un int
  public static int getCount(String str) {
    return str.length();
  }
  public static int getCountLetters(String str) {
    char[] charArray = str.toCharArray();
    List<Character> charList =  new ArrayList<>();

    for (char letter : charArray) {
      charList.add(letter);
    }

    Map<Character, Integer> letterCountMap = charList
      .stream()
      .collect(Collectors.toMap(
        letter -> letter,
        count ->1,
        Integer::sum));
    return 0;
  }
}
