import java.rmi.Naming;
import java.util.List;

import metier.Compte;
import rmi.IBanqueRemote;

public class ClientRMI {
	public static void main(String[] args){
		try {
			IBanqueRemote stub=(IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			System.out.println(stub.conversion(700));
			System.out.println("Consultation d'un Compte a distance");
			Compte cp=stub.consulterCompte(1);
			System.out.println("Code ="+cp.getCode());
			System.out.println("Solde ="+cp.getSolde());
			System.out.println("Date ="+cp.getDateCreation());
			System.out.println("liste de comptes");
			List<Compte> cptes=stub.listComptes();
			for(Compte c:cptes){
				System.out.println("------------------------------");
				System.out.println("Code ="+c.getCode());
				System.out.println("Solde ="+c.getSolde());
				System.out.println("Date ="+c.getDateCreation());
			}
 		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
