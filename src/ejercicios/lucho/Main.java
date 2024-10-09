package ejercicios.lucho;

public class Main {

    public static void main(String[] args) {
        int resultado = litersUp(11.8);
        System.out.println("El resultado es: " + resultado);
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
}
