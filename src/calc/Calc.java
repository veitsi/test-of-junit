package calc;

class Calc {
	//some comment here
	//new comment added
	// 3-rd comment added
	int a;
	int b;
	
	Calc(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public int Add(){
		return a+b;		
	}
	public int Sub() {
		return a-b;
	}

	public static void main(String[] args) {
		System.out.println("in Calc::main 2");
		System.out.println("another print added");
		Calc n=new Calc(4,2);
		System.out.println("a-b "+n.Sub());

	}

}
