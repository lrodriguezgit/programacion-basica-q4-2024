package ejercicios.petro.bombScape.entities.bomb;

import ejercicios.petro.bombScape.entities.Entity;

public class Bomb extends Entity {

  private final BombType type;

  private BombState state;
  private int maxAffectedTiles;


  public Bomb(BombType type, int maxAffectedTiles) {
    this.type = type;
    this.state = BombState.INACTIVE;
    this.maxAffectedTiles = maxAffectedTiles;
  }

  public BombType getType() {
    return type;
  }

  public int getMaxAffectedTiles() {
    return maxAffectedTiles;
  }

  public BombState getState() {
    return state;
  }

  public void setState(BombState state) {
    this.state = state;
  }

}
