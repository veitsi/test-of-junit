package calc;

class Calc {
	//some comment here
	int a;
	int b;
	
	Calc(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public int Add(){
		return a+b;		
	}

	public static void main(String[] args) {
		System.out.println("in Calc::main");

	}

}
