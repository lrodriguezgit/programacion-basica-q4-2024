package ejercicios.petro.bombScape.entities;

public abstract class Entity {
  private int id;
  private int posX;
  private int posY;

  public int getId() {
    return id;
  }

  protected void setId(int id) {
    this.id = id;
  }


  public int getPosX() {
    return posX;
  }

  protected void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  protected void setPosY(int posY) {
    this.posY = posY;
  }
}
