package �ndices;

public enum Fabricante {

    VOLKSWAGEN(1), HONDA(2), FORD(3), TOYOTA(4), HYUNDAI(5);

    private int op��o;

    private Fabricante(int op��o) {
        this.op��o = op��o;
    }

    public int getOp��o() {
        return op��o;
    }
}