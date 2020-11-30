package asa.M1.ClientServeur.Connecteur;

import asa.M2.InterfaceConnecteur;
import java.util.ArrayList;
import asa.M2.RoleFourni;
import asa.M2.RoleRequis;

public class InterfaceRPC extends InterfaceConnecteur{

	public InterfaceRPC(ArrayList<RoleFourni> rfourni,ArrayList<RoleRequis> rrequis) {
		super();
		for (RoleFourni r : rfourni) {
			this.addRoleFourni(r);
		}
		for (RoleRequis r : rrequis) {
			this.addRoleRequis(r);
		}
		// TODO Auto-generated constructor stub
	}
	
}
