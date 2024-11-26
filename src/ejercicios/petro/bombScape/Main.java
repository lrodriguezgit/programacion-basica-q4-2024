package ejercicios.petro.bombScape;

import ejercicios.petro.bombScape.entities.bomb.Bomb;
import ejercicios.petro.bombScape.entities.bomb.BombType;
import ejercicios.petro.bombScape.entities.obstacle.Obstacle;
import ejercicios.petro.bombScape.entities.obstacle.ObstacleType;
import ejercicios.petro.bombScape.game.Board;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Board myBoard = new Board(5);

    Obstacle myObstacle = new Obstacle(ObstacleType.TREE, true);
    Bomb myBomb = new Bomb(BombType.CROSS, 2);


    myBoard.placeObject(myObstacle, 0, 0);
    myBoard.placeObject(myBomb, 1, 1);

    myBoard.removeObject(myObstacle, 0, 0);





    // crear lista de objetos, crear lsita de0
    // definir metodos bomba
    // character
    // maps
    // mapas predefinidos
    // randomizador de bombas
    // Controles y menu
  }

}
