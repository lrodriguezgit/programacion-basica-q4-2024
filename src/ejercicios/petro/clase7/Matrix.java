package ejercicios.petro.clase7;

import java.lang.reflect.Array;

public class Matrix {
  public static int[][] rotate(int[][]array, int turns){
    int[][] rotatedArray = array;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
      }
    }


    return  rotatedArray;
  };

  public static void main(String[] args) {
    int[][] matrix =
      {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
      };
   int[][] rotaded=  rotate(matrix,1);

    /*for (int[] row : rotaded) {
      for (int num : row) {
        System.out.print(num + "  ");
      }
      System.out.println();
    }
     */
  }

}
