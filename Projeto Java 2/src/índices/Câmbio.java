package �ndices;

public enum C�mbio {
	
	AUTOM�TICO(0),
	SEMIAUTOM�TICO(1),
	MANUAL(2);

	private int op��o;
	
	public int getOp��o() {
		return op��o;
	}

	private C�mbio(int op��o) {
		this.op��o = op��o;
	}
}