

import java.io.*;

public class FileReadWrite 
{
	public static void main(String[] args)
	{	
	try
		{
			FileWriter writer = new FileWriter("streams.txt");
			writer.write("Hello this is the characters from \n Character streams.");
			writer.close();
			FileReader reader = new FileReader("streams.txt");
			char[] ch = new char[50];
			reader.read(ch);
			for (char x :ch)
			{
				System.out.print(x);
			}
			reader.close();
		}
	catch (IOException e)
		{
			System.out.println("Error Occured : "+e);
		}
	}
}
