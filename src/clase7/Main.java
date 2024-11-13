package clase7;

public class Main {

    public static void main(String[] args) {
        //miMatrizFuncion();
        if(isInJaque(0,0)) {
            System.out.println("Rey esta en Jaque");
        } else {
            System.out.println("Rey no esta en Jaque");
        }
    }

    public static void miMatrizFuncion() {
        //Para crear una matriz con elementos adentro
        int[][] matriz = new int[][]{
                {10, 9, 8},
                {5, 4, 3},
                {2, 1, 0}
        };

        //Para crear una matriz de 3 dimensiones
        int[][][] matriz3D = new int[][][]{
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };

        //Para asignar un elemento de la matriz
        matriz[2][1] = 19;
        //Para obtener un elemento de la matriz hacemos
        int miNumero = matriz[1][1]; //Aca oobtenemos el cuatro

        //Para recorrer una matriz tendriamos que hacer fors anidados:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int elemento = matriz[i][j];
                System.out.print(elemento + ",");
            }
            System.out.println();
        }

        //Para recorrer la diagonal de una matriz:
        int sumatoria = 0;
        for (int i = 0, j = 0; i < matriz.length && j < matriz[i].length; i++, j++) {
            sumatoria += matriz[i][j];
        }
        System.out.println("La suma de los elementos de la diagonal es " + sumatoria);
    }

    public static boolean isInJaque(int filaQueen, int columnaQueen) {
        char[][] tablero = new char[8][8];

        // Llenar el tablero con '-'
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        //Colocar el rey y la reina en posiciones
        tablero[0][4] = 'K';
        tablero[filaQueen][columnaQueen] = 'Q';
        // Imprimir el tablero
        imprimirTablero(tablero);

        //Primero revisamos la fila de la Queen
        for (int i = 0; i < tablero[filaQueen].length; i++) {
            if(tablero[filaQueen][i] == 'K') {
                return true;
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            if(tablero[i][columnaQueen] == 'K') {
                return true;
            }
        }

        for (int i = filaQueen, j = columnaQueen; i < tablero.length && j < tablero[i].length; i++, j++) {
            if(tablero[i][j] == 'K') {
                return true;
            }
        }

        for (int i = filaQueen, j = columnaQueen; i < tablero.length && j >= 0; i++, j--) {
            if(tablero[i][j] == 'K') {
                return true;
            }
        }

        for (int i = filaQueen, j = columnaQueen; i >= 0 && j < tablero[i].length; i--, j++) {
            if(tablero[i][j] == 'K') {
                return true;
            }
        }

        for (int i = filaQueen, j = columnaQueen; i >= 0 && j >= 0; i--, j--) {
            if(tablero[i][j] == 'K') {
                return true;
            }
        }

        //Si no encontramos nada, retornamos falso
        return false;
    }

    // Método para imprimir el tablero
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
