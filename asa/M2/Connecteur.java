package asa.M2;

public class Connecteur {
	private String nom;
	private Glue glue;
	private InterfaceConnecteur interf;
	
	public Connecteur(String nom, Glue glue) {
		super();
		this.nom = nom;
		this.glue = glue;
	}

	public InterfaceConnecteur getInterf() {
		return interf;
	}

	public void setInterf(InterfaceConnecteur interf) {
		this.interf = interf;
	}
	
}
