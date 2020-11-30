package asa.M1.ClientServeur.Composants;
import java.util.ArrayList;

import asa.M2.InterfaceComposant;
import asa.M2.PortFourni;
import asa.M2.PortRequis;


public class InterfaceServeur extends InterfaceComposant{

	public InterfaceServeur(ArrayList<PortFourni> pfourni,ArrayList<PortRequis> prequis) {
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
