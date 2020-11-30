package asa;

import asa.M1.ServeurDetail.ConfigServeurDetail;
import asa.M1.ServeurDetail.Composants.ComposantSecurManager;
import asa.M1.ServeurDetail.Composants.InterfaceSecurManager;
import asa.M1.ServeurDetail.Connecteurs.ConnSecurConnect;
import asa.M2.Attachement1;
import asa.M2.Glue;
import asa.M2.PortFourni;
import asa.M2.PortRequis;
import asa.M2.RoleFourni;

public class Main {

	public static void main(String[] args) {
		/* Dans le main seront instanci�s les diff�rents classes, 
		 * en commencant par le plus "pronfond", a savoir les ports et les roles,
		 * et en remontant (Ports/Roles puis interfaces puis composants et connecteurs et enfin configuration
		 * Les liens d'attachement et de binding pourront se faire � la fin
		 */
		
		PortFourni externalSocket = new PortFourni(1);
		PortRequis securityCheck = new PortRequis(2);
		PortRequis checkQuery = new PortRequis(8);
		//Creation de tous les ports de la configuration serveur : DBquery, SecurityAuthentication...
		
		RoleFourni securConnect = new RoleFourni("securConnect", 5);
		//creation de tous les roles de la configuration serveur: roles requis et fournis de tous les connecteurs
		
		InterfaceSecurManager securityManagerI = new InterfaceSecurManager();
		//creation des interfaces de la configuration : celle des troiscomposants et des trois connecteurs
		
		securityManagerI.addPortRequis(checkQuery);
		//Ajout des diff�rents ports aux diff�rentes interfaces
		
		ComposantSecurManager securityManager = new ComposantSecurManager("securityManager", securityManagerI);
		//creation des differents composants
		
		securityManager.setInterf(securityManagerI);
		//Ajout des diff�rentes interfaces � leurs composants
		
		
		Glue g = new Glue();
		ConnSecurConnect connecteur1 = new ConnSecurConnect("securityConnection", g);
		//Comme pour les composants, cr�ation des interfaces des connecteurs, ajouts des roles  leurs connecteurs
		// Puis creation de la glue du connecteur
		//Creation des diff�rents connecteurs
		// Et enfin ajout des interfaces aux connecteurs correspondant

		
		ConfigServeurDetail configServeur = new ConfigServeurDetail("configServeur");
		//Cr�ation de la configuration
		
		
		configServeur.addConn(connecteur1);
		configServeur.addComp(securityManager);
		//Ajout des composants et des connecteurs � la configuration
		
		
		//Enfin, cr�ation des liens binding et d'attachement souhait�s
		Attachement1 att1 = new Attachement1(securityCheck, securConnect); 
		
		
		
		/* Ce m�me processus sera repet� et bien s�r l�g�rement adapt� pour la configuration ClientServeur.
		 * Le lien entre la configuration configServeur et le composant serveur se fera ainsi : 
		 * composantServeur.addConfig(configServeur);
		 */
		
	}

}
