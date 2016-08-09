package genericSort;

public class Employee implements Comparable<Employee> {

	private Long employeeNumber;
	private String firstName;
	private String lastName;
	private String emailId;
	
	Employee(Long employeeNumber,String firstName,String lastname,String emailId){
		this.employeeNumber = employeeNumber;
		this.firstName=firstName;
		this.lastName=lastname;
		this.emailId=emailId;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.employeeNumber>o.employeeNumber)return 1;
		if(this.employeeNumber==o.employeeNumber)return 0;
		return -1;
	}
	
	@Override
	public String toString() {
		return "Employe ID is: " + this.employeeNumber;
	}

}
