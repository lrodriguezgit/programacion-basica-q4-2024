package ejercicios.petro.bombScape.entities;

public abstract class Entity {
  private int id;
  private Integer posX;
  private Integer posY;

  public int getId() {
    return id;
  }

  protected void setId(int id) {
    this.id = id;
  }


  public int getPosX() {
    return posX;
  }

  public void setPosX(Integer posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(Integer posY) {
    this.posY = posY;
  }
}
