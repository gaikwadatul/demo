package collection;

import java.util.ArrayList;

public class demo3 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
        list.add("atul");
        list.add("amol");
        list.add("ajit");
        list.add("raj");
        System.out.println("size of list: "+list.size());
        System.out.println("Element of list: "+list);
        System.out.println("print of elemnt present"+list.get(0));
       
        ArrayList added=new ArrayList();
       System.out.println("List all element is :");
       added.add("BBBB");
       added.add("AAA");
        System.out.println("list of add array: "+added);
        list.addAll(added);
        System.out.println("list of element:  "+list);
        
        
        
	}

}
