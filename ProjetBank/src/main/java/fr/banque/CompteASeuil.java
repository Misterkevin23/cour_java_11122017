package fr.banque;

public class CompteASeuil extends Compte {

	private double seuil;

	public CompteASeuil() {
		this(-1D, -1, -1D);
	}

	public CompteASeuil(double solde, int numero, double seuil) {
		super(solde, numero);
		this.setSeuil(seuil);
	}

	public double getSeuil() {
		return this.seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[seuil=" + this.getSeuil() + "]";
	}

}
