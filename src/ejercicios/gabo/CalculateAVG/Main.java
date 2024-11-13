package ejercicios.gabo.CalculateAVG;

public class Main {
    public static void main(String[] args) {
        CalculateAVG avg = new CalculateAVG();
        int[] array = {1,2,3,4,5};
        double promedio = avg.arrayToAVG(array);
        System.out.println(promedio);
    }
}