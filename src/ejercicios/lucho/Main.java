package ejercicios.lucho;

public class Main {

    public static void main(String[] args) {
        String resultado = evenOrOdd(11);
        System.out.println("El resultado es: " + resultado);
    }

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
