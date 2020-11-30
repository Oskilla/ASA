package asa.M1.ClientServeur;
import java.util.ArrayList;
import asa.M2.InterfaceConfiguration;
import asa.M2.PortFourni;
import asa.M2.PortRequis;


public class InterfaceConfig extends InterfaceConfiguration {

	public InterfaceConfig(ArrayList<PortFourni> pfourni,ArrayList<PortRequis> prequis) {
		super();
		for (PortFourni p : pfourni) {
			this.addPortFourni(p);
		}
		for (PortRequis p : prequis) {
			this.addPortRequis(p);
		}
		// TODO Auto-generated constructor stub
	}
}
