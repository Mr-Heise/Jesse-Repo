/*
 * ParseString.java
 * Jesse Maki
 * CSC30
 * Start Date: Wednesday 7 June 2017
 * This program simulates processing a line of text from a text file.
 */
 
 
 import java.lang.Integer;
 
 
 /**
  The ParseString Class simulates processing a line of text from a text file.
  */
  public class ParseString {
  	
  	public static void main(String[] args){
  	
  		String lineOfText = "Babyak,Akilah,2000,6,June";
  		
  		String lastName;
  		String firstName;
  		String tempYear;
  		int birthYear;
  		int birthMonth;
  		
  		int comma;
  		
  		System.out.println("\n\t THE PARSE STRING SIMULATION PROGRAM \n");
  		
  		
  		comma = lineOfText.indexOf(",");
		lastName = lineOfText.substring(0,comma);
		System.out.println("\n\tlastName = " + lastName);
		
		
		
		lineOfText = lineOfText.substring(comma + 1);
		
		
		
		
		
		comma = lineOfText.indexOf(",");
		firstName = lineOfText.substring(0,comma);
		System.out.println("\n\tfirstName = " + firstName);
		
		
		
		lineOfText = lineOfText.substring(comma + 1);
		
		
		
		
		
		comma = lineOfText.indexOf(",");
		birthYear = Integer.parseInt(lineOfText.substring(0,comma));
		System.out.println("\n\tbirthYear = " + birthYear);
		
		
	
		lineOfText = lineOfText.substring(comma + 1);
	
		
		
		
		comma = lineOfText.indexOf(",");
		birthMonth = Integer.parseInt(lineOfText.substring(0,comma));
		System.out.println("\n\tbirthMonth = " + birthMonth);
		
		
		
		
		System.out.println();
  	
  		
  		
  	}
  	
  	
}








