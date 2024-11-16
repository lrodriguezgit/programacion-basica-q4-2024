package ejercicios.gabo.matrices;

public class Matrix {
    public int[][] matrixDefault(int x) {
        int[][] matriz = new int[x][x];
        for (int i = 0, num = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++, num++) {
                matriz[i][j] = num;
            }
        }
        return matriz;
    }
    public void rotateMatrix(int[][] matriz, int times){
        int[][] inverse = new int[matriz.length][matriz.length];
        for (int time= 0 ; time < times ; time++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = matriz.length - 1, col = 0; j >= 0; j--, col++) {
                    inverse[col][i] = matriz[i][j];
                }
            }
            matriz = CopiarMatriz (matriz, inverse);
        }
        imprimirMatriz(inverse);
    }

    public int[][] CopiarMatriz ( int [][] copy, int[][] source){
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j<source.length ; j++) {
                copy[i][j] = source[i][j];
            }
        }
        return copy;
    }

    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
