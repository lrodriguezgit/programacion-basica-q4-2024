package ejercicios.petro.clase4;

import java.util.ArrayList;
import java.util.List;

public class CountPositivesSumNegatives {
  public static void main(String[] args) {
    int[] coso = null;
    int[] coso2 = {1,2,3,4,5,6,};

    countPositivesSumNegatives(coso);
  }

  public static int[] countPositivesSumNegatives(int[] input) {
    List<Integer> resultsList = new ArrayList<>();
    int count = 0;
    int sum = 0;

    if (input == null || input.length == 0) {
      return new int[]{};
    }else{
      for (int num : input){
        if(num > 0) count ++;
        if(num < 0) sum += num;
      }
      resultsList.add(count);
      resultsList.add(sum);
      return new int[]{resultsList.get(0),resultsList.get(1)};
    }
  }
}


