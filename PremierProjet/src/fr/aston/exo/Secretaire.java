package fr.aston.exo;

public class Secretaire extends Personne {

	private double salaire;
	private String adresse;

	public Secretaire() {
		this(-1, "?", 0D, null);
	}

	public Secretaire(int unAge, String unNom, double uSalaire, String uAddr) {
		super(unAge, unNom);
		setSalaire(uSalaire);
		setAdresse(uAddr);
	}
	
	

	@Override
	public String dormir(boolean estReve) {
		// TODO Auto-generated method stub
		return super.dormir(estReve);
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
}
