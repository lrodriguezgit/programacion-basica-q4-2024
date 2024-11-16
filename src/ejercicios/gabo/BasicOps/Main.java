package ejercicios.gabo.BasicOps;


public class Main {
    public static void main(String[] args) {
        BasicOps operaciones = new BasicOps();
        System.out.println(operaciones.Calculo('+', 4, 7));
        System.out.println(operaciones.Calculo('-', 15, 18));
        System.out.println(operaciones.Calculo('*', 5, 5));
        System.out.println(operaciones.Calculo('/', 49, 7));
    }
}