package controller;


import javax.swing.JComboBox;

import view.JPAffinity;
import model.Users;

public class AppListerner {
	public static AppListerner instance;
	private Users users;
	private JPAffinity jpAffinity;
	
	private AppListerner() {
	}
	
	private AppListerner(Users user){
		this.users = user;
	}

	public static AppListerner getInstance() {
		if (instance == null)
			instance = new AppListerner();
		return instance;
	}
	
	public void initJComboBox(){
	 JComboBox jComboBoxNameWomen = new JComboBox(this.users.getName(this.users.getArrayListWomen()));
	 this.jpAffinity.setWomen(jComboBoxNameWomen);
	}
	
	
	//GETTERS AND SETTERS
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public JPAffinity getJpAffinity() {
		return jpAffinity;
	}

	public void setJpAffinity(JPAffinity jpAffinity) {
		this.jpAffinity = jpAffinity;
	}
	
	
	
}
