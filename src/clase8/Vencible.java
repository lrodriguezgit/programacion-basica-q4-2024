package clase8;

import java.util.Date;

public interface Vencible {

    Date fechaVencimiento = null;

    Date getVencimiento();
    boolean isVencido();

}
