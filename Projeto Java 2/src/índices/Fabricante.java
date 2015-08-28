package índices;

public enum Fabricante {
	
	VOLKSWAGEN(0), 
	HONDA(1),  
	FORD(2), 
	TOYOTA(3),  
	HYUNDAI(4);
	
	private int opção;
	
	public int getOpção() {
		return opção;
	}

	private Fabricante(int opção) {
		this.opção = opção;
	}
}