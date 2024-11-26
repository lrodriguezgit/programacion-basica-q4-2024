package clase8;

import java.io.Serializable;
import java.util.Date;

public class TarjetaCredito extends Tarjeta implements Vencible, Serializable {

    private Double resumen = 0.0;

    public TarjetaCredito(String numero, String owner) {
        super(numero, owner);
    }

    @Override
    public void doPayment(Double amount) {
        this.resumen += amount;
    }

    @Override
    public Date getVencimiento() {
        return null;
    }

    @Override
    public boolean isVencido() {
        return false;
    }
}
