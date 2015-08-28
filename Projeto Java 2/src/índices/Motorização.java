package índices;


public enum Motorização {
	
	MOTORIZAÇÃO1(0){
		 public String toString() {
	            return "1.0";
	        }
	},
	MOTORIZAÇÃO2(1){
		 public String toString() {
	            return "1.3";
	        }
	},
	MOTORIZAÇÃO3(2){
		 public String toString() {
	            return "1.4";
	        }
	},
	MOTORIZAÇÃO4(3){
		 public String toString() {
	            return "1.5";
	        }
	},
	MOTORIZAÇÃO5(4){
		 public String toString() {
	            return "1.6";
	        }
	},
	MOTORIZAÇÃO6(5){
		 public String toString() {
	            return "1.8";
	        }
	},
	MOTORIZAÇÃO7(6){
		 public String toString() {
	            return "2.0";
	        }
	};
		
	private int opção;

	public int getOpção() {
		return opção;
	}

	private Motorização(int opção) {
		this.opção = opção;
	}
}