
public class Pattern {
	
	String Name;
	
	
	
	public void LowerTri(int lines) {
        for(int i=0;i<lines;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(j+1);
        	}
    		System.out.println();

        }
	}
	
	public void RevTri(int lines) {
        for(int i=0;i<lines;i++) {
        	for(int j=0;j<lines-i;j++) {
        		System.out.print(j+1);
        	}
    		System.out.println();
    		}
        }
    		
    public void CompTri(int lines) {
    	   for(int i=0;i<lines-1;i++) {
    	       for(int j=0;j<=i;j++) {
    	        	System.out.print(j+1);
    	        	}
    	    	System.out.println();

        }
    	   
    	   for(int i=0;i<lines;i++) {
    		   for(int j=0;j<lines-i;j++) {
    			   System.out.print(j+1);
	        	}
	    	System.out.println();

    			   
    		   }
    	   }

	

	



	
public Pattern() {
		
	}

  
	

}
