package �ndices;

public enum TipoVe�culo {

	CARRO(0), 
	MOTO(1);
	
	private int op��o;
	
	public int getOp��o() {
		return op��o;
	}
	
	private TipoVe�culo(int op��o) {
		this.op��o = op��o;
	}
}