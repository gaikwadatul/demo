package ExceptionHandling;

import java.util.Scanner;

public class Exception_try_catch {

	public static void main(String[] args) {
		
		System.out.println("program stRTS FRMhere");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int i,j,res;
		System.out.println("Enter first number");
		i=scn.nextInt();
		System.out.println("Enter second number");
		j=scn.nextInt();
		try {
			res=i+j;
			System.out.println("Addition Result: "+res);	
		}catch(Exception e) {
			System.out.println("catcj exception is "+e);
			
		}		
     System.out.println("program end here....");
	}

}
