package clase9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        alumno.getPromedio(Materia.LENGUA);

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Running in a separate thread: " + Thread.currentThread().getName());
        };

        executor.submit(task); // Executes the task in a separate thread
        executor.shutdown();   // Shut down the executor after the task completes
    }

    private void loopConTiempo() throws InterruptedException {
        while (true) {
            //Ejecutar codigo que se quiera ejecutar cada 5 segundos
            Thread.sleep(5000); //Esto pone a dormir el thread por 5 segundos
        }
    }

}
