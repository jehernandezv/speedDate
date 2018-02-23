package utility;

import java.time.LocalDate;
import java.time.Period;


public class Utility {
	/**
	 * 
	 * @param birthDay este parametro consiste en la entrada de los datos de nacimiento, de apartir de ahi se calcula 
	 * la edad de una persona
	 * @return retorna la edad en años de la persona
	 */
	public static byte getAge(LocalDate birthDay){
		LocalDate dateNow = LocalDate.now();
		Period period = Period.between(birthDay, dateNow);
		
		return (byte) period.getYears();
	}
	
	public static boolean isFalse(String string){
		return string.equals("false")? false:true;
	}

}
