package ejercicios.vicky;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String [] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el operador: ");
        String op = lectura.next();
        System.out.println("Ingrese el primer numero: ");
        int num1 = lectura.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = lectura.nextInt();
        int resultado = Operations(op,num1,num2);
        if (resultado <0){
            System.out.println("Operacion no es posible");
        }
        else{
            System.out.println("El resultado de "+ num1+ op+num2+" es: " + resultado);

        }
    }
    public static int Operations(String opp,int number1, int number2){
      int resultado;
      if (opp.equals("+")){
          resultado= number1+number2;
      }
       else if (opp.equals("-")){
          resultado= number1-number2;
      }
       else if (opp.equals("*")) {
          resultado= number1*number2;
        }
       else {
           resultado=-1;
      }
       return resultado;

    }
}