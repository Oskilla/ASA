package asa.M2;

public class Composant {
	private String nom;
	private InterfaceComposant interf;
	private Configuration config;
	
	
	public Composant(String nom, InterfaceComposant interf) {
		super();
		this.nom = nom;
		this.interf = interf;
	}
	
	public InterfaceComposant getInterf() {
		return interf;
	}

	public void setInterf(InterfaceComposant interf) {
		this.interf = interf;
	}

	public void addConfig(Configuration c) {
		//definit une configuration pour ce composant
	}
}
