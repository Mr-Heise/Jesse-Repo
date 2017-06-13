/*
 * Divisions.java
 * Jesse Maki
 * CSC30
 * Start Date: Thursday 8 June 2017
 * Create a program that sorts students into track divisions using a comma-delimited file. All results will be exported into a divisions.txt file.
 */
 
import java.io.*;

/**
 * The Divisions class sorts students into track divisions using a comma-delimited file. All results will be 
 *	exported into a divisions.txt file.
 */

public class Divisions{


	public static String determineDivision(int birthYear, int birthMonth){
	
		final int SHSAA_YEAR = 2016;
		final int SHSAA_MONTH = 8;
		
		
		int age;
		
		String result = "";
		
		
		
		age = SHSAA_YEAR - birthYear;
		
		
		if (birthMonth <= 8 && age >= 16){
		
			result = "Senior";
		
		} else if (birthMonth > 8 && age >= 16){
				
			result = "Senior";
		
		}
		
		else if (birthMonth <= 8 && age == 15){
				
			result = "Junior";
		
		} else if (birthMonth > 8 && age == 15){
		
			result = "Midget";
		
		}
		
		
		else if (birthMonth <= 8 && age == 14){
		
			result = "Midget";
		
		}else if (birthMonth > 8 && age == 14){
		
			result = "Bantam";
		
		}
		
		else if (birthMonth <= 8 && age == 13){
		
			result = "Bantam";
		
		} else if (birthMonth > 8 && age == 13){
		
			result = "Pee Wee";
		
		}
		
		 else if (birthMonth <= 8 && age == 12){
		
			result = "Pee Wee";
		
		} else if (birthMonth > 8 && age == 12){
		
			result = "Wee Pee";
		
		} 
		
		else if (birthMonth <= 8 && age == 11){
		
			result = "Wee Pee";
		
		} else if (birthMonth > 8 && age == 11){
		
			result = "Wee Pee";
		
		}
		
		return (result);
	
	
	}

	public static void main(String[] args){
		
		File textFile = new File("Track_Division_Input_File.csv");
		
		FileReader in;
		
		BufferedReader readFile;
		
		String lineOfText;
		
		String division;
		
		String outputText;
		
		
		
		File outputFile = new File("Track_divisions.txt");
		
		FileWriter out;
		
		BufferedWriter writeFile;
		
		
		
	
		System.out.println("\n\t*** THE TRACK DIVISIONS PROGRAM ***\n");
		
		try{
		
			in = new FileReader(textFile);
			
			readFile = new BufferedReader(in);
			
			
			out = new FileWriter(outputFile);
			
			writeFile = new BufferedWriter(out);
			
			
			writeFile.write("TRACK AND FIELD DIVISIONS FOR EHS STUDENTS FOR THE 2016-17 SCHOOL YEAR\n\n");
			
			
			while ((lineOfText = readFile.readLine()) != null) {
			
				// Begin parse string.
				
					String lastName;
					String firstName;
		
					int birthYear;
					int birthMonth;
		
					int comma;
			
		
	
					// Identify last name.
		
					comma = lineOfText.indexOf(",");
		
					lastName = lineOfText.substring(0,comma);
		
					// System.out.println("\n\tlastName = " + lastName);
		
		
		
					lineOfText = lineOfText.substring(comma + 1);
		
		
					// Identify first name.
		
		
					comma = lineOfText.indexOf(",");
		
					firstName = lineOfText.substring(0,comma);
		
					// System.out.println("\n\tfirstName = " + firstName);
		
		
		
					lineOfText = lineOfText.substring(comma + 1);
		
		
					// Identify the birth year.
		
		
					comma = lineOfText.indexOf(",");
		
					birthYear = Integer.parseInt(lineOfText.substring(0,comma));
		
					// System.out.println("\n\tbirthYear = " + birthYear);
		
		
	
					lineOfText = lineOfText.substring(comma + 1);
	
		
					// Identify the birth month.
		
		
					comma = lineOfText.indexOf(",");
		
					birthMonth = Integer.parseInt(lineOfText.substring(0,comma));
		
					// System.out.println("\n\tbirthMonth = " + birthMonth);
				
				
				// End parse string.
				
				// Determine track division.
				division = determineDivision(birthYear,birthMonth);
				
				outputText = lastName + ", " + firstName + " is a " + division + ".";
				
				writeFile.write(outputText + "\n\n");
				writeFile.newLine();
				writeFile.newLine();
				
			
				
					
			
			}
			writeFile.close();
		
		} catch (FileNotFoundException e) {
		
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
			
		
		} catch (IOException e){
			
			System.out.println("There was a problem reading the file.");
			System.err.println("IOException: " + e.getMessage());
			
		
		}
		
		
	
	
	}



}
 
 
 
 
 
 
 
 
