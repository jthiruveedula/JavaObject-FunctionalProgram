
interface Flyable {
	void fly();

}

class Bird implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying with help of Wings");
	}
	
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying with help of Fuel");
	}

}

public class FylableRunner {
	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}

//		Aeroplane aeroplane = new Aeroplane();
//		aeroplane.fly();
		
	}

}
