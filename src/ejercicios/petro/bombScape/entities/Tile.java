package ejercicios.petro.bombScape.entities;

public class Tile extends Entity {
  private Entity content;
  private Boolean isOccupied;

  public Tile(Boolean isOccupied, Integer posX, Integer posY, Integer id) {
    try {
      this.isOccupied = isOccupied;
      setPosX(posX);
      setPosY(posY);
      setId(id);
    } catch (Exception e) {
      System.err.println("Error al crear el Tile: " + e.getMessage());
      e.printStackTrace();
    }
  }


  public void setId(Integer id) {
    try {
      if (id == null || id < 0) {
        throw new IllegalArgumentException("El ID no puede ser nulo o negativo.");
      }
      super.setId(id);
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el ID: " + e.getMessage());
      throw e;
    }
  }


  public void setPosX(Integer posX) {
    try {
      if (posX == null || posX < 0) {
        throw new IllegalArgumentException("La posición X no puede ser nula o negativa.");
      }
      super.setPosX(posX);
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer la posición X: " + e.getMessage());
      throw e;
    }
  }

  public void setPosY(Integer posY) {
    try {
      if (posY == null || posY < 0) {
        throw new IllegalArgumentException("La posición Y no puede ser nula o negativa.");
      }
      super.setPosY(posY);
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer la posición Y: " + e.getMessage());
      throw e;
    }
  }

  public void placeObject(Entity object) {
    try {
      if (object == null) {
        throw new IllegalArgumentException("El objeto no puede ser nulo.");
      }
      this.content = object;
      this.isOccupied = true;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al colocar el objeto: " + e.getMessage());
      throw e;
    }
  }

  public void removeObject() {
    try {
      if (this.content == null) {
        throw new IllegalStateException("No hay objeto para eliminar.");
      }
      this.content = null;
      this.isOccupied = false;
    } catch (IllegalStateException e) {
      System.err.println("Error al eliminar el objeto: " + e.getMessage());
      throw e;
    }
  }

  public boolean isOccupied() {
    try {
      return isOccupied;
    } catch (Exception e) {
      System.err.println("Error al verificar si el Tile está ocupado: " + e.getMessage());
      throw e;
    }
  }

  public void setOccupied(Boolean occupied) {
    try {
      if (occupied == null) {
        throw new IllegalArgumentException("El estado ocupado no puede ser nulo.");
      }
      isOccupied = occupied;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el estado ocupado: " + e.getMessage());
      throw e;
    }
  }
}
