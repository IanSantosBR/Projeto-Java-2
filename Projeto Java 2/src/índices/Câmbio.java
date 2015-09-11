package índices;

public enum Câmbio {
	
	AUTOMÁTICO(1), SEMIAUTOMÁTICO(2), MANUAL(3);

	private int opção;

	private Câmbio(int opção) {
		this.opção = opção;
	}
	
	public int getOpção() {
        return opção;
    }
}