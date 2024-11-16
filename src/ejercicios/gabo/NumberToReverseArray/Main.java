package ejercicios.gabo.NumberToReverseArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReverseArray reverse = new ReverseArray();
        Number num = 35231;
        List<Integer> inversedList = new ArrayList<>();
        inversedList = reverse.reverseFromNumber(num);
        System.out.println(inversedList);
    }
}