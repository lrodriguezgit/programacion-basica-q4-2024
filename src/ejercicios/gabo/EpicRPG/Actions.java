public enum Actions {
    BUFF(1),
    NORMAL_ATTACK(2),
    SPECIAL_ATTACK(3);

    private final int value;

    // Constructor para asignar el valor a cada constante
    Actions(int value) {
        this.value = value;
    }

    // Método para obtener el valor
    public int getValue() {
        return value;
    }
}