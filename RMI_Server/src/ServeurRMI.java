

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmi.BanqueRMIService;

public class ServeurRMI {
	public static void main(String[] args){
		try {
			LocateRegistry.createRegistry(1099);
			BanqueRMIService od=new BanqueRMIService();
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/BK", od);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
