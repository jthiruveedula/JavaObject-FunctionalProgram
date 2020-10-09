package inheritance;

public class Person {
	private String name;
	private String phone;
	private String email;

	public Person(String name) {
		super();
		this.name = name;
		System.out.println("Constructor:--> Person");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + "#" + phone + "#" + email;
	}

}
