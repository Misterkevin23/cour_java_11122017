package fr.dessin;

public class Run {

	public static void main(String[] args) {
		Point2D abscisse = new Point2D();
		Point2D ordonnee = new Point2D();
		
		abscisse.setX(42);
		abscisse.setY(23);
		abscisse.afficher();
		System.out.println(abscisse.getX());
		abscisse.translater(13, 77);
		abscisse.afficher();
		
	}

}
