package ExceptionHandling;

public class ExceptionHandling_array {

	public static void main(String[] args) {
		System.out.println("Program strat here ..");
       int[] empIds= {10,20,30};
    		   
       try {
    	   		System.out.println(empIds[3]);
       }catch(ArrayIndexOutOfBoundsException e) {
    	   		System.out.println("Exception Handled.."+e);
     }	
       			System.out.println("program end here....");
  }
}
