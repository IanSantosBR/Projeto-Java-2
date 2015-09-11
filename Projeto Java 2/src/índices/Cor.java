package índices;

public enum Cor {
	
	PRETO(1), BRANCO(2), CINZA(3), VERMELHO(4), AMARELO(5);

	private int opção;

	private Cor(int opção) {
		this.opção = opção;
	}
	
	public int getOpção() {
        return opção;
    }
}