package Programme;

public class Reverse_number {

	public static void main(String[] args) {
		
		int number=54321,reverse=0;
		
		while(number!=0) {
			int reminder=number%10;
			reverse=reverse * 10 + reminder;
			number=number/10;
		}
		
    System.out.println("REverse number:" +reverse);
	}

}
