package collection;

import java.util.ArrayList;

public class collectiondemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add("Pune");
		al.add("banglore");
		al.add("mumbai");
		al.add("chennai");
		al.add("MP");
		System.out.println("array list element count: "+al.size());
		System.out.println("Arraylist element are: "+al);
	
	   
		al.add(1, "banglore");
	    System.out.println("array list element count: "+al.size());
		System.out.println("Arraylist element are: "+al);
	
	}

}
