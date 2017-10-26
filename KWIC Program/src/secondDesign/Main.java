package secondDesign;

import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("KWIC Program - Design 2");
		LineSorter sorter = new LineSorter();
		
		FileIO fileIO = new FileIO();
		ArrayList<String> lines = fileIO.readFromFile();
		
		sorter.circularShiftLines(lines);
		sorter.alphabetize(lines);
		
		fileIO.writeToFile(lines);
		
//		console print
//		for (int i = 0; i < lines.size(); i++)
//		{
//			System.out.println(i);
//		}


	}

}
