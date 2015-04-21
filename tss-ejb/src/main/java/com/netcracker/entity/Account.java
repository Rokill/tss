package com.netcracker.entity;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import com.netcracker.dao.User;


public interface Account extends EJBObject {

	public boolean login(String username, String password) throws RemoteException;
	
	public User getUser() throws RemoteException;
	
	public String hello() throws RemoteException;
	
}
