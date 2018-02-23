package test;

import java.util.ArrayList;

import javax.swing.JFrame;

import persistence.XmlManager;
import model.User;
import model.Users;
import controller.AppListerner;
import view.JPAffinity;
import view.JPanelAddPerson;

public class TestJAffinity {

	public static void main(String[] args) {
		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList = XmlManager.readXml();
		Users users = new Users();
		users.LoadXmlGroupUser();
		JFrame jFrame = new JFrame();
		AppListerner appListerner = AppListerner.getInstance();
		
		JPAffinity jpAffinity = new JPAffinity();
		appListerner.setJpAffinity(jpAffinity);
		appListerner.setUsers(users);
		
		appListerner.initJComboBox();
		jFrame.add(jpAffinity);
		jFrame.setSize(250,400);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
