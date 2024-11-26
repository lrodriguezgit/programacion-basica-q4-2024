package ejercicios.petro.bombScape.game;

import ejercicios.petro.bombScape.entities.Entity;
import ejercicios.petro.bombScape.entities.Tile;

public class Board {
  private int size;
  private Tile[][] terrain;

  public Board(int size) {
    this.size = size;
    setTerrain(size);
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Tile[][] getTerrain() {
    return terrain;
  }

  public void setTerrain(int size) {
    terrain = new Tile[size][size];
    int id = 1;
    for (int i = 0; i < this.size; i++) {
      for (int j = 0; j < this.size; j++) {
        terrain[i][j] = new Tile(false, i, j, id++);
      }
    }
  }

  public void placeObject(Entity object, Integer posX, Integer posY) {
    object.setPosX(posX);
    object.setPosY(posY);
    Tile tile = getTileByPosition(posX, posY);
    tile.placeObject(object);
  }

  public void removeObject(Entity object, Integer posX, Integer posY) {
    object.setPosX(null);
    object.setPosY(null);
    Tile tile = getTileByPosition(posX, posY);
    tile.removeObject();
  }

  public Tile getTileByPosition(Integer posX, Integer posY) {
    return terrain[posX][posY];
  }

  ;
}

