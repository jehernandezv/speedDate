package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class JPanelAddPerson extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel lB_id,lB_name,lB_DayBirthDay,lB_MonthDay,lB_YearBirthDay,lB_LikeSport,lB_likeKids;
	private JSpinner jS_dayBirhday,jS_MonthBirhday,js_AgeBirhday;
	private JRadioButton jRadioButtonLikeSport, jRadioButtondisgustSport, jRadioButtonLikeKids, jRadioButtonDisgustKids;
	private JButton jButtonAccept, jButtonCancel;
	private JTextField jTextFieldId, jTextFieldName;
	
	
	/*
	 * Constructor
	 */
	public JPanelAddPerson() {
		this.setBorder(BorderFactory.createTitledBorder(ConstantView.NAME_JP_ADD_NAME));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.lB_id = new JLabel(ConstantView.JL_ID);
		this.lB_name =  new JLabel(ConstantView.JL_NAME);
		this.lB_DayBirthDay = new JLabel(ConstantView.JL_DAYBIRTHDAY);
		this.lB_MonthDay = new JLabel(ConstantView.JL_MONTHBIRTHDAY);
		this.lB_YearBirthDay = new JLabel(ConstantView.JL_YEARBIRTHDAY);
		this.lB_LikeSport = new JLabel(ConstantView.JL_LIKE_SPORT);
		this.lB_likeKids = new JLabel(ConstantView.JL_LIKE_KIDS);
		this.jS_dayBirhday = new JSpinner();
		this.jS_MonthBirhday = new JSpinner();
		this.js_AgeBirhday = new JSpinner();
		this.jRadioButtondisgustSport = new JRadioButton();
		this.jRadioButtonLikeSport = new JRadioButton();
		this.jRadioButtonLikeKids = new JRadioButton();
		this.jRadioButtonDisgustKids = new JRadioButton();
		this.jButtonAccept = new JButton();
		this.jButtonCancel = new JButton();
		this.jTextFieldId = new JTextField();
		this.jTextFieldName = new JTextField();
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		init();
		
	}

/**
 * Este metodo inicia los valores de los componentes del panel
 */
	private void init() {
		
		this.jRadioButtonDisgustKids.setText(ConstantView.NAME_RB_NOT);
		this.jRadioButtondisgustSport.setText(ConstantView.NAME_RB_NOT);
		this.jRadioButtonLikeKids.setText(ConstantView.NAME_RB_YES);
		this.jRadioButtonLikeSport.setText(ConstantView.NAME_RB_YES);
		this.jButtonAccept.setText(ConstantView.JB_ACCEPT);
		this.jButtonCancel.setText(ConstantView.JB_CANCEL);
		this.jTextFieldId.setText(ConstantView.JL_ID);
		this.jTextFieldName.setText(ConstantView.JL_NAME);
		this.lB_id.setHorizontalAlignment(JLabel.CENTER);
		//Grupos de checkBox
		ButtonGroup groupLikeSport = new ButtonGroup();
		groupLikeSport.add(jRadioButtonLikeSport);
		groupLikeSport.add(jRadioButtondisgustSport);
		//Grupos de CheckBox
		ButtonGroup groupLikeKids = new ButtonGroup();
		groupLikeKids.add(jRadioButtonLikeKids);
		groupLikeKids.add(jRadioButtonDisgustKids);
		
		//Modelo del spiner de dayBirthday
		SpinnerNumberModel modelSpinneerDayBirthDay = new SpinnerNumberModel();
		modelSpinneerDayBirthDay.setMaximum(31);
		modelSpinneerDayBirthDay.setMinimum(0);
		jS_dayBirhday.setModel(modelSpinneerDayBirthDay);
		
		//Modelo del spiner de MonthBirthday
		SpinnerNumberModel modelSpinneerMonthBirthDay = new SpinnerNumberModel();
		modelSpinneerMonthBirthDay.setMaximum(12);
		modelSpinneerMonthBirthDay.setMinimum(1);
		jS_MonthBirhday.setModel(modelSpinneerMonthBirthDay);
		
		//Modelo del spiner de MonthBirthday
		SpinnerNumberModel modelSpinneerYearBirthDay = new SpinnerNumberModel();
		modelSpinneerYearBirthDay.setMaximum(2100);
		modelSpinneerYearBirthDay.setMinimum(1900);
		jS_MonthBirhday.setModel(modelSpinneerYearBirthDay);
		
		//id
		this.add(lB_id);
		this.add(jTextFieldId);
		//name
		this.add(lB_name);
		this.add(jTextFieldName);
		//fecha de nacimiento
		this.add(lB_DayBirthDay);
		this.add(jS_dayBirhday);
		this.add(lB_MonthDay);
		this.add(jS_MonthBirhday);
		this.add(lB_YearBirthDay);
		this.add(js_AgeBirhday);
		//hobies
		this.add(lB_LikeSport);
		this.add(jRadioButtonLikeSport);
		this.add(jRadioButtondisgustSport);
		this.add(lB_likeKids);
		this.add(jRadioButtonLikeKids);
		this.add(jRadioButtonDisgustKids);
	//botones
		this.add(jButtonAccept);
		this.add(jButtonCancel);
		
		
	}
	
	

}
