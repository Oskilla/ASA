package asa.M2;
import java.util.ArrayList;

public class Configuration {
	private String nom;
	private ArrayList<Composant> components;
	private ArrayList<Connecteur> connecteurs;
	private InterfaceConfiguration interf;
	
	public Configuration(String nom) {
		super();
		this.nom = nom;
		this.components = new ArrayList<Composant>();
		this.connecteurs = new ArrayList<Connecteur>();
	}

	public void addComp(Composant c) {}
	
	public void addConn(Connecteur c) {	}

	public InterfaceConfiguration getInterf() {
		return interf;
	}

	public void setInterf(InterfaceConfiguration interf) {
		this.interf = interf;
	}
}
