package OOPS_CONCEPTS;

interface i11{
	//variable
	//method
	//no constructor
}
interface Drawable1{
	public abstract void draw();
}
//Implementation : by second user
class Rectangle11 implements Drawable1{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 implements Drawable1{
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class interface1 {

	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		r1.draw(); // drawing rectangle
		circle c1 = new circle();
		c1.draw();
		Circle1 d = new Circle1();
		d.draw();// drawing circle
				

	}

}
