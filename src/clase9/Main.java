package clase9;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        alumno.getPromedio(Materia.LENGUA);

    }

    private void loopConTiempo() throws InterruptedException {
        while(true) {
            //Ejecutar codigo que se quiera ejecutar cada 5 segundos
            Thread.sleep(5000); //Esto pone a dormir el thread por 5 segundos
        }
    }

}
