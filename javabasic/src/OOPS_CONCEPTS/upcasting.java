package OOPS_CONCEPTS;

class parent100{
	void myhome() {
		System.out.println("parent home");
	}
}

class child100 extends parent100{
  void mycar() {
	   System.out.println("child car");  
    }
  }
public class upcasting {

	public static void main(String[] args) {
		parent100 p1 = new child100(); //upcasting or implicit myhome/mycar
		p1.myhome();
		child100 c2=(child100)p1;    //explicitly downcasting
		c2.mycar();
		c2.myhome();
		
		

	}

}
