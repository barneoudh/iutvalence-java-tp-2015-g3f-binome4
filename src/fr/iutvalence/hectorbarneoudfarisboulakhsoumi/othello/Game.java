package fr.iutvalence.hectorbarneoudfarisboulakhsoumi.othello;

/**
 * Othello game: the players and the grid.
 * 
 * @author Hector Barneoud / Faris Boulakhsoumi
 * @version 1.0.0
 * @see Player
 * @see Grid
 */
public class Game {
	/** Player 1. */
	private final Player player1;
	/** We define a player two with player type. */
	private final Player player2;
	/** A game takes a grid with Grid type as attribute. */
	private final Grid grid;
	private int CASE_AVAILABLE_NUMBER;

	/**
	 * @param We assign Black pawns to the player 1
	 * @param We assign White pawns to the player 2
	 */
	public Game(String player1, String player2) {
		this.player1 = new Player(player1, Couleur.BLACK);
		this.player2 = new Player(player2, Couleur.WHITE);
		this.grid = new Grid();
	}

	public void start() {
		System.out.println(grid);

		
		while(CASE_AVAILABLE_NUMBER < 64) // while an operation is possible
		{
			
		
			// TODO Demander la position 
			// TODO Tenter le coup grid.putPawn(position, Pawn.BLACK);
			// TODO 	Sinon -> Redemander
			// TODO Afficher le nouvel �tat de la grille.
		
			
		}
		
		
	}

}
