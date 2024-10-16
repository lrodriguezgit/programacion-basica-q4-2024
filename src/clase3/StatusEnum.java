package clase3;

public enum StatusEnum {
    ACTIVE("Activo"), INACTIVE("Inactivo"), EXPIRED("Expirado");

    final String nameEspanol;

    StatusEnum(String nombre) {
        this.nameEspanol = nombre;
    }

    public String getNameEspanol() {
        return nameEspanol;
    }
}
