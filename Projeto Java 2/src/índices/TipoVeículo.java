package índices;

public enum TipoVeículo {

	CARRO(1), MOTO(2);
	
	private int opção;

	private TipoVeículo(int opção) {
		this.opção = opção;
	}
	
	public int getOpção() {
        return opção;
    }
}