package índices;

public enum Estilo {
	
	PERUA(0),
	ESPORTIVO(1),
	SEDÃ(2),
	HATCHBACK(3),
	TRAIL(4); 
	
	private int opção;
	
	public int getOpção() {
		return opção;
	}

	private Estilo(int opção) {
		this.opção = opção;
	}	
}