package ejercicios.petro.clase3;

public class FindNeedle {
  public static void main(String[] args) {
    Object[] hayStack = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
    findNeedle(hayStack);
  }
  public static String findNeedle(Object[] haystack) {
    int needlePosition = 0;
    for (int i = 0; i < haystack.length; i++) {
      if(haystack[i] == null){
        haystack[i] = 0;
      }
      if (haystack[i].equals("needle")){
        needlePosition = i;
      }
    }
    return "found the needle at position " + needlePosition;
  }
}
