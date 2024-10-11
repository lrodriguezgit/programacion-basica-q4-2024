package ejercicios.petro.clase3;

// https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
public class Kata {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    squareSum(numbers);
  }

  public static int squareSum(int[] n) {
    int result = 0;
    for (int number : n) {
      result += number * number;
    }
    return result;
  }
}
