package ejercicios.petro.bombScape;

public class Tile extends Entity {
  private Entity content;
  private boolean isOccupied;

  public Tile(Boolean isOccupied, Integer posX, Integer posY) {
    this.isOccupied = isOccupied;

    setPosX(posX);
    setPosY(posY);
  }

  public void placeObject(Entity object) {
    this.content = object;
    this.isOccupied = true;
  }

  public void removeObject() {
    this.content = null;
    this.isOccupied = false;
  }

  public boolean isOccupied() {
    return isOccupied;
  }

  public void setOccupied(boolean occupied) {
    isOccupied = occupied;
  }
}
