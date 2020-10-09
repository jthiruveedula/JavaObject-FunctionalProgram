package collections;

public class Student implements Comparable<Student> {
	private String student;
	private int id;

	public Student(int id, String student) {
		super();

		this.student = student;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}



	@Override
	public String toString() {
		return id + " " + student;
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(that.id, this.id);
	}

}
