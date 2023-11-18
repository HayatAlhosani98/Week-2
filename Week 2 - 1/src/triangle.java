
public class triangle {
	
	public void triangle1(int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j+1);

			}
			for (int j = 0; j <= i; j++) {

				System.out.print(j+1);
			}
			System.out.println();
		}
	}
		
		public void dia(int lin) {
	        for (int i = 0; i < lin; i++) 
	        {
	        	for (int j = 0; j < lin - i; j++) 
	                {
	                    System.out.print(" ");
			}
	                    for (int j = i; j > 0; j--) 
	                {
	                    System.out.print(j+1);
			}
	                    for (int j = 0; j <= i; j++) 
	                {
	                    System.out.print(j+1);
			}
		    System.out.println();
	        }
	        for (int i = lin-1; i >= 0; i--) 
	        {
	        	for (int j = 0; j < lin - i; j++) 
	                {
	                    System.out.print(" ");
			}
	                    for (int j = i; j > 0; j--) 
	                {
	                    System.out.print(j+1);
			}
	                    for (int j = 0; j <= i; j++) 
	                {
	                    System.out.print(j+1);
			}
		    System.out.println();
	        }
	    }
		
		
		public void dimoand(int lines) {
			for(int i=0; i<lines-1;i++) {//for the lines
				for (int j=0;j<lines-i;j++) {//for the first triangle
					System.out.print(" ");
				}
				for (int j=i;j>0;j--) {//for the reverse characters on each line
					System.out.print(j+1);
			}
				for (int j=0;j<=i;j++) {// for the characters of the last triangle
					System.out. print(j+1);
			}
				System.out.println();
		}
			for(int i=lines-1; i>=0;i--) {//for the lines
				for (int j=0;j<lines-i;j++) {//for the first triangle
					System.out.print(" ");
				}
				for (int j=i;j>0;j--) {//for the reverse characters on each line
					System.out.print(j+1);
			}
				for (int j=0;j<=i;j++) {// for the characters of the last triangle
					System.out. print(j+1);
			}
				System.out.println();
		}
		}
		
		public void triangles (int l) {
			for (int i = 0; i < l-1; i++) {
				for (int j = 0; j < l - i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j > 0; j--) {
					System.out.print(j+1);

				}
				for (int j = 0; j <= i; j++) {

					System.out.print(j+1);
				}
				System.out.println();
			}
			
		}
	
	
	
 public void trianglerev (int lines) {
	for (int i = lines-1; i >= 0; i--) {
		for (int j = 0; j < lines - i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j > 0; j--) {
			System.out.print(j+1);

		}
		for (int j = 0; j <= i; j++) {

			System.out.print(j+1);
		}
		System.out.println();
	}
	
}
		

		
	}



