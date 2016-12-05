package model.javafx;

import java.util.ArrayList;
import java.util.Collection;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Transition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Carte extends ImageView {
	private String cardFace;
	private String cardBack="file:./ressources/Dos.png";
	private Image image;
	private static int width = 50;
	private static int height = 100;
	private boolean face ;
	private int numCarte;
	private int colCarte;



	public Carte(String imageName, int x, int y)
	{
		cardFace=imageName;
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

	public void setImage(String imageName){
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
			//Image value= new Image("file:./ressources/Dos.png");
			setImage(cardBack);
		}
		else
		{
			//Image value= new Image(cardName);
			setImage(cardFace);
		}
	}
	// 0=Spades, 1= Hearts, 2=Trumps, 3=Diamonds, 4=Clubs

}
