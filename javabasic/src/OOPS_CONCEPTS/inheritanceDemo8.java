package OOPS_CONCEPTS;

class chain{
	 chain() {
		System.out.println("chain constructor..");
	}
}

class chain2 extends chain{
	chain2(int i) {
		super();
		System.out.println("chain2 constructor..");
	}
}
public class inheritanceDemo8 extends chain2 {

	inheritanceDemo8(){
		super(10);
		System.out.println("chaining constructor");
	}
	public static void main(String[] args) {
		
		inheritanceDemo8 c1= new inheritanceDemo8();
		
		

	}

}
