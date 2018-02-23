package model;

public class Affinity {
	private boolean isLikeSport;
	private boolean isLikeKids;
	
	
	
	
	public Affinity(boolean isLikeSport, boolean isLikeKids) {
		this.isLikeSport = isLikeSport;
		this.isLikeKids = isLikeKids;
	}
	
	public Affinity(){
		
	}
	/**
	 * Este metodo evalua y asigna porcentajes de afinidad segun los gustos del usuario
	 * @param user1 
	 * @param user2
	 * @return
	 */
	public byte affinity(User user1,User user2){
		byte affinity = 0;
		byte direfenceAge = (byte) (user1.getAge()- user2.getAge());
		
		if(direfenceAge < 0){
			direfenceAge = (byte) (direfenceAge * -1);
		}
		
		if(direfenceAge <= 20 && direfenceAge >= 0){
			affinity += 30;
		}
		
		if(user1.getAffinity().isLikeKids == user2.getAffinity().isLikeKids == true){
			affinity += 40;
		}
		
		if(user1.getAffinity().isLikeSport == user2.getAffinity().isLikeSport == true){
			affinity += 30;
		}
		return affinity;
	}

	
	
	
	public boolean isLikeSport() {
		return isLikeSport;
	}

	public void setLikeSport(boolean isLikeSport) {
		this.isLikeSport = isLikeSport;
	}

	public boolean isLikeKids() {
		return isLikeKids;
	}

	public void setLikeKids(boolean isLikeKids) {
		this.isLikeKids = isLikeKids;
	}
	
	
	

}
