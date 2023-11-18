
public class Student {
	
	int id;
	String name;
	float avg;
	int Grade;
	String [] subjects;
	
	public Student(int id, float avg, String name, int grade, String[] subjects) {
		super();
		id = id;
		this.avg = avg;
		this.avg = avg;
		Grade = grade;
		this.subjects = subjects;
		
	}
	public Student() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	

}
