package String_class;

public class string_class1 {

	public static void main(String[] args) {
		String s1 ="mumbai";
		String s2 ="mumbai";
		String s3 ="banglorw";
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		System.out.println("s1 char count : "+s1.length());
		System.out.println("s1 char count : "+s2.length());
		System.out.println("s1 char count : "+s3.length());

		System.out.println("s1 & s2 equals : "+s1.equals(s2));
		System.out.println("s1 & s2 using'=='" +(s1==s2));
		
		System.out.println("s1 & s3 equals : "+s1.equals(s3));
		System.out.println("s1 & s3 using'=='" +(s1==s3));
 
      	
		String s4 = new String("Mumbai");
		System.out.println("s4 : "+s4);
		
		System.out.println("s1 & s4 equals : "+s1.equals(s4));
		System.out.println("s1 & s4 using'=='" +(s1==s4));
 
		String s5 = new String("Mumbai");
		System.out.println("s5 : "+s5);
		
		System.out.println("s4 & s5 equals : "+s4.equals(s5));//compare s5 and s3 values -->true
		System.out.println("s4 & s5 using'=='" +(s4==s5)); //compare s5 and s4 values -->false
 
	}

}
