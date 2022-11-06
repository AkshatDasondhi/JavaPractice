class Game {
	private String game;
	private int size;

	public String getGame() { return game; }

	public void setGame(String game) { this.game = game; }

	public int getSize() { return size; }

	public void setSize(int size) { this.size = size; }
}

public class Encapsulation {
    public static void main(String[] args)
	{
		Game gta = new Game();
		gta.setGame("Grand Theft Auto");
		gta.setSize(72);
		System.out.println("Game: " + gta.getGame());
		System.out.println("Size: " + gta.getSize());
	}  
}

// ytassdaf