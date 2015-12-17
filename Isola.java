import java.awt.*;
import javax.swing.*;

public class Isola
{
	public static void main(String[] args)
	{
		JFrame fenetre = new JFrame("Isola");
		fenetre.setSize(400,300);
		fenetre.setVisible(true);
		int largeur = 10, hauteur = 8;
		Plateau myPlateau = new Plateau(largeur, hauteur);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}