package ejercicios.petro;

import java.util.Arrays;

//https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
public class ejercicio_4 {
  public static void main(String[] args) {
    Boolean[] sheepsArray =
      {null, true, true, false,
        true, true, true, true,
        true, false, true, false,
        true, false, false, true,
        true, true, true, true,
        false, false, true, true};
    countSheeps(sheepsArray);
  }

  public static int countSheeps(Boolean[] arrayOfSheeps) {
    int presentSheeps = 0;
    for (Boolean sheep : arrayOfSheeps) {
      if (sheep != null && sheep) {
        presentSheeps += 1;
      }
    }
    return presentSheeps;
  }
}
