package ejercicios.gabo.CountByX;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arrayMaker arraybuilder = new arrayMaker();
        List<Integer> list = arraybuilder.ListMaker(1,10);
        System.out.println(list);
    }
}