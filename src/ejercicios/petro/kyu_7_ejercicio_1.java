package ejercicios.petro;
// https://www.codewars.com/kata/57cf50a7eca2603de0000090/train/java
public class kyu_7_ejercicio_1 {
  public static void main(String[] args) {
    String coso = "docdmkco";
    moveTen(coso);
  }
  public static String moveTen(String s) {
    StringBuilder finalString = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char letter =  s.charAt(i);
      int letterCode = (int) letter + 10;

      if (letterCode > 122){
        letterCode =  letterCode - 26;
      }
      char finaLetter = (char) letterCode;
      finalString.append(finaLetter);
    }

    return finalString.toString();
    }
  }


