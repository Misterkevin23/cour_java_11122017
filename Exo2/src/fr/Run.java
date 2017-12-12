package fr;

import fr.dessin.Point2D;
import fr.dessin.Point3D;

public class Run {

	public static void main(String[] args) {
		
		
		Point2D abscisse = new Point2D();
		//abscisse = est une instance;
		abscisse.setX(42);
		abscisse.setY(23);
		System.out.println("Valeur de X:" + abscisse.getX());
		abscisse.translater(13, 77);
		abscisse.afficher();
		
		System.out.println("Nombre de class Point2D:" + Point2D.getCompteur());
		
		Point2D ordonnee = new Point2D();
		//ordonnee = est une instance;
		ordonnee.setX(13);
		ordonnee.setY(7);
		System.out.println("Valeur de Y:" + ordonnee.getY());
		ordonnee.translater(3, 23);
		ordonnee.afficher();
		
		System.out.println("Nombre de class Point2D:" + Point2D.getCompteur());
		
//		Point2D time = new Point3D(25, 42, 23); // polymorphisme
//		time.afficher();
//		time.translater(10, 10);
//		time.afficher();
//		((Point3D)time).translater(7, 3, 13);  // le cast permet de forcer le compilateur au typage Point3D
//		time.afficher();
		
		Point3D time = new Point3D(25, 42, 23);
		time.afficher();
		time.translater(10, 10);
		time.afficher();
		time.translater(7, 3, 13);
		time.afficher();
		time.setX(7);
			
	}

}