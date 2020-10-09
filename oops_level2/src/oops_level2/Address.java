package oops_level2;

public class Address {

	private String line;
	private String Street;
	private String city;
	private String State;

	public Address(String line, String Street, String city, String State) {
		super();
		this.line = line;
		this.Street = Street;
		this.city = city;
		this.State = State;
	}

	// creation

	@Override
	public String toString() {
		return line + ";" + Street + ";" + city + ";" + State;
	}

}
