package �ndices;

public enum TipoVe�culo {

	CARRO(1), MOTO(2);
	
	private int op��o;

	private TipoVe�culo(int op��o) {
		this.op��o = op��o;
	}
	
	public int getOp��o() {
        return op��o;
    }
}