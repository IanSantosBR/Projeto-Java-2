package �ndices;

public enum C�mbio {
	
	AUTOM�TICO(1), SEMIAUTOM�TICO(2), MANUAL(3);

	private int op��o;

	private C�mbio(int op��o) {
		this.op��o = op��o;
	}
	
	public int getOp��o() {
        return op��o;
    }
}