package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		System.out.println("program stRTS FRMhere");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int i,j,res;
		System.out.println("Enter first number");
		i=scn.nextInt();
		System.out.println("Enter second number");
		j=scn.nextInt();
		res=i/j;
		System.out.println("Res: "+res);
		System.out.println("Program end here....");
		
	}

}
