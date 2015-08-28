package índices;

public enum Cor {
	
	PRETO(0),
	BRANCO(1),
	CINZA(2),
	VERMELHO(3),
	AMARELO(4);

	private int opção;
	
	public int getOpção() {
		return opção;
	}

	private Cor(int opção) {
		this.opção = opção;
	}
}