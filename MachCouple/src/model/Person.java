package model;

import java.time.LocalDate;

/**
 * @author jhonn hernandez
 */

public class Person {
	private int id;
	private String name;
	private byte age;
	private Egender gender;
	private LocalDate birthDay;
	
	/*
	 * constructor
	 */
	public Person(String name, byte age,int id,Egender gender) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.gender = gender;
	}
	/*
	 * Constructor
	 */
	public Person(int id, String name, byte age, Egender gender,
			LocalDate birthDay) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthDay = birthDay;
	}


	/*
	 * Constructor
	 */
	public Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Egender getGender() {
		return gender;
	}

	public void setGender(Egender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public LocalDate getBirthDay() {
		return birthDay;
	}



	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	
	
	
	

}
