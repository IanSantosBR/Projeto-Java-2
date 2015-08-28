package índices;

public enum TipoVeículo {

	CARRO(0), 
	MOTO(1);
	
	private int opção;
	
	public int getOpção() {
		return opção;
	}
	
	private TipoVeículo(int opção) {
		this.opção = opção;
	}
}