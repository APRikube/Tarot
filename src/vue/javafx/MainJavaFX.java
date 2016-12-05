package vue.javafx;
import java.util.ArrayList;

import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.javafx.Carte;
import model.javafx.Deck;

public class MainJavaFX extends Application {

	private ParallelTransition parallelTransition;
	private ScaleTransition scaleTransition;	
	private RotateTransition rotateTransition;	
	private TranslateTransition translateTransition;	

	public void demo (Stage fenetre) {
		
		fenetre.setTitle("Let's play Tarot !");
		
		/*// objet graphique : carte 21
				Image image21 = new Image("file:./ressources/Trumps_21.jpg");
				ImageView carte21 = new ImageView();
				carte21.setImage(image21);
				carte21.setX(-400);
				carte21.setY(-1000);
				carte21.setRotate(10);
				carte21.setCache(true);

				// objet graphique : carte Excuse
				Image imageExcuse = new Image("file:./ressources/Trumps_Excuse.jpg");
				ImageView carteExcuse = new ImageView();
				carteExcuse.setImage(imageExcuse);
				carteExcuse.setX(-400);
				carteExcuse.setY(-1000);
				carteExcuse.setTranslateZ(50);
				carteExcuse.setRotate(30);
				carteExcuse.setCache(true);

				// objet graphique : carte Petit
				Image imagePetit = new Image("file:./ressources/Trumps_01.jpg");
				ImageView cartePetit = new ImageView();
				cartePetit.setImage(imagePetit);
				cartePetit.setX(-400);
				cartePetit.setY(-1000);
				cartePetit.setTranslateZ(100);
				cartePetit.setRotate(50);
				cartePetit.setCache(true);*/

		//Deck d = new Deck();

		Carte c = new Carte("file:./ressources/Trumps_2.jpg", 500, 300);
		Group g = new Group();
		g.getChildren().add(c);
		// scene graphique
		Scene plateau = new Scene(g,1124,768);
		plateau.setFill(Color.DARKGREEN);
		fenetre.setScene(plateau); 
		fenetre.sizeToScene(); 
		fenetre.show(); 
		
		
		    RotateTransition rotateOutFront = new RotateTransition(Duration.millis(1000), c); 
		    rotateOutFront.setInterpolator(Interpolator.LINEAR); 
		    rotateOutFront.setAxis(Rotate.Y_AXIS); 
		    rotateOutFront.setFromAngle(0); 
		    rotateOutFront.setToAngle(90); 
		    
		    //c.setIMAGE("file:./ressources/Dos.png");
		    
		    RotateTransition rotateInBack = new RotateTransition(Duration.millis(1000), c); 
		    rotateInBack.setInterpolator(Interpolator.LINEAR); 
		    rotateInBack.setAxis(Rotate.Y_AXIS); 
		    rotateInBack.setFromAngle(-90); 
		    rotateInBack.setToAngle(0); 
		    
		    SequentialTransition A = new SequentialTransition(rotateOutFront, rotateInBack);
		    A.play();
		
		//c.flip().play();
	
		//d.regroup();

		// animation 1 : zoom (toutes les cartes)
		//				scaleTransition = 
		//						new ScaleTransition(Duration.seconds(4), cartes);
		//				scaleTransition.setFromX(0.1);
		//				scaleTransition.setFromY(0.1);
		//				scaleTransition.setToX(0.3);
		//				scaleTransition.setToY(0.3);
		//				scaleTransition.setAutoReverse(true);
		//				scaleTransition.setCycleCount(Timeline.INDEFINITE);
		//				// animation 2 : rotation (toutes les cartes)
		//				rotateTransition = new RotateTransition(Duration.seconds(30), cartes);
		//				rotateTransition.setAxis(new Point3D(100,0,100));
		//				rotateTransition.setFromAngle(0);
		//				rotateTransition.setToAngle(2160);
		//				rotateTransition.setAutoReverse(true);
		//				rotateTransition.setCycleCount(Timeline.INDEFINITE);
		//				// animation 3 : translation (carte Petit)
		//				translateTransition = new TranslateTransition(Duration.seconds(1), cartePetit);
		//				translateTransition.setFromZ(200);
		//				translateTransition.setToZ(-200);
		//				translateTransition.setAutoReverse(true);
		//				translateTransition.setCycleCount(Timeline.INDEFINITE);
		//				
		//				// animation globale: toutes en //
		//				parallelTransition = new ParallelTransition();
		//				parallelTransition.getChildren().addAll(
		//						rotateTransition,
		//						scaleTransition,
		//						translateTransition
		//						); 
		//				parallelTransition.setCycleCount(Timeline.INDEFINITE);
		//
		//				// go !
		//				parallelTransition.play();

	}

	@Override
	public void start(Stage fenetre) throws Exception {
		demo(fenetre);

	}     

	public static void main(String[] args) {
		launch(args);
		
	}

}