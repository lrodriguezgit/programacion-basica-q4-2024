package ejercicios.petro.bombScape.entities.obstacle;

import ejercicios.petro.bombScape.entities.Entity;

public class Obstacle extends Entity {
  private ObstacleType type;

  public Obstacle(ObstacleType type) {
    this.type = type;
  }

  protected void setPosX(Integer posX) {
    super.setPosX(posX);
  }
  protected void setPosY(Integer posY) {
    super.setPosY(posY);
  }
}
