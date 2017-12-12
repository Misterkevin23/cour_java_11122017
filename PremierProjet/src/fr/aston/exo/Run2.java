package fr.aston.exo;

import java.util.Arrays;

public class Run2 {

	public static void main(String[] args) {
		int[] tableau = new int[5];
		// 0, 1, 2, 3, 4 = 5 cases
		Personne[] tp = new Personne[10];
		
		int taille = tableau.length; //5
		
		String[] ts = {"A", "BD", "Titi" };
		//ts.length = 3

		int[][] tab2 = new int[5][10]; //tableau a deux dimension dont la 1 dimention a une taille de 5 et la deuxieme de 10
		System.out.println(ts);
		
		//afficher un tableau
		System.out.println(Arrays.toString(ts));
		
		//les bouches
		b : for (int i = 0; i < ts.length; i++) {
			if(i == 2)
			{
				break; // casse la boucle
				// continue // continue la boucle;
			}
			c : for( int j = 0; j < tab2.length; j++)
			{
				break b;
			}
			System.out.println(ts[i]);
		}
		
		int j = 0;
		while (j < ts.length){
			System.out.println(ts[j]);
			j++;
		}
		
		j = 0;
		do {
			System.out.println(ts[j]);
			j++;
		}while(j < ts.length);
		
		for (String uneCase : ts) {
			System.out.println(uneCase);
		}
		j = 1;
		switch (j) {
		case 1:
			System.out.println("j vaut 1");
			break;
		
		case 2:
			System.out.println("j vaut 2");
			break;
		default:
			System.out.println("default");
			break;
		}
	} 

}
