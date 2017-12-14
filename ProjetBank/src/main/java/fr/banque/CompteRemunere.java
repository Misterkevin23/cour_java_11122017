package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {

	private double taux;

	public CompteRemunere() {
		this(-1, -1, 0.007D);
	}

	public CompteRemunere(double solde, int numero, double taux) {
		super(solde, numero);
		this.setTaux(taux);
	}

	@Override
	public double getTaux() {
		return this.taux;
	}

	@Override
	public void setTaux(double taux) {
		if (taux > 0 && taux < 1) {
			this.taux = taux;
		} else {
			System.out.println("Veuillez entrer un pourcentage");
		}
	}

	@Override
	public String toString() {
		String s = super.toString();
		s = s.substring(0, s.length() - 1); // Pour retirer le ']' en fin de chaine
		return s + " taux= " + this.getTaux() + "]";
		// return this.getClass().getSimpleName() + "[solde= " + this.getSolde() + ",
		// numero= " + this.getNumero() + "taux= " + this.getTaux() + "]";
	}

	@Override
	public double calculerInterets() {
		return this.getTaux() * super.getSolde();
		// double resultat = this.getTaux() * super.getSolde();
		// return resultat;
	}

	@Override
	public void verserInterets() {
		super.ajouter(this.calculerInterets());
	}


}
