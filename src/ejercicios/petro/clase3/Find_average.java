package ejercicios.petro.clase3;

public class Find_average {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    find_average(numbers);
  }

  public static double find_average(int[] array) {
    double sum = 0;
    int length = array.length;
    for (int number : array) {
      sum += number;
    }
      return length ==  0 ? 0: sum / length;
  }
}
