package vue.javafx;
import java.util.ArrayList;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.javafx.Carte;
import model.javafx.Deck;

public class MainJavaFX extends Application {

	private ParallelTransition parallelTransition;
	private ScaleTransition scaleTransition;	
	private RotateTransition rotateTransition;	
	private TranslateTransition translateTransition;	

	public void demo (Stage fenetre){
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

		Deck d = new Deck();

		Group cartes = new Group();
		
		//Charge Spades
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Spades_"+Integer.toString(i)+".jpg";
			Carte spades = new Carte(card, -50+50*i, 100);
//			d.addCarte(p);
			cartes.getChildren().add(spades);
		}
		
		//Charge Hearts
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Hearts_"+Integer.toString(i)+".jpg";
			Carte hearts = new Carte(card, -50+50*i, 200);
//			d.addCarte(p);
			cartes.getChildren().add(hearts);
		}
		
		//Charge Trumps
		for (int i=1; i<=22; i++){
			String card = "file:./ressources/Trumps_"+Integer.toString(i)+".jpg";
			Carte trumps = new Carte(card, -50+50*i, 300);
//			d.addCarte(p);
			cartes.getChildren().add(trumps);
		}
		
		//Charge Diamonds
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Diamonds_"+Integer.toString(i)+".jpg";
			Carte diamonds = new Carte(card, -50+50*i, 400);
//			d.addCarte(p);
			cartes.getChildren().add(diamonds);
		}
		
		//Charge Clubs
		for (int i=1; i<=14; i++){
			String card = "file:./ressources/Clubs_"+Integer.toString(i)+".jpg";
			Carte clubs = new Carte(card, -50+50*i, 500);
//			d.addCarte(p);
			cartes.getChildren().add(clubs);
		}

		//Carte carte21 = new Carte("file:./ressources/Trumps_21.jpg", 400, 300);

//		d.addCarte(carteExcuse);
//		d.addCarte(cartePetit);
//		d.addCarte(Test);


		// scene graphique
		fenetre.setTitle("Let's play Tarot !");
		Scene plateau = new Scene(cartes,1124,768);
		plateau.setFill(Color.DARKGREEN);
		//cartes.getChildren().add(carteExcuse);
		//cartes.getChildren().add(cartePetit);
		//cartes.getChildren().add(Test);
		fenetre.setScene(plateau); 
		fenetre.sizeToScene(); 
		fenetre.show(); 


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
