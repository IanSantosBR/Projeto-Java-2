package �ndices;

public enum Modelo {
	
	GOLF(0),
	HRV(1),
	FOCUS(2),
	COROLLA(3),
	HB20(4);
	
	private int op��o;
	
	public int getOp��o() {
		return op��o;
	}

	private Modelo(int op��o) {
		this.op��o = op��o;
	}
}