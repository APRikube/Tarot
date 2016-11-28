package vue.javafx;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Carte extends ImageView {
	private Image image;
	private static int width = 150;
	private static int height = 300;
	private boolean face;
	
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
	
}
