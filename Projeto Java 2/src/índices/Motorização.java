package �ndices;


public enum Motoriza��o {
	
	MOTORIZA��O1(0){
		 public String toString() {
	            return "1.0";
	        }
	},
	MOTORIZA��O2(1){
		 public String toString() {
	            return "1.3";
	        }
	},
	MOTORIZA��O3(2){
		 public String toString() {
	            return "1.4";
	        }
	},
	MOTORIZA��O4(3){
		 public String toString() {
	            return "1.5";
	        }
	},
	MOTORIZA��O5(4){
		 public String toString() {
	            return "1.6";
	        }
	},
	MOTORIZA��O6(5){
		 public String toString() {
	            return "1.8";
	        }
	},
	MOTORIZA��O7(6){
		 public String toString() {
	            return "2.0";
	        }
	};
		
	private int op��o;

	public int getOp��o() {
		return op��o;
	}

	private Motoriza��o(int op��o) {
		this.op��o = op��o;
	}
}