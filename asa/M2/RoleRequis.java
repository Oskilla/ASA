package asa.M2;

public class RoleRequis extends Role {
	
	private Attachement2 att;

	public RoleRequis(String nom, int numero) {
		super(nom, numero);
	}

	public Attachement2 getAtt() {
		return att;
	}

	public void setAtt(Attachement2 att) {
		this.att = att;
	}



}
