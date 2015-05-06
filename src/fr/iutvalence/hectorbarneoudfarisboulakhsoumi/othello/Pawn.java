package fr.iutvalence.hectorbarneoudfarisboulakhsoumi.othello;

/**
 * Othello Pawn.
 * 
 * @author Hector Barneoud / Faris Boulakhsoumi
 * @version 1.0.0
 */
public class Pawn {
	private Couleur couleur;

	public Pawn(Couleur couleur) {
		super();
		this.couleur = couleur;
	}

	public Couleur getCouleur() {
		return couleur;
	}
	
	public String toString()
	{
		return this.couleur.toString();
	}
	
	
}
