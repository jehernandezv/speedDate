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
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class JPanelAddPerson extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel lB_name,lB_DayBirthDay,lB_MonthDay,lB_YearBirthDay,lB_LikeSport,lB_likeKids;
	private JSpinner jS_dayBirhday,jS_MonthBirhday,jS_AgeBirhday;
	private JRadioButton jRadioButtonLikeSport, jRadioButtondisgustSport, jRadioButtonLikeKids, jRadioButtonDisgustKids;
	private JButton jButtonAccept, jButtonCancel;
	private JTextField jTextFieldName;
	private JLabel label;
	private JTextField textField;
	
	
	/*
	 * Constructor
	 */
	public JPanelAddPerson() {
		this.setBorder(BorderFactory.createTitledBorder(ConstantView.NAME_JP_ADD_NAME));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		init();
		
	}

/**
 * Este metodo inicia los valores de los componentes del panel
 */
	private void init() {
		//Grupos de checkBox
		ButtonGroup groupLikeSport = new ButtonGroup();
		//Grupos de CheckBox
		ButtonGroup groupLikeKids = new ButtonGroup();
		
		//Modelo del spiner de dayBirthday
		SpinnerNumberModel modelSpinneerDayBirthDay = new SpinnerNumberModel();
		modelSpinneerDayBirthDay.setMaximum(31);
		modelSpinneerDayBirthDay.setMinimum(1);
		modelSpinneerDayBirthDay.setValue(1);
		
		//Modelo del spiner de MonthBirthday
		SpinnerNumberModel modelSpinneerMonthBirthDay = new SpinnerNumberModel();
		modelSpinneerMonthBirthDay.setMaximum(12);
		modelSpinneerMonthBirthDay.setMinimum(1);
		modelSpinneerMonthBirthDay.setValue(1);
		
		//Modelo del spiner de YearBirthday
		SpinnerNumberModel modelSpinneerYearBirthDay = new SpinnerNumberModel();
		modelSpinneerYearBirthDay.setMaximum(2100);
		modelSpinneerYearBirthDay.setMinimum(1900);
		modelSpinneerYearBirthDay.setValue(2000);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {50, 30, 0};
		setLayout(gridBagLayout);
		
		label = new JLabel(ConstantView.JL_ID);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		textField = new JTextField();
		textField.setText(ConstantView.JL_ID);
		textField.setColumns(7);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		this.lB_name =  new JLabel(ConstantView.JL_NAME);
		//name
		GridBagConstraints gbc_lB_name = new GridBagConstraints();
		gbc_lB_name.insets = new Insets(0, 0, 5, 5);
		gbc_lB_name.gridx = 0;
		gbc_lB_name.gridy = 2;
		this.add(lB_name, gbc_lB_name);
		//Textfield name
		this.jTextFieldName = new JTextField();
		jTextFieldName.setColumns(10);
		this.jTextFieldName.setText(ConstantView.JL_NAME);
		GridBagConstraints gbc_jTextFieldName = new GridBagConstraints();
		gbc_jTextFieldName.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldName.gridx = 1;
		gbc_jTextFieldName.gridy = 2;
		this.add(jTextFieldName, gbc_jTextFieldName);
		//Jlabel BirthDay
		this.lB_DayBirthDay = new JLabel(ConstantView.JL_DAYBIRTHDAY);
		GridBagConstraints gbc_lB_DayBirthDay = new GridBagConstraints();
		gbc_lB_DayBirthDay.insets = new Insets(0, 0, 5, 5);
		gbc_lB_DayBirthDay.gridx = 0;
		gbc_lB_DayBirthDay.gridy = 4;
		this.add(lB_DayBirthDay, gbc_lB_DayBirthDay);
		this.jS_dayBirhday = new JSpinner();
		jS_dayBirhday.setModel(modelSpinneerDayBirthDay);
		GridBagConstraints gbc_jS_dayBirhday = new GridBagConstraints();
		gbc_jS_dayBirhday.anchor = GridBagConstraints.EAST;
		gbc_jS_dayBirhday.insets = new Insets(0, 0, 5, 5);
		gbc_jS_dayBirhday.gridx = 1;
		gbc_jS_dayBirhday.gridy = 4;
		this.add(jS_dayBirhday, gbc_jS_dayBirhday);
		//Jlabel MonthBirth
		this.lB_MonthDay = new JLabel(ConstantView.JL_MONTHBIRTHDAY);
		GridBagConstraints gbc_lB_MonthDay = new GridBagConstraints();
		gbc_lB_MonthDay.insets = new Insets(0, 0, 5, 5);
		gbc_lB_MonthDay.gridx = 0;
		gbc_lB_MonthDay.gridy = 5;
		this.add(lB_MonthDay, gbc_lB_MonthDay);
		this.jS_MonthBirhday = new JSpinner();
		
		GridBagConstraints gbc_jS_MonthBirhday = new GridBagConstraints();
		gbc_jS_MonthBirhday.anchor = GridBagConstraints.EAST;
		gbc_jS_MonthBirhday.insets = new Insets(0, 0, 5, 5);
		gbc_jS_MonthBirhday.gridx = 1;
		gbc_jS_MonthBirhday.gridy = 5;
		this.add(jS_MonthBirhday, gbc_jS_MonthBirhday);
		this.lB_YearBirthDay = new JLabel(ConstantView.JL_YEARBIRTHDAY);
		GridBagConstraints gbc_lB_YearBirthDay = new GridBagConstraints();
		gbc_lB_YearBirthDay.insets = new Insets(0, 0, 5, 5);
		gbc_lB_YearBirthDay.gridx = 0;
		gbc_lB_YearBirthDay.gridy = 6;
		this.add(lB_YearBirthDay, gbc_lB_YearBirthDay);
		this.jS_AgeBirhday = new JSpinner();
		jS_AgeBirhday.setModel(modelSpinneerYearBirthDay);
		GridBagConstraints gbc_jS_AgeBirhday = new GridBagConstraints();
		gbc_jS_AgeBirhday.anchor = GridBagConstraints.EAST;
		gbc_jS_AgeBirhday.insets = new Insets(0, 0, 5, 5);
		gbc_jS_AgeBirhday.gridx = 1;
		gbc_jS_AgeBirhday.gridy = 6;
		this.add(jS_AgeBirhday, gbc_jS_AgeBirhday);
		this.lB_LikeSport = new JLabel(ConstantView.JL_LIKE_SPORT);
		//hobies
		GridBagConstraints gbc_lB_LikeSport = new GridBagConstraints();
		gbc_lB_LikeSport.insets = new Insets(0, 0, 5, 5);
		gbc_lB_LikeSport.gridx = 0;
		gbc_lB_LikeSport.gridy = 9;
		this.add(lB_LikeSport, gbc_lB_LikeSport);
		this.jRadioButtonLikeSport = new JRadioButton();
		this.jRadioButtonLikeSport.setText(ConstantView.NAME_RB_YES);
		groupLikeSport.add(jRadioButtonLikeSport);
		GridBagConstraints gbc_jRadioButtonLikeSport = new GridBagConstraints();
		gbc_jRadioButtonLikeSport.insets = new Insets(0, 0, 5, 5);
		gbc_jRadioButtonLikeSport.gridx = 1;
		gbc_jRadioButtonLikeSport.gridy = 9;
		this.add(jRadioButtonLikeSport, gbc_jRadioButtonLikeSport);
		this.jRadioButtondisgustSport = new JRadioButton();
		this.jRadioButtondisgustSport.setText(ConstantView.NAME_RB_NOT);
		groupLikeSport.add(jRadioButtondisgustSport);
		GridBagConstraints gbc_jRadioButtondisgustSport = new GridBagConstraints();
		gbc_jRadioButtondisgustSport.insets = new Insets(0, 0, 5, 0);
		gbc_jRadioButtondisgustSport.gridx = 2;
		gbc_jRadioButtondisgustSport.gridy = 9;
		this.add(jRadioButtondisgustSport, gbc_jRadioButtondisgustSport);
		this.lB_likeKids = new JLabel(ConstantView.JL_LIKE_KIDS);
		GridBagConstraints gbc_lB_likeKids = new GridBagConstraints();
		gbc_lB_likeKids.insets = new Insets(0, 0, 5, 5);
		gbc_lB_likeKids.gridx = 0;
		gbc_lB_likeKids.gridy = 10;
		this.add(lB_likeKids, gbc_lB_likeKids);
			this.jRadioButtonLikeKids = new JRadioButton();
			this.jRadioButtonLikeKids.setText(ConstantView.NAME_RB_YES);
			groupLikeKids.add(jRadioButtonLikeKids);
			GridBagConstraints gbc_jRadioButtonLikeKids = new GridBagConstraints();
			gbc_jRadioButtonLikeKids.insets = new Insets(0, 0, 5, 5);
			gbc_jRadioButtonLikeKids.gridx = 1;
			gbc_jRadioButtonLikeKids.gridy = 10;
			this.add(jRadioButtonLikeKids, gbc_jRadioButtonLikeKids);
			this.jRadioButtonDisgustKids = new JRadioButton();
			
			this.jRadioButtonDisgustKids.setText(ConstantView.NAME_RB_NOT);
			groupLikeKids.add(jRadioButtonDisgustKids);
			GridBagConstraints gbc_jRadioButtonDisgustKids = new GridBagConstraints();
			gbc_jRadioButtonDisgustKids.insets = new Insets(0, 0, 5, 0);
			gbc_jRadioButtonDisgustKids.gridx = 2;
			gbc_jRadioButtonDisgustKids.gridy = 10;
			this.add(jRadioButtonDisgustKids, gbc_jRadioButtonDisgustKids);
			//Boton cancel
			this.jButtonCancel = new JButton();
			this.jButtonCancel.setText(ConstantView.JB_CANCEL);
			GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
			gbc_jButtonCancel.insets = new Insets(0, 0, 5, 5);
			gbc_jButtonCancel.anchor = GridBagConstraints.WEST;
			gbc_jButtonCancel.gridx = 1;
			gbc_jButtonCancel.gridy = 12;
			this.add(jButtonCancel, gbc_jButtonCancel);
			//Boton aceptar
				this.jButtonAccept = new JButton();
				this.jButtonAccept.setText(ConstantView.JB_ACCEPT);
					GridBagConstraints gbc_jButtonAccept = new GridBagConstraints();
					gbc_jButtonAccept.insets = new Insets(0, 0, 5, 0);
					gbc_jButtonAccept.gridx = 2;
					gbc_jButtonAccept.gridy = 12;
					this.add(jButtonAccept, gbc_jButtonAccept);
		
		
	}
	
	

}
