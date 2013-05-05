
package client;

/**
 *
 * @author Anand Shankar
 */
import java.sql.*;
import java.util.*;

public class ConnectToDB {

    Connection con=null;

    ConnectToDB()
    {
        
          try {
            
              Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdb","anand","anand");
              
        } catch (Exception e) {
            e.printStackTrace();
        }
        
      }
    protected boolean varifyData(String id, String pass)
    {
        boolean b=false;

        try {

            PreparedStatement ps=con.prepareStatement("select pass from login where id=?");
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                if(rs.getString("pass").equals(pass))
                  b=true;

            }
            ps.close();
            rs.close();
            

        } catch (Exception e) {

            e.printStackTrace();
        }

        return(b);

    }

    protected boolean setData(Hashtable hs)
    {
        boolean b=false;
        try {

            int x=0,y=0;
            PreparedStatement ps=con.prepareStatement("insert into client_info (id,name,dob,sex,qual,addr,city,state,country,zip,ip,regdate) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement ps1=con.prepareStatement("insert into login (id,pass) values(?,?)");
            ps.setString(1, (String)hs.get("id"));
            ps.setString(2, (String)hs.get("name"));
            ps.setString(3, hs.get("dob").toString());
            ps.setString(4, (String)hs.get("sex"));
            ps.setString(5, (String)hs.get("qual"));
            ps.setString(6, hs.get("addr").toString());
            ps.setString(7, (String)hs.get("city"));
            ps.setString(8, (String)hs.get("state"));
            ps.setString(9, (String)hs.get("country"));
            ps.setString(10, hs.get("zip").toString());
            ps.setString(11, hs.get("ip").toString());
            ps.setString(12, java.util.Calendar.getInstance().getTime().toGMTString());
            ps1.setString(1, hs.get("id").toString());
            ps1.setString(2, hs.get("pass").toString());

            x=ps.executeUpdate();
            y=ps1.executeUpdate();
            if(x!=0 && y!=0)
                b=true;

            ps.close();
            ps1.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return(b);
    }

    
    protected String setTemp(String id)
    {
       
        String name=null, city=null;
        try {

            PreparedStatement ps=con.prepareStatement("select name,city from client_info where id=?");
            PreparedStatement ps1=con.prepareStatement("insert into temp (id,name,city) values(?,?,?)");
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                name=rs.getString("name");
                city=rs.getString("city");

            }

            ps1.setString(1, id);
            ps1.setString(2, name);
            ps1.setString(3, city);
            ps1.executeUpdate();
            ps.close();
            ps1.close();
            rs.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

            return (name);
      }

      protected Vector getTemp()
    {

          Vector v=new Vector();

        try {

            PreparedStatement ps=con.prepareStatement("select * from temp");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                v.addElement(rs.getString("name")+" : "+rs.getString("city"));
            }

            ps.close();
            rs.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

            return (v);
      }


    protected void delTemp(String id)
    {

         try {

            PreparedStatement ps=con.prepareStatement("delete from temp where id=?");
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }

            
      }



}
