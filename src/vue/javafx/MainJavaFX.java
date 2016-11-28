package vue.javafx;
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

public class MainJavaFX extends Application {

	private ParallelTransition parallelTransition;
	private ScaleTransition scaleTransition;	
	private RotateTransition rotateTransition;	
	private TranslateTransition translateTransition;	

	public void demo (Stage fenetre){
		// objet graphique : carte 21
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
				cartePetit.setCache(true);

				Carte Test = new Carte("file:./ressources/Trumps_21.jpg", 400, 300);

				// scene graphique
				fenetre.setTitle("Let's play Tarot !");
				Group cartes = new Group();
				Scene plateau = new Scene(cartes,1024,768);
				plateau.setFill(Color.BLACK);
				cartes.getChildren().add(carte21);
				cartes.getChildren().add(carteExcuse);
				cartes.getChildren().add(cartePetit);
				cartes.getChildren().add(Test);
				fenetre.setScene(plateau); 
				fenetre.sizeToScene(); 
				fenetre.show(); 

				
				// animation 1 : zoom (toutes les cartes)
				scaleTransition = 
						new ScaleTransition(Duration.seconds(4), cartes);
				scaleTransition.setFromX(0.1);
				scaleTransition.setFromY(0.1);
				scaleTransition.setToX(0.3);
				scaleTransition.setToY(0.3);
				scaleTransition.setAutoReverse(true);
				scaleTransition.setCycleCount(Timeline.INDEFINITE);
				// animation 2 : rotation (toutes les cartes)
				rotateTransition = new RotateTransition(Duration.seconds(30), cartes);
				rotateTransition.setAxis(new Point3D(100,0,100));
				rotateTransition.setFromAngle(0);
				rotateTransition.setToAngle(2160);
				rotateTransition.setAutoReverse(true);
				rotateTransition.setCycleCount(Timeline.INDEFINITE);
				// animation 3 : translation (carte Petit)
				translateTransition = new TranslateTransition(Duration.seconds(1), cartePetit);
				translateTransition.setFromZ(200);
				translateTransition.setToZ(-200);
				translateTransition.setAutoReverse(true);
				translateTransition.setCycleCount(Timeline.INDEFINITE);
				
				// animation globale: toutes en //
				parallelTransition = new ParallelTransition();
				parallelTransition.getChildren().addAll(
						rotateTransition,
						scaleTransition,
						translateTransition
						); 
				parallelTransition.setCycleCount(Timeline.INDEFINITE);

				// go !
				parallelTransition.play();
				

				

	}
	
	@Override
	public void start(Stage fenetre) throws Exception {
		demo(fenetre);
	}     

	public static void main(String[] args) {
		launch(args);
	}

}
