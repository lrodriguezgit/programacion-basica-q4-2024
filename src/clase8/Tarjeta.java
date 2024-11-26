package clase8;

public abstract class Tarjeta {

    protected String numero;
    protected String owner;

    public Tarjeta(String numero, String owner) {
        this.numero = numero;
        this.owner = owner;
    }

    public abstract void doPayment(Double amount);

    public String getNumero() {
        return numero;
    }
}
