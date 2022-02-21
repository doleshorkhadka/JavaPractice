
import java.io.*;
public class IOstream {
	public static void main(String[] args) //throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;
			
			while ( (c = in.read()) != -1 )
			{
				out.write(c);
			}
			in.close(); //without throws IOException finally will not work
			out.close(); //clear this two lines and uncomment other comments and you can see the effect.
		}
		catch (IOException e)
		{
			System.out.println("Error Occured : "+ e);
		}
		//finally 
		//{
		//	in.close();
		//	out.close();
		//}
	}
}
