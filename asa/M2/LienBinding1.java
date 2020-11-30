package asa.M2;

public class LienBinding1 {

	private PortRequis requisConf;
	private PortFourni fourniComp;
	
	public LienBinding1(PortRequis requisConf, PortFourni fourniComp) {
		super();
		this.requisConf = requisConf;
		this.fourniComp = fourniComp;
	}

	public PortRequis getRequisConf() {
		return requisConf;
	}

	public void setRequisConf(PortRequis requisConf) {
		this.requisConf = requisConf;
	}

	public PortFourni getFourniComp() {
		return fourniComp;
	}

	public void setFourniComp(PortFourni fourniComp) {
		this.fourniComp = fourniComp;
	}
	
	
	
	
}
