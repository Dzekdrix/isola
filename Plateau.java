public class Plateau
{
	int largeur, hauteur; // en nombre de cases
	Case[][] cases;
	public Plateau(int _largeur, int _hauteur){
		largeur = _largeur;
		hauteur = _hauteur;
		System.out.println("Initialisation du plateau.");
		cases = new Case[largeur][hauteur];
	}
}