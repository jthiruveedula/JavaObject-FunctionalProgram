package inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employer;
	private String grade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Constructor:--> Employee");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {

		return super.toString() + "\n" + title + "#" + employer + "#" + grade;

	}

}
