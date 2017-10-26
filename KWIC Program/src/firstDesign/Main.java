package firstDesign;

import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args)
	{
		System.out.println("KWIC Program - Design 1");
		ArrayList<String> lines = readFile();
		circularShiftLines(lines);
		alphabetize(lines);
		outputLines(lines);
	}

	//read the file and and put the lines into the file
	public static ArrayList<String> readFile()
	{
		return null;
	}
	
	//takes the list of lines and circularly shifts the lines
	//by removing the first word in the line and appending it to the end of the line
	public static void circularShiftLines(ArrayList<String> lines)
	{
		
	}
	
	//takes the shifted lines and alphabetizes them in order
	public static void alphabetize(ArrayList<String> shiftedLines)
	{
		
	}
	
	//prints the sorted lines to the console and to an output file.
	public static void outputLines(ArrayList<String> sortedLines)
	{
		
	}
	
	
	
	
}
