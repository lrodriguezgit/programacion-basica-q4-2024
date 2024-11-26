package ejercicios.petro.bombScape;

import ejercicios.petro.bombScape.entities.bomb.Bomb;
import ejercicios.petro.bombScape.entities.bomb.BombType;
import ejercicios.petro.bombScape.entities.obstacle.Obstacle;
import ejercicios.petro.bombScape.entities.obstacle.ObstacleType;
import ejercicios.petro.bombScape.game.Board;

public class Main {

  public static void main(String[] args) {
    Board myBoard = new Board(5);

    Obstacle myObstacle = new Obstacle(ObstacleType.TREE, true);
    Bomb myBomb = new Bomb(BombType.CROSS, 2);
    myBoard.placeObject(myObstacle, 0, 0);
    myBoard.placeObject(myBomb, 1, 1);
    myBoard.removeObject(myBomb);
    //Completar Character
    //Controles
    //Validaciones y Restricciones de posicionamiento
    //Comportamiento Bomba
    //Efecto sobre ambiento Bomba
    //Game



  }

}
