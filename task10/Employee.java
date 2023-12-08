package task10;

// Task-10 - Question2- Employee Salary

public class Employee {
	
    // input id-1,Firstname-Santhosh,Lastname-Kumar,Salary-25000;

	// Storing Multiple variables in different Data types
	
	public int id;
	public String firstName;
	public String lasttName;
	public String name;
	public double salary;
	
	// using constructor method with parameters

	public Employee(int id, String firstName, String lastName, double salary) {
		
		this.id = id;
		this.name = firstName + lastName;
		this.salary = salary;
	}

	//Using return method
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	//raiseSalary method is implemented with parameters
	public void raiseSalary(double percent) {
		
		double raiseAmount = salary * (percent / 100);
		
		salary += raiseAmount;
	}

	public static void main(String[] args) {
		
		// Object is created for the Employee class
		
		Employee emp = new Employee(1, "Santhosh", "Kumar", 25000.0);
		
		
		
		System.out.println("ID                     : " + emp.id);
		
		System.out.println("Name                   : " + emp.getName());
		
		System.out.println("Current annual salary  : " + emp.getSalary() * 12);

		emp.raiseSalary(10); // Increase the salary by 10%
		
		System.out.println("Increased annual salary: " + emp.getSalary() * 12);
	}

}

//Output

/* ID                     : 1
   Name                   : SanthoshKumar
   Current annual salary  : 300000.0
   Increased annual salary: 330000.0      */
