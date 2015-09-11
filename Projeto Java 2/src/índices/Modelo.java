package índices;

public enum Modelo {
	
	GOLF(1), HRV(2), FOCUS(3), COROLLA(4), HB20(5);
	
	private int opção;

	private Modelo(int opção) {
		this.opção = opção;
	}
	
	public int getOpção() {
        return opção;
    }
}