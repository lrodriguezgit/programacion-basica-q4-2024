package ejercicios.petro.clases1_2;
//https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
public class ejercicio_6 {
  public static void main(String[] args) {
    String leCose = " Y si me tiro por la ventana ?";
    stringToArray(leCose);
  }
  public static String[] stringToArray(String s) {
    return s.split(" ");
  }

}
