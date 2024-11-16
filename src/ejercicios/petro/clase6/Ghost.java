package ejercicios.petro.clase6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Ghost {
  private String color;// modificar codigo para que ipo sea Colors

  public enum Colors {
    white, yellow, purple, red;
  }

  public Ghost() {
    Random random = new Random();
    int randomIndex = random.nextInt(Colors.values().length);
    this.color = Colors.values()[randomIndex].toString();
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "This Ghost is " + color;
  }

  public static void evenGhostsColor(List<Ghost> ghosts) {
    for (int i = 0; i < ghosts.size(); i++) {
      String color = Colors.values()[i % Colors.values().length].toString();
      ghosts.get(i).setColor(color);
    }
    ;
    ghosts.sort(Comparator.comparing(Ghost::getColor));
  }

  public static void main(String[] args) {

    Ghost ghost1 = new Ghost();
    Ghost ghost2 = new Ghost();
    Ghost ghost3 = new Ghost();
    Ghost ghost4 = new Ghost();
    Ghost ghost5 = new Ghost();
    Ghost ghost6 = new Ghost();
    Ghost ghost7 = new Ghost();
    Ghost ghost8 = new Ghost();

    List<Ghost> armyOfGhosts = new ArrayList<>();
    armyOfGhosts.add(ghost1);
    armyOfGhosts.add(ghost2);
    armyOfGhosts.add(ghost3);
    armyOfGhosts.add(ghost4);
    armyOfGhosts.add(ghost5);
    armyOfGhosts.add(ghost6);
    armyOfGhosts.add(ghost7);
    armyOfGhosts.add(ghost8);
    armyOfGhosts.forEach(System.out::println);

    evenGhostsColor(armyOfGhosts);

    armyOfGhosts.forEach(System.out::println);
  }
}


