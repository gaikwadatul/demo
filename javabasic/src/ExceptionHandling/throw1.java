package ExceptionHandling;

class userDefinedException extends Exception{
	public userDefinedException(String str) {
		super(str);
	}
}

public class throw1 {

	public static void main(String[] args) {
		
		try {
			//throw an object of user defined exception
			throw new userDefinedException("This is user defined exception");
		}catch(userDefinedException ude){
			System.out.println(ude);
			//ude.printStackTrace();
			
		}
		System.out.println("rest code");
	}

}
