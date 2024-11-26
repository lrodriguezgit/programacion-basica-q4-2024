package clase8;

import java.io.Serializable;
import java.util.Date;

public class TarjetaDebito extends Tarjeta implements Vencible, Serializable {

    private Double saldo = 0.0;

    public TarjetaDebito(String numero, String owner) {
        super(numero, owner);
    }

    @Override
    public void doPayment(Double amount) {
        this.saldo -= amount;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
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
