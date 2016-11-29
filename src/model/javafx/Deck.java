package model.javafx;

import java.util.ArrayList;
import model.javafx.Carte;

public class Deck{

	ArrayList<Carte> deck = new ArrayList<Carte>(); 
	
	public Deck()
	{
		for(int i=0; i<78; i++)
		{
		Carte Test = new Carte("file:./ressources/Trumps_21.jpg", 400, 300);
		deck.add(Test);
		}
	}
	
	public int getSize()
	{
		return deck.size();
	}
	
}
