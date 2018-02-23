package model;


public class User extends Person{
	private Affinity affinity;

	public User(int id, String name, byte age,Egender gender, Affinity affinity) {
		super(name, age, id, gender);
		this.affinity = affinity;
	}
	
	public User(){	
	}

	public Affinity getAffinity() {
		return affinity;
	}

	public void setAffinity(Affinity affinity) {
		this.affinity = affinity;
	}

	
	
	
	

}
