package clase8;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Polimorfismo es la capacidad de dos objetos distintos de responder a un mismo mensaje -> implementar el mismo metodo
        Tarjeta tarjeta1 = new TarjetaCredito("123124121", "Juan Perez");
        Tarjeta tarjeta2 = new TarjetaDebito("123124121", "Juan Perez");

        List<Tarjeta> tarjetas = List.of(tarjeta1, tarjeta2);

        for(Tarjeta tarjeta : tarjetas) {
            tarjeta.doPayment(100.0);
        }


        //-------------------------------------------
        Vencible tarjeta3 = new TarjetaCredito("123124121", "Juan Perez");
        Vencible tarjeta4 = new TarjetaDebito("123124121", "Juan Perez");

        List<Vencible> vencibles = List.of(tarjeta3, tarjeta4);

        for(Vencible vencible : vencibles) {
            if(vencible.isVencido()) {
                //Codigo que se ejecuta si el vencible es vencido
            }
        }

        //La herencia en Java es unica, pero las interfaces pueden implementarse infinitas veces
    }

}
