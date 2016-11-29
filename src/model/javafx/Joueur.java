package model.javafx;

import java.util.ArrayList;

public class Joueur {

	private ArrayList<Carte> main = new ArrayList<Carte>();
	private int numPlayer; //pas sûr
	
	public Joueur(int numPlayer)
	{
		this.numPlayer = numPlayer;
	}
	
	public void addCarte(Carte carte) {
		main.add(carte);
	}
	
	public ArrayList<Carte> getJeu()
	{
		return main;
	}
	
	public int getNumPlayer()
	{
		return numPlayer;
	}
}
