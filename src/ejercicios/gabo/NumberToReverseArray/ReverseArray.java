package ejercicios.gabo.NumberToReverseArray;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public List reverseFromNumber(Number number) {
        String str = number.toString();
        String saveChar;
        List<Integer> invList = new ArrayList<>();
        for (int i = str.length(); i>0 ; i--){
            saveChar = str.substring(i-1, i);
            Integer saveInt = Integer.parseInt(saveChar);
            invList.add(saveInt);
        }
        return invList;
    }
}
