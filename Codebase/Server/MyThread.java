import java.io.*;
import java.util.*;
import java.net.*;

class MyThread implements Runnable
{
	Socket s;
	ArrayList al;
	MyThread(Socket s, ArrayList al)
	{
		this.s=s;	
		this.al=al;
	}
	 public void run()
         {
                    String str;
                    try {
                        
                        DataInputStream din= new DataInputStream(s.getInputStream());
                        do {
                            str=din.readUTF();
                            System.out.println(str);
                            tellEveryone(str);
                        } while (!str.equals("Stop"));
                   } catch (Exception e) {
                       System.out.println(e);
                   }
          }
           
           
       private void tellEveryone(String str1)
    {
        Iterator i = al.iterator();
        while(i.hasNext())
        {
            try {
                Socket sc=(Socket)i.next();
                DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
                dout.writeUTF(str1);
                dout.flush();
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println(e);
            }


        }

    }
}