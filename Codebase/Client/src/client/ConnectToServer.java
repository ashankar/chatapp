/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

/**
 *
 * @author Anand Shankar
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class ConnectToServer {
    protected static Socket s=null;

    ConnectToServer()
    {
        try {

                s=new Socket("localhost",8);


        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    protected Hashtable getConnection()
    {
          Hashtable hs=new Hashtable();
        try {


                DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
                hs.put("din", din);
                hs.put("dout", dout);

        } catch (Exception e) {
            e.printStackTrace();
        }

           return(hs);
    }

}
