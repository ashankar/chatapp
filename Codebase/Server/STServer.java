import java.io.*;
import java.net.*;
import java.util.*;
public class STServer
{
	ServerSocket ss;
	Socket s;
	ArrayList al=new ArrayList();
	public STServer()
	{
		try
		{
			System.out.println("Server Stareted!");
			
			ss=new ServerSocket(8);
			while(true)
			{
				s=ss.accept();
				al.add(s);
				//System.out.println("Client Connected!");
				Runnable r=new MyThread(s,al);
				Thread t=new Thread(r);
				t.start();
			}
			
		}catch(Exception e1) {System.out.println(e1); }
	}
	
	public static void main(String args[])
	{
		new STServer();
	}
}	