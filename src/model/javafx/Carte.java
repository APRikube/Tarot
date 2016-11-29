package model.javafx;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Carte extends ImageView {
	private Image image;
	private static int width = 50;
	private static int height = 100;
	private boolean face;
	private int numCarte;
	private int colCarte;
	
	
	public Carte(String imageName, int x, int y)
	{
		image = new Image(imageName);
		setImage(image);
		setX(x);
		setY(y);
		setFitWidth(width);
		setFitHeight(height);
		face = true;
	}
	
	public Carte()
	{}
	
	private boolean getFace()
	{
		return face;
	}
	
	public int getNum()
	{
		return numCarte;
	}
	
	public int getCol()
	{
		return colCarte;
	}
	
	// 0=Spades, 1= Hearts, 2=Trumps, 3=Diamonds, 4=Clubs
	
}
