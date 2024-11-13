package ejercicios.gabo.basicOps;

import java.util.List;

public class posCountNegativesSum {
    public int[] arraySum (List<Integer> array) {
        if (array.isEmpty()){
            return new int[]{};
        }
        int countPositives = 0;
        int sumNegatives = 0;
        for (Integer element : array){
            if (element>=0){
                countPositives++;
            }
            if (element<0){
                sumNegatives+=element;
            }
        }
        return new int[] {countPositives,sumNegatives};
    }
}
