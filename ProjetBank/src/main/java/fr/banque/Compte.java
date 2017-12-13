package fr.banque;

public class Compte {

	private double solde;
	private int numero;

	public Compte() {
		this(-1D, 0);
	}

	public Compte(double solde, int numero) {
		this.setSolde(solde);
		this.setNumero(numero);
	}

	public double getSolde() {
		return this.solde;
	}

	private void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNumero() {
		return this.numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public void ajouter(double unMontant) {
		this.setSolde(this.getSolde() + unMontant);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [solde=" + this.getSolde() + ", numero=" + this.getNumero() + "]";
	}

	public void retirer(double unMontant) {
		this.setSolde(this.getSolde() - unMontant);
	}

}
