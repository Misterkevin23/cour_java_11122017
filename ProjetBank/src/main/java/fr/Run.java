package fr;

import fr.banque.Client;
import fr.banque.Compte;

public class Run {

	public static void main(String[] args) {
		Client client = new Client("pascal", "kevin", 28, 7);
		Compte compte1 = new Compte(3000, 7);
		Compte compte2 = new Compte(7000, 3);
		Compte compte3 = new Compte(23000, 23);
		Compte compte4 = new Compte(42000, 42);

		client.ajouterCompte(compte1);
		client.ajouterCompte(compte2);
		client.ajouterCompte(compte3);
		client.ajouterCompte(compte4);
		System.out.println(client);

		compte1.ajouter(400);
		compte2.retirer(3000);
		compte3.retirer(10000);
		compte4.ajouter(500);
		System.out.println(client);

		// System.out.println(compte1.getSolde());
		// System.out.println(compte2.getSolde());
		// System.out.println(compte3.getSolde());
		// System.out.println(compte4.getSolde());

	}

}
