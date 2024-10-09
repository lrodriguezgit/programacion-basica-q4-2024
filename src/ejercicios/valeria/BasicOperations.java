package ejercicios.valeria;

public class BasicOperations {
    public static void main(String[] args) {

        basicMath("+",2,4);
}
    public static Integer basicMath(String op, int v1, int v2) {
    switch (op) {
        case "+":
            return v1 + v2;
        case "-":
            return v1 - v2;
        case "*":
            return v1 * v2;
        case "/":
            if (v2 != 0) {
                return v1 / v2;
            } else {
                return null;
            }
        default:
            return null;



    }
}
}

