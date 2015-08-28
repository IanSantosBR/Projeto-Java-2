package índices;

public enum Modelo {
	
	GOLF(0),
	HRV(1),
	FOCUS(2),
	COROLLA(3),
	HB20(4);
	
	private int opção;
	
	public int getOpção() {
		return opção;
	}

	private Modelo(int opção) {
		this.opção = opção;
	}
}