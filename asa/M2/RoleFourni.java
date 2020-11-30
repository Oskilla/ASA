package asa.M2;

public class RoleFourni extends Role {
	
	private Attachement1 att;

	public RoleFourni(String nom, int numero) {
		super(nom, numero);
	}

	public Attachement1 getAtt() {
		return att;
	}

	public void setAtt(Attachement1 att) {
		this.att = att;
	}
	
	
	

}
