import java.util.Scanner;

public class Ora3 {
	
public static void main(String[] args) {
	

	
			
			System.out.println("hány alkalmazott szeretnél");
			Scanner scanner=new Scanner(System.in);
			int numberofEmployees=scanner.nextInt();
			
			employee[] employees=new employee[numberofEmployees];
			
			for (int i = 0; i < employees.length; i++) {
				System.out.println("input name");
				String name=scanner.next();
				System.out.println("input age");
				int age=scanner.nextInt();
				
				employees[i]=new employee(name, age);
				System.out.println(employees[i]);
				
				
			}
			employee.setPensionRemaningAge(75);
			
			for (employee employee2 : employees) {
				if(employee2.getPensionRemaningAge()<5) {
					System.out.println(employee2);
				}
			}
			
			for (int i = 0; i < employees.length-1; i++) {
				int max=i;
				
				for (int j = i+1; j < employees.length; j++) {
					
					if (employees[max].getRemaningYearsUntilPansion()<employees[j].getRemaningYearsUntilPansion()) {
						max=j;
					}
					
					}
				employee tempEmployee=new employee(employees[i].getEmployeename(), employees[i].getAge());
				employees[i]=new employee(employees[max].getEmployeename(), employees[max].getAge());
				employees[max]=new employee(tempEmployee.getEmployeename(), tempEmployee.getAge());
					
				}
			
			
			
			}
			

			


}

