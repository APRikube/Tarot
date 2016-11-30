package model.javafx;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Carte extends ImageView {
	private String cardName;
	private Image image;
	private static int width = 50;
	private static int height = 100;
	private boolean face ;
	private int numCarte;
	private int colCarte;



	public Carte(String imageName, int x, int y)
	{
		cardName=imageName;
		image = new Image(imageName);
		setImage(image);
		setFitWidth(width);
		setFitHeight(height);
		setX(x);
		setY(y);
		face = true;
	}

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

	public void setIMAGE(String imageName){
		image = new Image(imageName);
	}

	public void flip()
	{
		setFace(false);
	}

	public void setFace(boolean face)
	{
		this.face = face;

		if(this.face==false)
		{
			Image value= new Image("file:./ressources/Dos.png");
			setImage(value);
		}
		else
		{
			Image value= new Image(cardName);
			setImage(value);
		}
	}
	// 0=Spades, 1= Hearts, 2=Trumps, 3=Diamonds, 4=Clubs

}
