package asa.M2;

public class LienBinding2 {
	
	private Port requisComp;
	private Port fourniConf;
	
	public LienBinding2(Port requisComp, Port fourniConf) {
		super();
		this.requisComp = requisComp;
		this.fourniConf = fourniConf;
	}

	public Port getRequisComp() {
		return requisComp;
	}

	public void setRequisComp(Port requisComp) {
		this.requisComp = requisComp;
	}

	public Port getFourniConf() {
		return fourniConf;
	}

	public void setFourniConf(Port fourniConf) {
		this.fourniConf = fourniConf;
	}
	
	

}
