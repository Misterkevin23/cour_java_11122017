package fr.banque;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private int age;
	private int numeros;
	// private Compte[] tabCompte;
	private List<Compte> listeCompte = new ArrayList<Compte>();

	public Client() {
		this(null, null, -1, -1);
	}

	public Client(String nom, String prenom, int age, int numeros) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
		this.setNumeros(numeros);
		// this.setTabCompte(new Compte[5]);
		this.setListeCompte(new ArrayList<Compte>(5)); // on peut definir la taille de la liste avant. Ici limité a 5
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[nom=" + this.nom + ", prenom=" + this.prenom + ", age=" + this.age
				+ ", numeros=" + this.numeros + ", tabCompte=" + this.listeCompte + "]";
	}

	public void ajouterCompte(Compte unCompte) throws BanqueException {
		//		for (Compte compte : this.tabCompte) {
		//			if (compte == null) {
		//				compte = unCompte;
		//				return;
		//			}
		//		}
		// System.out.println("Nombre maximun de compte crée");

		if (this.listeCompte.size() < 5) {
			this.listeCompte.add(unCompte);
			return;
		}
		throw new BanqueException("Nombre maximun de compte crée");

		//		for (int i = 0; i < this.listeCompte.size(); i++) {
		//			if(this.listeCompte[i] == null) {
		//				this.listeCompte[i] = unCompte;
		//				return;
		//			}
		//		}

	}

	/**
	 *
	 * @param numeroCompte
	 * @return je retourne le compte trouve sinon je retourne null
	 */
	public Compte getCompte(int numeroCompte) {
		for (Compte compte : this.listeCompte) {
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

	public Compte[] getListeCompte() {
		Compte[] resu = new Compte[this.listeCompte.size()];
		// for (int i = 0; i < this.listeCompte.size(); i++)) {
		// resu[i] = this.listeCompte.get(i);
		// }
		// return resu;

		return this.listeCompte.toArray(new Compte[this.listeCompte.size()]);
	}

	public void setListeCompte(List<Compte> tabCompte) {
		for (Compte comptes : tabCompte) {
			this.listeCompte.add(comptes);
		}
	}

	// public Compte[] getTabCompte() {
	// return this.listeCompte;
	// }
	//
	// public void setTabCompte(Compte[] tabCompte) {
	// this.listeCompte = tabCompte;
	// }

}
