package ejercicios.gabo.CalculateAVG;

public class CalculateAVG {
    public double arrayToAVG(int[] array){
        int avg = 0;
        for(int pos: array){
            avg += pos;
        }
        if (array.length == 0) return 0;
        return (double)avg/array.length;
    }
}
