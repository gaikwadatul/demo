package OOPS_CONCEPTS;

class A1{	
	static int a=10;
	int b=20;
	double c=13.20;
   }
class B1 extends A1{	
	static int x=20;
	int y=20;
	double z=13.20;
   }
class C1 extends B1{	
	static int p=50;
	int q=60;
	double r=53.20;
   }
	
public class Inheritance {
	
	public static void main(String[] args) {
		// **********Access static member class A1 members***
		System.out.println("Class A1 static variable:"+A1.a);
		// *********Access static member class B1 members***
		System.out.println("Class B1 static variable:"+B1.x);
		// ***********Access static member class C1 members***
		System.out.println("Class C1 static variable:"+C1.p);

		//**********create object
		System.out.println("********************");
	C1 c1=new C1();
	System.out.println("with class c refer:" +c1.b);
	System.out.println("with class c refer:" +c1.c);
	System.out.println("with class c refer:" +c1.q);
	System.out.println("with class c refer:" +c1.r);
	System.out.println("with class c refer:" +c1.y);
	System.out.println("with class c refer:" +c1.z);
	B1 b1= new B1();
	System.out.println("with class B refer:" +b1.b);
	System.out.println("with class B refer:" +b1.c);
	System.out.println("with class B refer:" +b1.y);
	System.out.println("with class B refer:" +b1.z);
	
	
	}

}
