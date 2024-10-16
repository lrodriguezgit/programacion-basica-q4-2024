package ejercicios.petro;

//https://www.codewars.com/kata/5bb904724c47249b10000131/train/java -Solved
//Total amount of points
public class ejercicio_1 {

  public static void main(String[] args) {
    String[] puntajes = {"3:1", "2:2", "0:1"};
    points(puntajes);
  }

  public static int points(String[] games) {
    int points = 0;
    for (String game : games) {
      int teamMatchPoints = game.charAt(0);
      int opponentMatchPoints = game.charAt(2);
      if (teamMatchPoints > opponentMatchPoints) {
        points += 3;
      }
      if (teamMatchPoints == opponentMatchPoints) {
        points += 1;
      }
    }
    return points;
  }
}
