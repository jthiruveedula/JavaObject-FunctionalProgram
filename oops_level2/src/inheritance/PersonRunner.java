package inheritance;

import java.math.BigDecimal;

public class PersonRunner {

	public static void main(String[] args) {

		Employee employee = new Employee("Jagadeesh", "Sr.DataEngineer");
//		employee.setName("Jagadeesh");
		employee.setEmail("tjagadeesh77@gmail.com");
		employee.setGrade("A++");
		employee.setPhone("9292807777");
		employee.setSalary(new BigDecimal("12000"));
//		employee.setTitle("Data-Engineer");
		employee.setEmployer("Wipro");

		System.out.println(employee);

	}

}
