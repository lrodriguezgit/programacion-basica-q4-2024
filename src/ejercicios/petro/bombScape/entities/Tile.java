package ejercicios.petro.bombScape.entities;


public class Tile extends Entity {
  private Entity content;
  private Boolean isOccupied;

  public Tile(Boolean isOccupied, Integer posX, Integer posY, Integer id) {
    this.isOccupied = isOccupied;
    setPosX(posX);
    setPosY(posY);
    setId(id);
  }

  public void setId(Integer id) {
    super.setId(id);
  }

  public void setPosX(Integer posX) {
    super.setPosX(posX);
  }

  public void setPosY(Integer posY) {
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

  public void setOccupied(Boolean occupied) {
    isOccupied = occupied;
  }

//>Get by posicion?


  // Get tile by id
  // Get tile by posicion

}
