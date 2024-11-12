package ejercicios.petro.clase6;
import java.util.Random;
public class Ghost {
  String color;

  public Ghost() {
    String[] colors = {"white","yellow","purple","red"};
    Random random = new Random();
    int randomIndex= random.nextInt(colors.length);
    this.color = colors[randomIndex];
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public static void main(String[] args) {


    Ghost ghost = new Ghost();
    Ghost ghost2 = new Ghost();

    System.out.println("El color del Ghost 1 es: " + ghost.getColor());
    System.out.println("El color del Ghost 2 es: " + ghost2.getColor());
  }
}


