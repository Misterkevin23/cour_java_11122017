package fr.aston.exo;

public class Bonjour {
	
	/**
	 * Ceci est <strong>ma methode</strong>
	 * 
	 * @param args mes parametres de main
	 */

	public static void main(String[] args) {
		//commentaire sur
		//une
		//ligne
		System.out.println("Bonjour tout le monde");
		/*sur
		 * plusieurs
		 * lignes
		 */

		int i;
		double d = 5.5;
		float f = 3.3F;
		float ff = (float)6.6; // un cast permet de forcer le typage
		int ii = (int)ff; // 6
		char c = 'i'; // automatiquement en simple cote
		boolean b = true;
		i = 5;
		i = i +3;
		i += 9; // i = i + 9
		
		i++; // i = i + 1;
		i--; // i = i - 1;
		
		float r = 3F/2F; // permet d'avoir un resultat avec les decimal contrairement a int r = 3/2 qui donnera 1 car le typage est un entier
		
		boolean bb = 5 >= 4 && i == 5 || c != 'y';  // et/ou reste pareil qu'en JS sauf qu'il n'y a pas de comparaison de typage
				
		bb &= false; //bb = bb && false
		
		//sujet.verbe(complements)
		String maStr = "ma chaine"; //La string est un object entre double cote
		int maTaille = maStr.length(); //taille du string
		maStr = maStr.toUpperCase();
		maStr = "toto" + maStr + "tata" + 6 + 't';
		System.out.println(maStr); //ecris dans la console
		System.out.println(i);
		
	}

}
