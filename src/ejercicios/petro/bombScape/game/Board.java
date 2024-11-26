package ejercicios.petro.bombScape.game;

import ejercicios.petro.bombScape.entities.Entity;
import ejercicios.petro.bombScape.entities.Tile;

public class Board {
  private int size;
  private Tile[][] terrain;

  public Board(int size) {
    try {
      if (size <= 0) {
        throw new IllegalArgumentException("El tamaño del tablero debe ser mayor a 0.");
      }
      this.size = size;
      setTerrain(size);
      System.out.println("Tablero Creado de tamaño: " + this.size + "x" + this.size);
    } catch (IllegalArgumentException e) {
      System.err.println("Error al crear el tablero: " + e.getMessage());
      throw e;
    }
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    try {
      if (size <= 0) {
        throw new IllegalArgumentException("El tamaño del tablero debe ser mayor a 0.");
      }
      this.size = size;
      setTerrain(size);
    } catch (IllegalArgumentException e) {
      System.err.println("Error al establecer el tamaño del tablero: " + e.getMessage());
      throw e;
    }
  }

  public Tile[][] getTerrain() {
    return terrain;
  }

  public void setTerrain(int size) {
    try {
      if (size <= 0) {
        throw new IllegalArgumentException("El tamaño del terreno debe ser mayor a 0.");
      }
      terrain = new Tile[size][size];
      int id = 1;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          terrain[i][j] = new Tile(false, i, j, id++);
        }
      }
    } catch (Exception e) {
      System.err.println("Error al establecer el terreno: " + e.getMessage());
      throw e;
    }
  }

  public void placeObject(Entity object, Integer posX, Integer posY) {
    try {
      if (object == null) {
        throw new IllegalArgumentException("El objeto no puede ser nulo.");
      }
      if (isPositionValid(posX, posY)) {
        throw new IllegalArgumentException("La posición está fuera de los límites del tablero.");
      }
      object.setPosX(posX);
      object.setPosY(posY);
      Tile tile = getTileByPosition(posX, posY);
      tile.placeObject(object);
      System.out.println("Objeto tipo  "  + object.getClass().getSimpleName() + " ubicado en posicion " + posX + " " + posY);

    } catch (Exception e) {
      System.err.println("Error al colocar el objeto en el tablero: " + e.getMessage());
      throw e;
    }
  }

  public void removeObject(Entity object) {
    try {
      if (object == null) {
        throw new IllegalArgumentException("El objeto no puede ser nulo.");
      }
      if (object.getPosX() == null || object.getPosY() == null) {
        throw new IllegalStateException("El objeto no tiene una posición válida para eliminarse.");
      }
      Tile tile = getTileByPosition(object.getPosX(), object.getPosY());
      int posX = object.getPosX();
      int posY = object.getPosY();

      tile.removeObject();
      object.setPosX(null);
      object.setPosY(null);
      System.out.println("Objeto tipo  "  + object.getClass().getSimpleName() + " retirado de de posicion " + posX + " " + posY);

    } catch (Exception e) {
      System.err.println("Error al eliminar el objeto del tablero: " + e.getMessage());
      throw e;
    }
  }

  public Tile getTileByPosition(Integer posX, Integer posY) {
    try {
      if (isPositionValid(posX, posY)) {
        throw new IllegalArgumentException("La posición está fuera de los límites del tablero.");
      }
      return terrain[posX][posY];
    } catch (Exception e) {
      System.err.println("Error al obtener el Tile en la posición (" + posX + ", " + posY + "): " + e.getMessage());
      throw e;
    }
  }

  private boolean isPositionValid(Integer posX, Integer posY) {
    return posX == null || posY == null || posX < 0 || posX >= size || posY < 0 || posY >= size;
  }
}
