package ejercicios.gabo.SquareSum;

public class Square {
    public int squareSum(int[] array) {
        int totalSum = 0;
        for (int nota : array) {
            totalSum += nota * nota;
        }
        return totalSum;
    }
}