
public class WhileRunner {
	public static void main(String[] args) {

		WhileNumberPlayer player = new WhileNumberPlayer(300);
		System.out.println("Squares output");
		player.printSquaresUptoLimit();
		System.out.println("Cubes output");
		player.printCubesUptoLimit();

	}

}
