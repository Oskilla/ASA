package asa.M2;

public class PortFourni extends Port{
	
	private Attachement2 att;

	public PortFourni(int numero) {
		super(numero);
	}

	public Attachement2 getAtt() {
		return att;
	}

	public void setAtt(Attachement2 att) {
		this.att = att;
	}
}
