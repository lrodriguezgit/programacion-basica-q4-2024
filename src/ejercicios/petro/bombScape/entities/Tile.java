package ejercicios.petro.bombScape.entities;

public class Tile extends Entity {
  private Entity content;
  private boolean isOccupied;

  public Tile(Boolean isOccupied, Integer posX, Integer posY,Integer id) {
    this.isOccupied = isOccupied;
    setPosX(posX);
    setPosY(posY);
    setId(id);
  }
  protected void setId(Integer id) {
    super.setId(id);
  }
  protected void setPosX(Integer posX) {
    super.setPosX(posX);
  }

  protected void setPosY(Integer posY) {
    super.setPosY(posY);
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

  // Get tile by id
  // Get tile by posicion

}
