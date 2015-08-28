package índices;

public enum Câmbio {
	
	AUTOMÁTICO(0),
	SEMIAUTOMÁTICO(1),
	MANUAL(2);

	private int opção;
	
	public int getOpção() {
		return opção;
	}

	private Câmbio(int opção) {
		this.opção = opção;
	}
}