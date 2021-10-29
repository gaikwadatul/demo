package Programme;

public class Star_series2 {

	public static void main(String[] args) {
		int rows = 5;
		for (int i=1; i<=rows; i++) 
        { 
            // Print space in decreasing order 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}

/* output
 
    *
   **
  ***
 ****
*****

*/