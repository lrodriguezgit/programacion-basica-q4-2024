package ejercicios.petro;

//https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java
public class ejercicio_2 {
  public static void main(String[] args) {
    bmi(1,1);
  }
  public static String bmi(double weight, double height) {
    double bmi = weight / height * height;
    if (bmi <= 18.5) {
      return "Underweight";
    } else if (bmi <= 25) {
      return "Normal";
    } else if (bmi <= 30) {
      return "Overweight";
    } else {
      return "Obese";
    }
  }
}

