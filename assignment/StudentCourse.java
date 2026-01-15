package assignment;

public class StudentCourse {
	
	private Student student;
	private Course course;
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public void showStudentCourseDetails() {
		 System.out.println("----- Student Details -----");
		 System.out.println("Name: " + student.getName());
		 System.out.println("Age: " + student.getAge());
		 System.out.println("Roll No: " + student.getRoll());
		 System.out.println("Grade: " + student.getGrade());

		 System.out.println("----- Course Details ------");
		 System.out.println("Course ID: " + course.getId());
	     System.out.println("Course Name: " + course.getCourse());
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setRoll(12);
		s.setName("xyz");
		s.setAge(18);
		s.setGrade("A");
		
        Course c = new Course();
        c.setId(101);
        c.setCourse("Java");

        
        StudentCourse sc = new StudentCourse();
        sc.setStudent(s);
        sc.setCourse(c);

       
        sc.showStudentCourseDetails();
	}
}
