package ExceptionHandling;


public class exceptionhandle_throws {

	public static void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("person are eligible to vote");
		}
	}
	public static void main(String[] args) {
		validateAge(25);
		validateAge(15);
		System.out.println("rest of thr code");

	}

}
