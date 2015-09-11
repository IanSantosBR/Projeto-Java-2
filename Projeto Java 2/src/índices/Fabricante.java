package índices;

public enum Fabricante {

    VOLKSWAGEN(1), HONDA(2), FORD(3), TOYOTA(4), HYUNDAI(5);

    private int opção;

    private Fabricante(int opção) {
        this.opção = opção;
    }

    public int getOpção() {
        return opção;
    }
}