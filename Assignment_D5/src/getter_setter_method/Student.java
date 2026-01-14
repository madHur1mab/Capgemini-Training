package getter_setter_method;

public class Student {
	private int roll;
    private int marks;
    private int pass;

    public int getRollNo() {
        return roll;
    }

    public void setRollNo(int roll) {
        this.roll = roll;
    }

    public void setPassword(int pass) {
        this.pass = pass;
    }

    // Verification
    public int getMarks(int pass) {
        if (this.pass == pass) {
            return marks;
        }
        System.out.println("Invalid password");
        return 0;
    }

    // Validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100");
        }
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.setRollNo(101);
        s.setPassword(1234);
        s.setMarks(85); 

        System.out.println("Roll No : " + s.getRollNo());
        System.out.println("Marks   : " + s.getMarks(1234)); 
    }
}
