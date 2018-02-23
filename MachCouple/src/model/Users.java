package model;

import java.util.ArrayList;

import persistence.XmlManager;

public class Users {
	private ArrayList<User> arrayListWomen, arrayListMen;
	/**
	 * Constructor
	 * @param arrayListWomen
	 * @param arrayListMen
	 */
	public Users(ArrayList<User> arrayListWomen, ArrayList<User> arrayListMen) {
		this.arrayListWomen = arrayListWomen;
		this.arrayListMen = arrayListMen;
	}
	
	public Users(){
		this.arrayListMen = new ArrayList<User>();
		this.arrayListWomen = new ArrayList<User>();
		
	}
	/**
	 * Este metodo se encarga de leer y almacenar y ordenar usuarios por su genero
	 */
	public void LoadXmlGroupUser(){
		ArrayList<User>arrayListUsers = new ArrayList<User>();
		arrayListUsers = XmlManager.readXml();	
		for (int i = 0; i < arrayListUsers.size(); i++) {
			if(arrayListUsers.get(i).getGender() == Egender.FEMALE)
				this.arrayListWomen.add(arrayListUsers.get(i));
			else{
				this.arrayListMen.add(arrayListUsers.get(i));
			}
		}
		
	}
	/**
	 * Este metodo guarda una usuario y lo almacena segun su genero
	 * @param user este parametro es el usuario que vamos a almacenar en una array para posterior evaluarlo
	 */
	public void addUser(User user){
		if(user.getGender() == Egender.FEMALE)
			this.arrayListWomen.add(user);
		else{
			this.arrayListMen.add(user);
			}
	}

	
						//GETTERS AND SETTERS
	public ArrayList<User> getArrayListWomen() {
		return arrayListWomen;
	}

	public void setArrayListWomen(ArrayList<User> arrayListWomen) {
		this.arrayListWomen = arrayListWomen;
	}

	public ArrayList<User> getArrayListMen() {
		return arrayListMen;
	}

	public void setArrayListMen(ArrayList<User> arrayListMen) {
		this.arrayListMen = arrayListMen;
	}
	/**
	 * Este metodo obtiene todos los nombres de un array de usuarios
	 * @param users
	 * @return
	 */
	public String [] getName(ArrayList<User> users){
		String [] names = new String[users.size()];
		for (int i = 0; i < names.length; i++) {
			names[i] = users.get(i).getName();
		}
		return names;
	}
	
	
	
	
	
}
