package ejercicios.petro.clase3.otros;


//https://www.codewars.com/kata/5a9e86705ee396d6be000091/train/java
public class checkThreeAndTwo {
  public static void main(String[] args) {
    char[] array = { 'a', 'c', 'a', 'c', 'b' };
    checkThreeAndTwo(array);
  }

  public static boolean checkThreeAndTwo(char[] chars) {
    int[] abcs = new int[3];
    boolean isCake = false;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'a') abcs[0] = abcs[0] + 1;
      if (chars[i] == 'b') abcs[1] = abcs[1] + 1;
      if (chars[i] == 'c') abcs[2] = abcs[2] + 1;
    }
    if ((abcs[0] == 3 || abcs[1] == 3 || abcs[2] == 3) &&(abcs[0] == 2 || abcs[1] == 2 || abcs[2] == 2)){
      isCake = true;
    }

    return isCake;

  }
}
