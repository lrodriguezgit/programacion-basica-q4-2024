package ejercicios.petro.clase3;

//https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java
public class Digitize {
  public static void main(String[] args) {
    long number = 35231;
    digitize(number);
  }

  public static int[] digitize(long n) {

    long digitQty = (long) Math.log10(n) + 1;
    int intDigitQty = (int) digitQty; //
    int[] digits = new int[intDigitQty];

    for (int i = 0; i < digitQty; i++) {
      int digit = (int) (n % 10);
      n = (long) (Math.floor(n) / 10);
      digits[i] = digit;
    }
    return digits;
  }
}
