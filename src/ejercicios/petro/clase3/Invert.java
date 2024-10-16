package ejercicios.petro.clase3;

public class Invert {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    invert(numbers);
  }

  public static int[] invert(int[] array) {
    int multiplicator = -1;

    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] * multiplicator;
    }
    return array;
  }
}

