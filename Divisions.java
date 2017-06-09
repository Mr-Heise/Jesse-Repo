/*
 * Divisions.java
 * Jesse Maki
 * CSC30
 * Start Date: Thursday 8 June 2017
 * Create a program that sorts students into track divisions using a comma-delimited file. All results will be exported into a divisions.txt file.
 */
 
 import java.io.*;
 
 /**
  * The Divisions class sorts students into track divisions using a comma-delimited file. All results will be exported into a divisions.txt file.
  */
  
  public class Divisions{
  
  
  	
  	public static String determineDivision(int year, int birthMonth){
  	
  	
  		String result = "";
 			
		int SHSAAYear = 2016;
		
		int age = 10;
		int division = 0;
		int cutOffAge;
				
		Scanner input = new Scanner(System.in);
				
		System.out.println("\n\n\t***THE TRACK DIVISIONS PROGRAM ***");
		
		/*System.out.print("\n\tPlease enter the current SHSAA Year: ");
		SHSAAYear = input.nextInt();*/
		
		do {
		
			System.out.print("\n\tPlease enter the year that you were born: ");
			birthYear = input.nextInt();
		
			System.out.print("\n\tPlease enter the month that you were born (as a number): ");
			birthMonth = input.nextInt();
		
			cutOffAge = SHSAAYear - birthYear;
		
			if (cutOffAge > 17) {
				System.out.println("\n\tYou are too old to compete!");
				
			} else if (cutOffAge < 11) {
				System.out.println("\n\tYou are too young to compete!");
				
			}
		
		} while (cutOffAge < 11 || cutOffAge > 17);
		
		System.out.println("\n\tIn the " + SHSAAYear + "/" + (SHSAAYear + 1) + " school year, the student athlete turned " + cutOffAge + " years old.");
				
		if (birthMonth <= 8) {
			do {

				age++;
				division = age;
										
			} while (age != cutOffAge);
			
		} else {
			do {
			
				age++;
				division = age - 1;
										
			} while (age != cutOffAge);
			
		}		
			
		switch (division) {
		
			case 10: result = "Wee Pee";
			case 11: result = "Wee Pee";
			case 12: result = "Pee Wee";
			case 13: result = "Bantam";
			case 14: result = "Midget";
			case 15: result = "Junior";
			case 16: result = "Senior";
			case 17: result = "Senior";
			
		}	

		System.out.println("\n");
	
	}
	
		
  	
  	}
  
  	public static void main(String[] args){
  	
  		File textFile = new File("Track_Division_Input_File.csv");
  		
  		FileReader in;
  		
  		BufferedReader readFile;
  		
  		String lineOfText;
  		
  		String division;
  		
  		
  		
  		System.out.println("\n\tTHE TRACK DIVISIONS PROGRAM\n");
  		
  		
  		try{
  		
  			in = new FileReader(textFile);
  			
  			readFile = new BufferedReader(in);
  			
  			while ((lineOfText = readFile.readLine()) != null) {
  			
	  			// Begin Parse String.
	  				
	  			String lastName;
	  			String firstName;
	  			String tempYear;
	  			int birthYear;
	  			int birthMonth;
	  		
	  			int comma;
	  		
	  			// End Parse String.
  		
  			// Determine track division.
  			division = determineDivision(birthYear, birthMonth);
  			
  			System.out.println("\n\tdivision = " + division);
  			
  		
  			//Identify Last Name.
  		comma = lineOfText.indexOf(",");
		lastName = lineOfText.substring(0,comma);
		System.out.println("\n\tlastName = " + lastName);
		
		
		lineOfText = lineOfText.substring(comma + 1);
		
	
			//Identify First Name.
		comma = lineOfText.indexOf(",");
		firstName = lineOfText.substring(0,comma);
		System.out.println("\n\tfirstName = " + firstName);
		
		
		
		lineOfText = lineOfText.substring(comma + 1);
		
		
			//Identify Birth Year.
		comma = lineOfText.indexOf(",");
		birthYear = Integer.parseInt(lineOfText.substring(0,comma));
		System.out.println("\n\tbirthYear = " + birthYear);
		
	
		lineOfText = lineOfText.substring(comma + 1);
	
			
			//Identify Birth Month.
		comma = lineOfText.indexOf(",");
		birthMonth = Integer.parseInt(lineOfText.substring(0,comma));
		System.out.println("\n\tbirthMonth = " + birthMonth);
		
	
		
		System.out.println();
  		
  		}
  	
  	
  	
  	} catch (FileNotFoundException e) {
  	
  		System.out.println("File does not exist or could not be found.");
  		System.err.println("FileNotFoundException: " + e.getMessage());
  	
  	
  	
  	} catch(IOException e){
  	
  		System.out.println("There was a problem reading the file");
  		System.err.println("IOException: " + e.getMessage());
  		
  	}
  	
  	
  	}
  	
  	
 }
 
 
 
 
 
 
 
 
 
