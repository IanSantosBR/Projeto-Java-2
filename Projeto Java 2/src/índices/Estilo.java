package �ndices;

public enum Estilo {
	
	PERUA(0),
	ESPORTIVO(1),
	SED�(2),
	HATCHBACK(3),
	TRAIL(4); 
	
	private int op��o;
	
	public int getOp��o() {
		return op��o;
	}

	private Estilo(int op��o) {
		this.op��o = op��o;
	}	
}