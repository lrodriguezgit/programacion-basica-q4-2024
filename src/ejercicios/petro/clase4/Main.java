package ejercicios.petro.clase4;

import java.util.Arrays;

public class Main {
 // Lucho por que tengo esta clase MAIN en mi package ? SPAM
    public static void main(String[] args) {
        int[] resultado = digitize(0);
        System.out.println("El resultado es: " + Arrays.toString(resultado));
    }

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static int liters(double time)  {
        return (int) (time/2);
    }

    //Math es una libreria de Java con funciones y constantes
    //Math.round() redondea hacia abajo si es menor a .5 y redondea hacia arriba si es mayor a .5
    //Math.floor() redondea siempre hacia abajo
    //Math.ceil()  redondea siempre hacia arriba
    public static int litersUp(double time)  {
        Double liters = time/2;
        return liters.intValue();
    }

    //[ 3 , 2 ]
    //  0   1   2 -> ArrayIndexOutOfBoundsException

    // n = 1234
    // i = 1
    // digito = 3
    // n = 12
    // result = [ 4 , 3 , 2 , 1]
    public static int[] digitize(long n) {
        Long numero = n;
        int digitos = digits(n);
        int[] result = new int[digitos];
        for(int i = 0; i < digitos; i++) {
            int digito = (int) n % 10;
            n /= 10;
            result[i] = digito;
        }
        return result;
    }

    public static int digits(long n) {
        long numero = n;
        int i = 0;
        do {
            numero /= 10;
            i++;
        } while(numero != 0);
        return i;
    }
}
