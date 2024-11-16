package ejercicios.gabo.matrices;

public class  Main {
    public static void main(String[] args) {
        Matrix matrices = new Matrix();
        int[][] matriz = matrices.matrixDefault(3);
        int[][] matriz2 = matrices.matrixDefault(2);
        int[][] matriz3 = matrices.matrixDefault(4);
        matrices.rotateMatrix(matriz, 4);
        matrices.rotateMatrix(matriz2,1);
        matrices.rotateMatrix(matriz3, 2);
    }
}