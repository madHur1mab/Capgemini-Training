package assignment;

public class Student extends Person {
	private int rollNumber;
	private String grade;
	
	public int getRoll() {
		return rollNumber;
	}
	public void setRoll(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
