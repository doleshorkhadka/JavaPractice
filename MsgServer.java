//Server program.
import java.net.*;
import java.io.*;
import java.util.*;
class MsgServer
{
public static void main(String args[]) throws IOException
	{
	// Register service on port 1254
	ServerSocket ss = new ServerSocket(1254) ;
	// Wait and accept a connection
	Socket cs = ss.accept();
	// Get a communication stream associated with the socket
	Scanner ins = new Scanner(cs.getInputStream());
	PrintWriter outs= new PrintWriter(cs.getOutputStream(), true);
	Scanner inSys = new Scanner(System.in);
	// Perform I/O
	String svmg,clmg;
	do {
		System.out.print("Server: ");
		svmg = inSys.nextLine();
		outs.println(svmg);
		clmg = ins.nextLine();
		System.out.println("\tClient: "+clmg);
	}
	while(clmg.equals("Good Bye")!=true);
	// Close streams and connection
	outs.close();
	ins.close();
	cs.close();
	ss.close();
	}
}
