package fr.aston.exo;

public class Personne extends Mammif implements IMonInterface, Comparable<Personne> {
	//Attibuts
	private int age;
	private String nom;
	private double poids;
	private double taille;

	public static int nbBras = 2;

	public final static double TVA_IC = 20D;

	//constructeurs
	public Personne() {
		this(-1, "?");
	}


	public Personne(int unAge, String unNom) {
		this.setAge(unAge);
		this.setNom(unNom);
	}

	//Methodes
	public void marcher(int nbPas, float vitesse) {

	}

	public String dormir (boolean estReve) {
		return null;
	}


	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPoids() {
		return this.poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return this.taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void faireA() {
		// TODO Auto-generated method stub

	}

	@Override
	public int faireB(String g) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void faireC(double b) {
		// TODO Auto-generated method stub

	}
}
