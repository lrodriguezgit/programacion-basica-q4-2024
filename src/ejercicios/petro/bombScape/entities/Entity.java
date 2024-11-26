package ejercicios.petro.bombScape.entities;

public abstract class Entity {
  private int id;
  private Integer posX;
  private Integer posY;

  public int getId() {
    try {
      return id;
    } catch (Exception e) {
      System.err.println("Error al obtener el ID de la entidad: " + e.getMessage());
      throw e;
    }
  }

  protected void setId(int id) {
    try {
      if (id < 0) {
        throw new IllegalArgumentException("El ID no puede ser negativo.");
      }
      this.id = id;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el ID de la entidad: " + e.getMessage());
      throw e;
    }
  }

  public Integer getPosX() {
    try {
      return posX;
    } catch (Exception e) {
      System.err.println("Error al obtener la posición X de la entidad: " + e.getMessage());
      throw e;
    }
  }

  public void setPosX(Integer posX) {
    try {
      if (posX != null && posX < 0) {
        throw new IllegalArgumentException("La posición X negativa.");
      }
      this.posX = posX;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer la posición X de la entidad: " + e.getMessage());
      throw e;
    }
  }

  public Integer getPosY() {
    try {
      return posY;
    } catch (Exception e) {
      System.err.println("Error al obtener la posición Y de la entidad: " + e.getMessage());
      throw e;
    }
  }

  public void setPosY(Integer posY) {
    try {
      if (posY != null && posY < 0) {
        throw new IllegalArgumentException("La posición Y no puede ser negativa.");
      }
      this.posY = posY;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer la posición Y de la entidad: " + e.getMessage());
      throw e;
    }
  }

}
