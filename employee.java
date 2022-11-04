
public class employee {
	private String firstName;
	private String lastName;
	private String position;
	private double salary;
	private double hoursWorked;
	
	//Empty Constructor
	public employee() {
		this.firstName = " ";
		this.lastName = " ";
		this.position = " ";
		this.salary = 8.25;
		this.hoursWorked = 0;
	}
	
	//Full Constructor
	public employee(String firstName, String lastName, String position, 
			double salary, double hoursWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}
	
	//Getters
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public String getPos() {
		return position;
	}
	
	public double getSal() {
		return salary;
	}
	
	public double getHours() {
		return hoursWorked;
	}
	
	//Setters
	public void setFirst(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLast(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPos(String position) {
		this.position = position;
	}
	
	public void setSal(double salary) {
		this.salary = salary;
	}
	
	public void setHours(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	//Functions
	public double showCurrentPay() {
		double pay = 0;
		if (hoursWorked <= 40) {
			pay = hoursWorked * salary;
		} else {
			double overtime = hoursWorked - 40;
			pay = (40 * salary) + (overtime * salary * 1.5);
		}
		return pay;
	}
	
	public String displayPaycheck() {
		StringBuilder sb = new StringBuilder();
		sb.append("=====" + firstName.toUpperCase() + 
				lastName.toUpperCase() + "=====\n");
		sb.append("Hours worked: " + hoursWorked + "\n");
		sb.append("Position: " + position + "\n");
		sb.append("Salary: " + salary + "\n");
		sb.append("Total pay: " + this.showCurrentPay() + "\n");
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee em1 = new employee();
		em1.setFirst("John");
		em1.setLast("John2");
		em1.setPos("Manager");
		em1.setSal(9.25);
		em1.setHours(60);
		
		employee em2 = new employee("Hohn", "Doe", "The Boss", 20, 30);
		System.out.println(em2.displayPaycheck());
		
		System.out.println(em1.displayPaycheck());
		
		
		//System.out.println("Paycheck: " + em1.showCurrentPay());
	}

}
