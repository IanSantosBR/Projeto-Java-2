package �ndices;


public enum Motoriza��o {
	
	MOTORIZA��O1(1){
		 public String toString() {
	            return "1.0";
	        }
	},
	MOTORIZA��O2(2){
		 public String toString() {
	            return "1.3";
	        }
	},
	MOTORIZA��O3(3){
		 public String toString() {
	            return "1.4";
	        }
	},
	MOTORIZA��O4(4){
		 public String toString() {
	            return "1.5";
	        }
	},
	MOTORIZA��O5(5){
		 public String toString() {
	            return "1.6";
	        }
	},
	MOTORIZA��O6(6){
		 public String toString() {
	            return "1.8";
	        }
	},
	MOTORIZA��O7(7){
		 public String toString() {
	            return "2.0";
	        }
	};
		
	private int op��o;

	private Motoriza��o(int op��o) {
		this.op��o = op��o;
	}
	
	public int getOp��o() {
        return op��o;
    }
}