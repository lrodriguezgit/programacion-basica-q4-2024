package ejercicios.gabo.basicOps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15));
        posCountNegativesSum operation = new posCountNegativesSum();
        int[] test = operation.arraySum(myList);
        System.out.println(Arrays.toString(test));
    }
}

//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].