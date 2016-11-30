package model.javafx;

import java.util.ArrayList;
import java.util.Collections;

import javafx.scene.Group;
import javafx.scene.image.Image;
import model.javafx.Carte;

public class Deck extends Group{

	private ArrayList<Carte> deck = new ArrayList<Carte>(); 

	public Deck()
	{
		//Charge Spades
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Spades_"+Integer.toString(i)+".jpg";
			Carte spades = new Carte(card, -50+50*i, 100);
			deck.add(spades);
			getChildren().add(spades);
		}

		//Charge Hearts
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Hearts_"+Integer.toString(i)+".jpg";
			Carte hearts = new Carte(card, -50+50*i, 200);
			deck.add(hearts);
			getChildren().add(hearts);
		}

		//Charge Trumps
		for (int i=1; i<=22; i++){
			String card = "file:./ressources/Trumps_"+Integer.toString(i)+".jpg";
			Carte trumps = new Carte(card, -50+50*i, 300);
			deck.add(trumps);
			getChildren().add(trumps);
		}

		//Charge Diamonds
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Diamonds_"+Integer.toString(i)+".jpg";
			Carte diamonds = new Carte(card, -50+50*i, 400);
			deck.add(diamonds);
			getChildren().add(diamonds);
		}

		//Charge Clubs
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Clubs_"+Integer.toString(i)+".jpg";
			Carte clubs = new Carte(card, -50+50*i, 500);
			deck.add(clubs);
			getChildren().add(clubs);
		}
	}

	public int getSize()
	{
		return deck.size();
	}

	public void addCarte(Carte carte)
	{
		deck.add(carte);
	}

	public void shuffle()
	{
		Collections.shuffle(deck);
	}

	public void regroup()
	{
		for (Carte c : deck)
		{
			c.flip();
			c.setX(500);
			c.setY(350);
		}
	}

	public void distribution(Joueur J1, Joueur J2, Joueur J3, Joueur J4, Chien chien)
	{

	}
}
