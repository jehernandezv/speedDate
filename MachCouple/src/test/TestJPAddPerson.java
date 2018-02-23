package test;

import javax.swing.JFrame;

import view.JPanelAddPerson;

public class TestJPAddPerson {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JPanelAddPerson jPanelAddPerson = new JPanelAddPerson();
		jFrame.add(jPanelAddPerson);
		jFrame.setSize(250,400);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

}
