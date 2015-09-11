package índices;

public enum Estilo {
	
	PERUA(1), ESPORTIVO(2), SEDÃ(3), HATCHBACK(4), TRAIL(5); 
	
	private int opção;

	private Estilo(int opção) {
		this.opção = opção;
	}
	
	public int getOpção() {
        return opção;
    }
}