package ejercicios.petro.clase3.otros;
//https://www.codewars.com/kata/66fc9ca2e6d1d0e9cc2e4a4c/train/java
// Funciona pero no pasa test de performance
public class CountStreets {
  public static void main(String[] args) {
    String[] streets2 = {"first", "second", "third", "fourth", "fifth", "sixth", "seven"};
    String[][] drivers2 = {{"first", "second"}, {"second", "seven"}, {"sixth", "fourth"}};
    countStreets(streets2,drivers2);
  }
  public static int[] countStreets(String[] streets, String[][] drivers) {
    int[] results = new int[drivers.length];
    String start, finish;
    int pointA = 0;
    int pointB = 0;
     for (int i = 0; i < drivers.length; i++) {
       start = drivers[i][0];
       finish = drivers[i][1];

      for (int j = 0; j < streets.length; j++) {

        if (start.equals(streets[j])) {
          pointA = j;
        }
        if (finish.equals(streets[j])) {
          pointB = j;
        }

      }
      results[i] = Math.abs(pointA - pointB) - 1;
    }
    return results;
  }
}
