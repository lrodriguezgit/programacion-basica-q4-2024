package ejercicios.vicky;
import java.util.Scanner;
import java.lang.String;
public class SquareSum {

    public static void main(String [] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de cuadrados que desea realizar: ");
        int cant = lectura.nextInt();
        int[] numeros= new int[cant];
        for(int i=0;i<cant;i++){
            System.out.println("Ingrese el numero: ");
            numeros[i] = lectura.nextInt();
        }
        int resultado=SquareSum(numeros);
        System.out.println("El resultado es:"+resultado);

    }
    public static int SquareSum( int [] num){
        int sum=0;
        for(int i=0;i< num.length;i++){
           sum += num[i] * num[i];
        }
        return sum;

    }
}
