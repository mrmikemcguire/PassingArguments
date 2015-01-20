import java.util.Scanner;

public class PassingArguments
	{
	public static void main(String[] args)
		{
		int feetInput = inputFeet();
		double inchesInput = inputInches();
		double heightInInches = convertToInches(feetInput, inchesInput);
		double heightInCentimeters = convertToCentimeters(heightInInches);
		double heightInMeters = convertToMeters(heightInCentimeters);
		double heightInFeet = convertToFeet(heightInMeters);
		double inchesOutput = convertToInches(heightInFeet);
		compare(inchesInput, inchesOutput);
		}
	
	private static int inputFeet()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please input your height in feet and inches,"
				+ " one at a time.");
		System.out.println("How many feet tall are you?");
		return userInput.nextInt();
		}
	
	private static double inputInches()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many inches tall are you?");
		return userInput.nextDouble();
		}
	
	private static double convertToInches(int feet, double inches)
		{
		double heightInInches = feet * 12 + inches;
		System.out.println("Your height in inches is " + heightInInches + "\".");
		return heightInInches;
		}
	
	private static double convertToCentimeters(double inches)
		{
		double heightInCentimeters = inches * 2.54;
		System.out.println("Your height in centimeters is " + heightInCentimeters + "cm.");
		return heightInCentimeters; 
		}
	
	private static double convertToMeters(double centimeters)
		{
		double heightInMeters = centimeters / 100;
		System.out.println("Your height in meters is " + heightInMeters + "m.");
		return heightInMeters; 
		}
	
	private static double convertToFeet(double meters)
		{
		double heightInFeet = meters * 3.28084;
		System.out.println("Your height in feet is " + heightInFeet + "'.");
		return heightInFeet; 
		}
	
	private static double convertToInches(double feet)
		{
		double inchesOutput = feet * 12;
		System.out.println("Your height in inches is " + inchesOutput + "\".");
		return inchesOutput; 
		}
	
	private static void compare(double inchesInput, double inchesOutput)
		{ 
		double difference = Math.abs(inchesInput - inchesOutput);
		double deviation = difference / inchesInput;
		System.out.println("Your original input gave you a height of " 
		+ inchesInput + "\".");
		System.out.println("Your output gives you a height of " 
				+ inchesInput + "\"");
		System.out.println("for a deviation of " + deviation / 100 + " %.");
		}

	}
