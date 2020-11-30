package asa.M2;

public class Role {
	private String nom;
	private int numero;
	private boolean isUsed;
	
	public Role(String nom, int numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}
	
	
	
	
	
	
	
}
