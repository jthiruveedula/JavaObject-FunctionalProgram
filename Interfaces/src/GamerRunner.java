
public class GamerRunner {

	public static void main(String[] args) {

		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		for (GamingConsole game : games) {
		game.up();
		game.down();
		game.left();
		game.right();
	}


	}

}
