
import java.time.LocalDate;


public class employee {

	private String employeename;
	private long salary;
	private LocalDate birthday;
	
	static int pensionRemaningAge=65;
	
	
	
	
	public employee(String employeename, long salary, int age) {
		super();
		this.employeename = employeename;
		this.salary = salary;
		this.birthday = birthday;
	}
	
	public employee(String employeename, int age) {
		super();
		this.employeename = employeename;
		this.birthday = birthday;
		this.salary = LocalDate.now().getYear()-birthday.getYear()*10000;
	}
	

	public int getRemaningYearsUntilPansion() {
		
		return pensionRemaningAge-getAge();
	}
	
	public static employee getYoungerEmpoyee(employee employee1,employee employee2) {
		if(employee1.getRemaningYearsUntilPansion()>employee2.getRemaningYearsUntilPansion())return employee1;
		else return employee2;
	}
	
	
	
	
	
	
	

	public static int getPensionRemaningAge() {
		return pensionRemaningAge;
	}

	public static void setPensionRemaningAge(int pensionRemaningAge) {
		employee.pensionRemaningAge = pensionRemaningAge;
	}



	@Override
	public String toString() {
		return "employee [employeename=" + employeename + ", salary=" + salary + ", birthday=" + birthday
				+ ", getRemaningYearsUntilPansion()=" + getRemaningYearsUntilPansion() + "]";
	}

	public int getAge() {
		return LocalDate.now().getYear()-birthday.getYear();
	}


	public long incrasesalary(long incrase,long employeesalary) {
		return employeesalary+=incrase;
	}
	
	public String displayinfo() {
		return this.salary+this.employeename;
	}
	public String displayinfo2() {
		return this.salary+this.employeename;
		}


	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public boolean isInSalaryRange(long salarystart,long salaryend) {
		if (this.salary<salaryend&&this.salary>=salaryend) {
			return true;
		}
		else return false;
	}
	
	public long getTax() {
		return (long)(this .salary*0.16);
	}
	
	public boolean hasHigherSalary(employee employee1) {
		if(this.salary>employee1.salary) {
			return true;
		}else return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


