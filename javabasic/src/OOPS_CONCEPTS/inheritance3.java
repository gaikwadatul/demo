package OOPS_CONCEPTS;
//parent class 
class company{
	void display() {
		System.out.println("i am class company display");
	}
	
}

// child class of company
class employee extends company{
	void display() {
		System.out.println("i am employee class callme()");
	}
	//over-riding for below class 
	void callme() {
		System.out.println("i am employee class****()");
	}
}

public class inheritance3 {

	public static void main(String[] args) {
		employee e1 = new employee();
		e1.display();
		e1.callme();
		System.out.println("**********");
		company c1 = new company();
		c1.display();
	}
	

}
