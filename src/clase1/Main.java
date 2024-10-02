package clase1;/*
    Que es programar?
    Escribir instrucciones en un ordenador para que realice una tarea.

    Que es un algoritmo?
    Serie de instrucciones que se ejecuta en orden para resolver un problema.

    Que podemos pogramar?
    Paginas Web -> Frontend o Backend -> Visual o Servidor
    Aplicaciones mobile
    Robots
    Videojuegos
    JAVA <- se construye a partir de C <- C se construye a partir de B <- 010101010110 tarjetas perforadas
    Sistemas operativos
 */

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Que es una variable?
        //Un lugar en memoria donde se almacena un valor. Cambian de valor.
        //Tipos de datos primitivos:
        byte numeroPequeno = -127;
        short numeroChiquito = 19264;
        int numero = 10;
        long numeroMasGrande = 1000000000000000000L;
        float numeroFlotante = 10.5f;
        double numeroMasPrecision = 10.129317629312731298398;
        boolean condicion = false;
        char caracter = 'A';
        char miNumero = '\u0041';

        //Tipos de datos complejos, en realidad se llaman clases:
        Character letra = 'A';
        Integer temperatura = -10;
        Boolean estaCaliente = temperatura > 80;
        String tipoCafetera = "Italiana";
        Float temperaturaPrecisa = 10.5f;
        LocalDateTime fecha = LocalDateTime.now();


        if(estaCaliente) {
            //si la condicion es verdadera, se ejecuta el codigo dentro de las llaves
            System.out.println("La temperatura es muy alta");
        } else {
            //si la condicion es falsa, se ejecuta el codigo dentro del else
            System.out.println("La temperatura es muy baja");
        }

        Agua agua = new Agua();
        agua.calentar();

        //Operacion basicas:
        Integer asignacion = 10;
        asignacion = 20; //reasignar

        Integer suma = 10 + 20;
        Integer resta = 10 - 20;
        Integer division = 25 / 20; //division = 1
        Float divisionPrecisa = 25.0f / 20.0f; //división = 1.25
        Integer restoDeDivison = 30 % 20; //restoDeDivison = 5
        Integer multiplicacion = 2 * 4;
        //Java tiene su libreria
        Double potencia = Math.pow(2, 4); //16

        int otroNumero = 10;
        System.out.println(otroNumero++); //Imprime 10 porque primero se ejecuta la linea de codigo y despues incrementa el valor
        System.out.println(++otroNumero); //Imprime 12 porque antes era 11 y se incrementa de nuevo antes de ejecutar la linea de codigo

        //Operaciones de comparacion en tipos de datos primitivos:
        Boolean igualdad = 10 == 20;
        Boolean menor = 10 < 20;
        Boolean mayor = 10 > 20;
        Boolean menorIgual = 10 <= 20;
        Boolean mayorIgual = 10 >= 20;
        Boolean diferente = 10 != 20;
        Boolean and = condicion && estaCaliente;
        Boolean or = condicion || estaCaliente;
        // orden de resolucion parecido a la matematica: 2 * 4 + 3
        // primero se resuelven los and y despues los or, a menos que se use parentesis
        Boolean andor = condicion && (estaCaliente || condicion);

        //Operaciones de comparacion en tipos de datos complejos:
        Boolean esItaliana = tipoCafetera.equals("Italiana");

        suma = null;
        suma = incrementar(suma);
        return;
    }

    public static Integer medirTemperatura() {
        int temperatura = 10;
        return temperatura;
    }

    public static Integer incrementar(Integer numero) {
        if(numero == null) {
            return -1;
        }
        return incrementarv2(numero);
    }

    public static Integer incrementarv2(Integer numero) {
        return numero++;
    }
}
