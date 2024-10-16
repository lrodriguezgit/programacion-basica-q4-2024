package ejercicios.valeria;

public class SquareSum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2};
        System.out.println(squareSum(numbers));
    }

    public static int squareSum(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero * numero;
        }
        return suma;
    }
}