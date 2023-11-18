
public class employee extends Person {
		int ID;
		int Salary;
		int Workinghours;
		String Position;
			
			public employee(String Name, int Age, String Nationality, String dateofbirth, int iD, int salary, int workinghours,
					String position) {
				super(Name, Age, Nationality, dateofbirth);
				ID = iD;
				Salary = salary;
				Workinghours = workinghours;
				Position = position;
			}
			public void work() {
				System.out.println(Name + " is working.");
			}
			public void email() {
				System.out.println(Name + " is writing an email.");
			}
			public void report() {
				System.out.println(Name + " is doing a report.");
			}
		}
	
