
public class Run_Exception {

	public static void main(String[] args) {
		
		Test_Exception te = new Test_Exception();
		int [] a = {22,33,44,55,66,77};
		try {
			System.out.println(a[5]);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}


	}

}
