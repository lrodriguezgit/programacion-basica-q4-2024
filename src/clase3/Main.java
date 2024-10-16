package clase3;

public class Main {

    public static void main(String[] args) {
        miForFuncion(1);
    }

    public static void miFuncion(int numero) {
        if(numero < 0) {
            System.out.println("Es negativo");
        }

        if(numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es positivo");
        }

        if(numero > 10000) {
            System.out.println("Es numero gigante");
        } else if (numero > 1000) {
            System.out.println("Es numero grande");
        } else if (numero > 10) {
            System.out.println("Es numero chiqui");
        }
    }

    public static void miSwitchFuncion(Integer numero, StatusEnum status) {
        switch (numero) {
            case 1:
                System.out.println("Es un 1");
                break;
            case 2:
                System.out.println("Es un 2");
                break;
            case 3:
                System.out.println("Es un 3");
                break;
        }

        switch (status) {
            case ACTIVE:
                System.out.println("Es un 1");
                break;
            case INACTIVE:
                System.out.println("Es un 2");
                break;
            case EXPIRED:
                System.out.println("Es un 3");
                break;
        }

        //Switch enhanced
        switch (status) {
            case ACTIVE -> System.out.println("Es un 1");
            case INACTIVE -> System.out.println("Es un 2");
            case EXPIRED -> System.out.println("Es un 3");
        }
    }

    public static void miWhileFuncion(int numero) {
        while(numero < 10) {
            numero++;
            System.out.println("Ahora mi numero es " + numero);
        }

        //No lo hagan en casa
        while(true) {
            if(numero == 10) {
                break;
            }
            numero++;
        }
    }

    public static void miForFuncion(int numero) {
        //El for recibe 3 cosas separadas por ;
        //  primero una inicializacion -> En general se usan contadores como: int i = 0;
        //  segundo una condicion de corte
        //  tercero un codigo que se ejecuta al finalizar un loop -> En general si usan contadores van a sumarle uno al contador: i++
        for(int i = numero; i < 10; i++) {
            System.out.println("Mi conntador es " + i);
        }

        int[] literatura = new int[]{10, 9, 8};

        //Para obtener la segunda posicion del array (NOTA: los arrays empiezan en 0!!)
        int notaQ2 = literatura[1];

        //Para iterar un array se usa en general un for
        int sumatoria = 0;
        for (int i = 0; i < literatura.length; i++) {
            sumatoria += literatura[i];
        }
        double promedio = (double) sumatoria / literatura.length;

        //Otra forma de iterar es con el foreach
        int sumatoria2 = 0;
        for (int nota: literatura) {
            sumatoria += nota;
        }
        double promedio2 = (double) sumatoria / literatura.length;

    }
}
