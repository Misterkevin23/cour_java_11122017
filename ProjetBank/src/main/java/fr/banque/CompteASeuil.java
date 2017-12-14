package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {

	private double seuil;

	public CompteASeuil() {
		this(-1D, -1, -1D);
	}

	public CompteASeuil(double solde, int numero, double seuil) {
		super(solde, numero);
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
		return this.getClass().getSimpleName() + s + " seuil= " + this.getSeuil() + "]";
		// return this.getClass().getSimpleName() + "[solde= " + this.getSolde() + ",
		// numero= " + this.getNumero() + " seuil= " + this.getSeuil() + "]";
	}

	@Override
	public void retirer(double uneValeur) {
		if (this.getSolde() - uneValeur > this.getSeuil()) {
			super.retirer(uneValeur);
		}
		else {
			System.out.println("Seuil maximal !!!, on ne fait rien");
		}
	}

}
