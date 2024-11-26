package ejercicios.petro.bombScape.entities.obstacle;

import ejercicios.petro.bombScape.entities.Entity;

public class Obstacle extends Entity {
  private ObstacleType type;
  private Boolean destructible;

  public Obstacle(ObstacleType type, Boolean destructible) {
    try {
      if (type == null) {
        throw new IllegalArgumentException("El tipo de obstáculo no puede ser nulo.");
      }
      if (destructible == null) {
        throw new IllegalArgumentException("El atributo destructible no puede ser nulo.");
      }
      this.type = type;
      this.destructible = destructible;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al crear el obstáculo: " + e.getMessage());
      throw e;
    }
  }

  public ObstacleType getType() {
    try {
      return type;
    } catch (Exception e) {
      System.err.println("Error al obtener el tipo de obstáculo: " + e.getMessage());
      throw e;
    }
  }

  public Boolean getDestructible() {
    try {
      return destructible;
    } catch (Exception e) {
      System.err.println("Error al obtener el atributo destructible del obstáculo: " + e.getMessage());
      throw e;
    }
  }

  public void setType(ObstacleType type) {
    try {
      if (type == null) {
        throw new IllegalArgumentException("El tipo de obstáculo no puede ser nulo.");
      }
      this.type = type;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el tipo de obstáculo: " + e.getMessage());
      throw e;
    }
  }

  public void setDestructible(Boolean destructible) {
    try {
      if (destructible == null) {
        throw new IllegalArgumentException("El atributo destructible no puede ser nulo.");
      }
      this.destructible = destructible;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el atributo destructible del obstáculo: " + e.getMessage());
      throw e;
    }
  }
}
