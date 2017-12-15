package fr;

import fr.banque.BanqueException;
import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteASeuil;
import fr.banque.CompteASeuilRemunere;
import fr.banque.CompteRemunere;

public class Run {

	public static void main(String[] args) {
		Client client = new Client("pascal", "kevin", 28, 7);
		Compte compte1 = new CompteASeuilRemunere(23000, 7, 0.4, 1000);
		Compte compte2 = new CompteASeuilRemunere(42000, 42, 0.3, 200);
		Compte compte3 = new CompteASeuil(547000, 23, 5); //on peut mettre une class parente a gauche et une class enfant a droite -> polymorphisme
		Compte compte4 = new CompteASeuil(13000, 3, 200);
		Compte compte5 = new CompteRemunere(73230, 32, 0.2);

		try {
			client.ajouterCompte(compte1);
			client.ajouterCompte(compte2);
			client.ajouterCompte(compte3);
			client.ajouterCompte(compte4);
			// client.ajouterCompte(compte5);
		} catch (BanqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(client);

		compte1.ajouter(400);
		try {
			compte2.retirer(3000);
			compte3.retirer(10000);
		} catch (BanqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		compte4.ajouter(500);
		System.out.println(client);

		Compte[] tab = client.getListeCompte();

		for (Compte uneCase : tab) {
			if ("CompteRemunere".equals(uneCase.getClass().getSimpleName())) {
				// Est ce que uneCase est de type CompteRemunere
				CompteRemunere cr = (CompteRemunere) uneCase;
				cr.verserInterets();
			}

			if (uneCase instanceof CompteRemunere) {
				// Est ce que uneCase appartient à la famille CompteRemunere
				((CompteRemunere) uneCase).verserInterets();
			}
		}

		System.out.println(client);

		// System.out.println(compte1.getSolde());
		// System.out.println(compte2.getSolde());
		// System.out.println(compte3.getSolde());
		// System.out.println(compte4.getSolde());

	}

}
