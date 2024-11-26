package ejercicios.petro.bombScape.entities.bomb;

import ejercicios.petro.bombScape.entities.Entity;

public class Bomb extends Entity {

  private final BombType type;
  private final int maxAffectedTiles;
  private BombState state;

  public Bomb(BombType type, int maxAffectedTiles) {
    try {
      if (type == null) {
        throw new IllegalArgumentException("El tipo de bomba no puede ser nulo.");
      }
      if (maxAffectedTiles <= 0) {
        throw new IllegalArgumentException("El número máximo de Tiles afectados debe ser mayor a 0.");
      }
      this.type = type;
      this.state = BombState.INACTIVE;
      this.maxAffectedTiles = maxAffectedTiles;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al crear la bomba: " + e.getMessage());
      throw e;
    }
  }

  public BombType getType() {
    try {
      return type;
    } catch (Exception e) {
      System.err.println("Error al obtener el tipo de bomba: " + e.getMessage());
      throw e;
    }
  }

  public int getMaxAffectedTiles() {
    try {
      return maxAffectedTiles;
    } catch (Exception e) {
      System.err.println("Error al obtener el máximo de Tiles afectados: " + e.getMessage());
      throw e;
    }
  }

  public BombState getState() {
    try {
      return state;
    } catch (Exception e) {
      System.err.println("Error al obtener el estado de la bomba: " + e.getMessage());
      throw e;
    }
  }

  public void setState(BombState state) {
    try {
      if (state == null) {
        throw new IllegalArgumentException("El estado de la bomba no puede ser nulo.");
      }
      this.state = state;
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el estado de la bomba: " + e.getMessage());
      throw e;
    }
  }
}
