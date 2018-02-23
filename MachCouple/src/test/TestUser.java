package test;

import java.time.LocalDate;
import java.util.ArrayList;









import model.Affinity;
import model.Egender;
import model.User;
import model.Users;
import persistence.XmlManager;
import utility.Utility;

public class TestUser {
	
	public static void main(String[] args) {
		User user = new User(1651651, "jhonn", (byte)40, Egender.MALE, new Affinity (true, false));
		User user1 = new User(654465,"dania", (byte) 30, Egender.FEMALE,new Affinity(false, false));
		User user2 = new User(6654656,"Carlos", (byte) 19, Egender.MALE, new Affinity(true, true));
		User user3 = new User(989754,"Daniela", (byte) 46, Egender.FEMALE, new Affinity(true, false));
		
		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(user);
		arrayList.add(user1);
		arrayList.add(user2);
		arrayList.add(user3);
		
		XmlManager.SaveXmlGroup(arrayList);
		
		
		arrayList = XmlManager.readXml();
		
		Affinity affinity = new Affinity();
		System.out.println("Afinidad: " + affinity.affinity(user1, user3));
		/*for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("likeKids: " + arrayList.get(i).getAffinity().isLikeKids());
		}*/
		
		
		/*Users users = new Users();
		users.LoadXmlGroupUser();
		for (int i = 0; i < users.getArrayListWomen().size(); i++) {
			System.out.println("name: " + users.getArrayListWomen().get(i).getName());
		}*/
	}

}
