package �ndices;

public enum Cor {
	
	PRETO(0),
	BRANCO(1),
	CINZA(2),
	VERMELHO(3),
	AMARELO(4);

	private int op��o;
	
	public int getOp��o() {
		return op��o;
	}

	private Cor(int op��o) {
		this.op��o = op��o;
	}
}