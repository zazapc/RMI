package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class BanqueRMIService extends UnicastRemoteObject implements IBanqueRemote{

	public BanqueRMIService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return mt*11.3;
	}

	@Override
	public Compte consulterCompte(int code) throws RemoteException {
		Compte cp=new Compte(code, Math.random()*9000, new Date());		
		return cp;
	}

	@Override
	public List<Compte> listComptes() throws RemoteException {
		List<Compte> cptes=new ArrayList<Compte>();
		cptes.add(new Compte(1, Math.random()*9000, new Date()));
		cptes.add(new Compte(2, Math.random()*9000, new Date()));
		cptes.add(new Compte(3, Math.random()*9000, new Date()));
		cptes.add(new Compte(4, Math.random()*9000, new Date()));
		return cptes;
	}

}
