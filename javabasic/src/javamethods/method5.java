package javamethods;

public class method5 {
	
	double x= 10, y=20,z=30;

	public static void main(String[] args) {
		method5 m1 = new method5();
		System.out.println("input first number: " +m1.x);
		System.out.println("input first number: " +m1.y);
		System.out.println("input first number: " +m1.z);
        m1.average(m1.x, m1.y, m1.z);
	}
	
	public void average(double p,double q,double r){
		double res = (p + q + r) / 3;
		System.out.println("the average value is: " +res);
	}
}
