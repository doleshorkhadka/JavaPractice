
// Client program.
import java.net.*;
import java.io.*;
import java.util.*;
public class MsgClient
{
public static void main(String args[]) throws IOException
{
	// Open your connection to a server, at port 1254
	Socket cs = new Socket ("localhost", 1254) ;
	// Get an input file handle from the socket and read the input
	Scanner ins = new Scanner(cs.getInputStream());
	PrintWriter outs= new PrintWriter(cs.getOutputStream(), true);
	Scanner inSys = new Scanner(System.in);
	//Perform IO
	String svms,clms;
	do {
		svms = ins.nextLine();
		System.out.println("\tServer: "+svms);
		System.out.print("Client: ");
		clms = inSys.nextLine();
		outs.println(clms);
	}
	while(svms.equals("Good bye")!= true );
	//close streams and connection
	ins.close();
	inSys.close();
	outs.close();
	cs.close();
}
}
