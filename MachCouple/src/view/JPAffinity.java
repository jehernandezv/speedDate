package view;

import java.awt.FlowLayout;


import javax.swing.JComboBox;
import javax.swing.JPanel;

public class JPAffinity extends JPanel{
	JComboBox mens, women;

	public JPAffinity() {
		this.mens = new JComboBox();
		this.women = new JComboBox();
		init();
	}

	private void init() {
		this.add(mens);
		this.add(women);
	}

	public JComboBox getMens() {
		return mens;
	}

	public void setMens(JComboBox mens) {
		this.mens = mens;
	}

	public JComboBox getWomen() {
		return women;
	}

	public void setWomen(JComboBox women) {
		this.women = women;
	}
	
	

	
}
