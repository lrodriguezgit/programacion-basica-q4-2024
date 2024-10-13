package ejercicios.petro.clase3.otros;

public class MakeLatinSquare {
  public static void main(String[] args) {
    makeLatinSquare(4);
  }
  public static int[][] makeLatinSquare(int n) {
    final int[][] latinSquare = new int[n][n];
    // Llenamos primere columna
    for (int i = 0; i < n; i++) {
      latinSquare[0][i] = i + 1;
    }

    for (int i = 1; i < latinSquare.length; i++) {
      for (int j = 0; j < latinSquare.length; j++) {
        latinSquare[i][j] = latinSquare[i - 1][(j + 1) % n];
      }
    }
    // la operacion con modulo permite  pasando a 0 resultado como ultimo y no salirse de los limites del array

    return latinSquare;
  }

}
