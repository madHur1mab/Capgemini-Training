package getter_setter_method;

public class Employee {
	private int id;
    private double salary;
    private int pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    // Verification
    public double getSalary(int pass) {
        if (this.pass == pass) {
            return salary;
        }
        System.out.println("Invalid secret password");
        return 0.0;
    }

    // Validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
    
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(501);
        e.setPass(4321);
        e.setSalary(55000);

        System.out.println("Employee ID : " + e.getId());
        System.out.println("Salary : " + e.getSalary(4321));
    }
}
