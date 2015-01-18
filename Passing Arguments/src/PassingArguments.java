import java.util.Scanner;

public class PassingArguments
	{
	private static int feetInput;
	private static double inchesInput, heightInInches, heightInCentimeters;
	private static double heightInMeters, heightInFeet, inchesOutput;

	public static void main(String[] args)
		{
		inputFeet();
		inputInches();
		convertToInches(feetInput, inchesInput);
		convertToCentimeters(heightInInches);
		convertToMeters(heightInCentimeters);
		convertToFeet(heightInMeters);
		convertToInches(heightInFeet);
		compare(inchesInput, inchesOutput);
		}
	
	private static int inputFeet()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please input your height in feet and inches,"
				+ " one at a time.");
		System.out.println("How many feet tall are you?");
		feetInput = userInput.nextInt();
		return feetInput;
		}
	
	private static double inputInches()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many inches tall are you?");
		inchesInput = userInput.nextDouble();
		return inchesInput;
		}
	
	private static double convertToInches(int feetInput, double inchesInput)
		{
		heightInInches = feetInput * 12 + inchesInput;
		System.out.println("Your height in inches is " + heightInInches + "\".");
		return heightInInches;
		}
	
	private static double convertToCentimeters(double heightInInches)
		{
		heightInCentimeters = heightInInches * 2.54;
		System.out.println("Your height in centimeters is " + heightInCentimeters + "cm.");
		return heightInCentimeters; 
		}
	
	private static double convertToMeters(double heightInCentimeters)
		{
		heightInMeters = heightInCentimeters / 100;
		System.out.println("Your height in meters is " + heightInMeters + "m.");
		return heightInMeters; 
		}
	
	private static double convertToFeet(double heightInMeters)
		{
		heightInFeet = heightInMeters * 3.28084;
		System.out.println("Your height in feet is " + heightInFeet + "'.");
		return heightInFeet; 
		}
	
	private static double convertToInches(double heightInFeet)
		{
		inchesOutput = heightInFeet * 12;
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
