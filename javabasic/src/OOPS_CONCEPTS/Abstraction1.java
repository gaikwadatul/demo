package OOPS_CONCEPTS;

abstract class bike1{
	abstract void run();
	void speed(int spd) {
		System.out.println("bike speed "+spd);
	}
}

class Honda4 extends bike1{
	void run(){
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda speed "+spd);
	}
	void color() {
		System.out.println("honda color is blue");
	   
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(100);
		obj.color();
		bike1 b1 = new Honda4();
        b1.run();
        b1.speed(60);
      
	}

}
