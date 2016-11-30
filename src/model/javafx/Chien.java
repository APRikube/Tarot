package model.javafx;

import java.util.ArrayList;

public class Chien {

	private ArrayList<Carte> content = new ArrayList<Carte>();

	public Chien(){

	}

	public void addCarte(Carte carte) {
		content.add(carte);
	}

	public ArrayList<Carte> getContent()
	{
		return content;
	}

}
