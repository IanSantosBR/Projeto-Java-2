package �ndices;

public enum Cor {
	
	PRETO(1), BRANCO(2), CINZA(3), VERMELHO(4), AMARELO(5);

	private int op��o;

	private Cor(int op��o) {
		this.op��o = op��o;
	}
	
	public int getOp��o() {
        return op��o;
    }
}