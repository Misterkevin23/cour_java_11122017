package fr.banque;

import java.util.Arrays;

public class Client {

	private String nom;
	private String prenom;
	private int age;
	private int numeros;
	private Compte[] tabCompte;

	public Client() {
		this(null, null, -1, -1);
	}

	public Client(String nom, String prenom, int age, int numeros) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
		this.setNumeros(numeros);
		this.setTabCompte(new Compte[5]);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[nom=" + this.nom + ", prenom=" + this.prenom + ", age=" + this.age
				+ ", numeros=" + this.numeros + ", tabCompte=" + Arrays.toString(this.tabCompte) + "]";
	}

	public void ajouterCompte(Compte unCompte) {
		//		for (Compte compte : this.tabCompte) {
		//			if (compte == null) {
		//				compte = unCompte;
		//				return;
		//			}
		//		}
		// System.out.println("Nombre maximun de compte crée");

		for (int i = 0; i < this.tabCompte.length; i++) {
			if(this.tabCompte[i] == null) {
				this.tabCompte[i] = unCompte;
				return;
			}
		}
		System.out.println("Nombre maximun de compte crée");
	}

	/**
	 *
	 * @param numeroCompte
	 * @return je retourne le compte trouve sinon je retourne null
	 */
	public Compte getCompte(int numeroCompte) {
		for (Compte compte : this.tabCompte) {
			if (compte != null && numeroCompte == compte.getNumero()) {
				return compte;
			}
		}
		System.out.println("Compte" + numeroCompte + " introuvable pour " + this.getNom());
		return null;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumeros() {
		return this.numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public Compte[] getTabCompte() {
		return this.tabCompte;
	}

	public void setTabCompte(Compte[] tabCompte) {
		this.tabCompte = tabCompte;
	}

}
