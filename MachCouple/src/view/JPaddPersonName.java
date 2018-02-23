package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPaddPersonName extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel lB_id,lB_name;

	public JPaddPersonName() {
		this.lB_id = new JLabel("ID");
		this.lB_name =  new JLabel("Name");
		init();
	}

	private void init(){
		this.add(lB_id);
		this.add(lB_name);
	}
	
	
	

}
