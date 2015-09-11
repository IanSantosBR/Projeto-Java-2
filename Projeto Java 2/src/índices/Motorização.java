package índices;


public enum Motorização {
	
	MOTORIZAÇÃO1(1){
		 public String toString() {
	            return "1.0";
	        }
	},
	MOTORIZAÇÃO2(2){
		 public String toString() {
	            return "1.3";
	        }
	},
	MOTORIZAÇÃO3(3){
		 public String toString() {
	            return "1.4";
	        }
	},
	MOTORIZAÇÃO4(4){
		 public String toString() {
	            return "1.5";
	        }
	},
	MOTORIZAÇÃO5(5){
		 public String toString() {
	            return "1.6";
	        }
	},
	MOTORIZAÇÃO6(6){
		 public String toString() {
	            return "1.8";
	        }
	},
	MOTORIZAÇÃO7(7){
		 public String toString() {
	            return "2.0";
	        }
	};
		
	private int opção;

	private Motorização(int opção) {
		this.opção = opção;
	}
	
	public int getOpção() {
        return opção;
    }
}