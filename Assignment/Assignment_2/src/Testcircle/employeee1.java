package Testcircle;

public class employeee1  {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "Anamika", "Tripathi", 36875);
		Employee employee1=new Employee(102, "Aditya", "Pal", 48000);
		
		employee.raiseSalary(10);
		employee1.raiseSalary(10);
		
		System.out.println(employee);
		System.out.println(employee1);
	}
}