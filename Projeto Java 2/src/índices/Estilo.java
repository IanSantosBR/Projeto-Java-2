package �ndices;

public enum Estilo {
	
	PERUA(1), ESPORTIVO(2), SED�(3), HATCHBACK(4), TRAIL(5); 
	
	private int op��o;

	private Estilo(int op��o) {
		this.op��o = op��o;
	}
	
	public int getOp��o() {
        return op��o;
    }
}