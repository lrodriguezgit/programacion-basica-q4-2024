package ejercicios.petro.clases1_2;
//https://www.codewars.com/kata/5641a03210e973055a00000d/train/java
public class ejercicio_5 {
  public static void main(String[] args) {
    TwoDecimalPlaces(1.232123);
  }
  public static double TwoDecimalPlaces(double number)
  {
    return Double.parseDouble(String.format("%.2f",number));
  }
}
