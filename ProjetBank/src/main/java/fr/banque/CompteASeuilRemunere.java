package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {

	private double seuil;

	public CompteASeuilRemunere() {
		this(-1D, -1, 0.007D, -1D);
	}

	public CompteASeuilRemunere(double solde, int numero, double taux, double seuil) {
		super(solde, numero, taux);
		this.setSeuil(seuil);
	}

	@Override
	public double getSeuil() {
		return this.seuil;
	}

	@Override
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s = s.substring(0, s.length() - 1); // Pour retirer le ']' en fin de chaine
		return s + " seuil= " + this.getSeuil() + "]";
		// return this.getClass().getSimpleName() + "[solde= " + this.getSolde() + ",
		// numero= " + this.getNumero() + " seuil= " + this.getSeuil() + "]";
	}

	@Override
	public void retirer(double uneValeur) {
		if (this.getSolde() - uneValeur > this.getSeuil()) {
			super.retirer(uneValeur);
		} else {
			System.out.println("Seuil maximal !!!, on ne fait rien");
		}
	}


}
