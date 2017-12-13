package fr.banque;

public class CompteRemunere extends Compte {

	private double taux;

	public CompteRemunere() {
		this(-1, -1, -1D);
	}

	public CompteRemunere(double solde, int numero, double taux) {
		super(solde, numero);
		this.setTaux(taux);
	}

	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[taux=" + this.getTaux() + "]";
	}

	public double calculerInterets() {
		return this.getTaux() * super.getSolde();
	}

	public void verserInterets() {
		super.ajouter(this.calculerInterets());
	}


}
