package fr.aston.exo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Run3 {

	public static void main(String[] args) {
		// Une liste est un tableau magique
		// java.util.List maListe = new ArrayList();
		// maListe.add("Toto");
		// maListe.add("Tata");
		// maListe.add(new Personne());
		// maListe.add(new Secretaire());

		// ON peut typer les liste
		java.util.List<String> maListe = new ArrayList<String>();
		maListe.add("Toto");
		maListe.add("Tata");

		int nbElm = maListe.size();

		String s = maListe.get(0);

		// maListe.remove(0); // Supprimer un element de la liste
		//
		// maListe.remove(maListe.indexOf("Tata")); // indexOf donne le index de la
		// valeur Tata

		Collections.sort(maListe);

		System.out.println(maListe);

		// Dans un set on ne peut pas avoir deux fois la meme valeur (pas de doublons)
		// Le set ne suit pas l'ordre initial
		// java.util.Set<String> monSet = new HashSet<>();
		// monSet.add("Titi")
		// monSet.add("Toto");
		// monSet.add("Tztz");
		// monSet.add("Titi");

		// Une map ne conserve pas l'ordre
		// Un map permet de ranger les valeur en mode clef serrure
		// Si une clef et utilisé pour plusieurs valeur seul la dernière est utilisé
		java.util.Map<String, Personne> maMap = new HashMap<>();
		maMap.put(1, new Personne(1, "gg"));
		maMap.put("g", new Personne(1, "tt"));
		maMap.put(1, new Personne(2, "hh"));

		// recherche d'apres une Valeurs
		for (String uneP : maMap.values()) {
			System.out.println(uneP);
		}

		// recherche d'apres une key valeur
		for (Map<K, V>.Entry<String, Personne> uneEntree : maMap.entrySet()) {
			System.out.println(uneEntree.getKey());
			System.out.println(uneEntree.getValue());
		}
	}

}
