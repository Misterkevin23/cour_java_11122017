package fr.aston.exo;

public class Personne {
	//Attibuts
	private int age;
	private String nom;
	private double poids;
	private double taille;

	//Methodes
	public void marcher(int nbPas, float vitesse) {
		
	}
	
	public String dormir (boolean estReve) {
		return null;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}
}
