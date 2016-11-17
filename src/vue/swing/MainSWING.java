package vue.swing;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainSWING {
	JFrame jf = new JFrame();
	JButton jb;
	boolean carte21 = true;
	ImageIcon imageIconCarte21;
	ImageIcon imageIconCarte1;

	public MainSWING(){
		jf.setTitle("Demo SWING");
		// preparation et redimensionnement des deux images 
		imageIconCarte21 = new ImageIcon("./ressources/Tarot_nouveau_-_Grimaud_-_1898_-_Trumps_-_21.jpg");
		Image image = imageIconCarte21.getImage(); // transform it 
		Image newimg = image.getScaledInstance(400, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIconCarte21 = new ImageIcon(newimg);  // transform it back
		imageIconCarte1 = new ImageIcon("./ressources/Tarot_nouveau_-_Grimaud_-_1898_-_Trumps_-_01.jpg");
		image = imageIconCarte1.getImage(); // transform it 
		newimg = image.getScaledInstance(400, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIconCarte1 = new ImageIcon(newimg);  // transform it back
		// bouton avec image et ecouteur
		jb = new JButton(imageIconCarte21);
		jb.setBounds(0,0,400,600);
		jb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						if (!carte21)
							jb.setIcon(imageIconCarte21);  
						if (carte21)
							jb.setIcon(imageIconCarte1);
						carte21 = ! carte21;
						System.out.println("Echange de carte détecté ...");
					}
				}
				);
		jf.add(jb);  

		jf.setSize(410,650);  
		jf.setLayout(null);  
		jf.setVisible(true);  

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

	public static void main(String[] args) {
		new MainSWING();
	}

}
