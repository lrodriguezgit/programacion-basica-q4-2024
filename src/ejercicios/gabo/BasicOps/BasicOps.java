package ejercicios.gabo.BasicOps;

public class BasicOps{
    public int Calculo(char op, int num1, int num2){
        switch (op){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}
