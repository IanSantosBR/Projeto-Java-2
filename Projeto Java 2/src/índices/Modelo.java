package �ndices;

public enum Modelo {
	
	GOLF(1), HRV(2), FOCUS(3), COROLLA(4), HB20(5);
	
	private int op��o;

	private Modelo(int op��o) {
		this.op��o = op��o;
	}
	
	public int getOp��o() {
        return op��o;
    }
}