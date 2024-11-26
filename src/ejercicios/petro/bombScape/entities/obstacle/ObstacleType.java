package ejercicios.petro.bombScape.entities.obstacle;

public enum ObstacleType {
  ROCK(false), TREE(true);
  private final Boolean destructable;

  ObstacleType(Boolean destructable) {
    this.destructable = destructable;
  }

  public Boolean getDestructable() {
    return destructable;
  }
}
