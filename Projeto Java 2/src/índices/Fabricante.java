package �ndices;

public enum Fabricante {
	
	VOLKSWAGEN(0), 
	HONDA(1),  
	FORD(2), 
	TOYOTA(3),  
	HYUNDAI(4);
	
	private int op��o;
	
	public int getOp��o() {
		return op��o;
	}

	private Fabricante(int op��o) {
		this.op��o = op��o;
	}
}