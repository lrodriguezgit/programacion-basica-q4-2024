package ejercicios.gabo.CountByX;

import java.util.ArrayList;
import java.util.List;

public class arrayMaker {
    public List<Integer> ListMaker (int x,int n) {
        List<Integer> list = new ArrayList<>();
        for (int pos = x; pos <= x*n ; pos++ ){
            if (pos % x == 0){
                list.add(pos);
            }
        }
        return list;
    }
}
