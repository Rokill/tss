package com.netcracker.entity;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import com.netcracker.dao.User;

public class AccountBean implements SessionBean{
	
	private User user;
	
	public boolean login(String username, String password) {
//		user = UserFactory.getUser(username, password);
//		return user != null;
		return false;
	}
	
	public String hello(){
		return "hello";
	}
	
	public User getUser() {
		return user;
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}


}
