package ejercicios.petro;

public class ejercicio_5 {
  public static void main(String[] args) {
    TwoDecimalPlaces(1.232123);
  }
  public static double TwoDecimalPlaces(double number)
  {
    return Double.parseDouble(String.format("%.2f",number));
  }
}
