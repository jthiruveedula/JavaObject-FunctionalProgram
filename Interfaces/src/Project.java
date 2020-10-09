
public class Project {

	public static void main(String[] args) {

		ComplexAlgo algo = new DummyAlgo();
		System.out.println(algo.ComplexAlgo(30, 40));
		ComplexAlgo ralgo = new RealAlgo();
		System.out.println(ralgo.ComplexAlgo(40, 20));

	}

}
