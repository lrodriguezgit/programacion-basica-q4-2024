package ejercicios.petro.bombScape.game;

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

 //Acceder a sus tiles
}
