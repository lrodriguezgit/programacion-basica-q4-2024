package ejercicios.petro.bombScape.entities.obstacle;

import ejercicios.petro.bombScape.entities.Entity;

public class Obstacle extends Entity {
  private ObstacleType type;
  private Boolean destructible;

  public Obstacle(ObstacleType type, Boolean destructible) {
    this.type = type;
    this.destructible = destructible;
  }

  public ObstacleType getType() {
    return type;
  }

  public Boolean getDestructible() {
    return destructible;
  }
}


