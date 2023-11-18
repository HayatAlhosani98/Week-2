import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the stars in each side of square: ");
	    int sideSize = scanner.nextInt();


	    for (int i = 0; i < sideSize; i++ )
	    {
	      for (int j = 0 ; j < sideSize; j++ )
	      {
	        if (i == 0 || i == sideSize - 1 || j == 0 || j == sideSize - 1)
	        {
	          System.out.print("*"+" ");
	        }
	        else {
	         
	          System.out.print(" "+ " ");
	        }
	      }
	      System.out.println();
	    }
	}

}
