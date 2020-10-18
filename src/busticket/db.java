
package busticket;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class db {

 public static Connection javabusdb()
 {
     try{
         Class.forName("org.sqlite.JDBC");
         Connection conn = DriverManager.getConnection("jdbc:sqlite:busticket.sqlite");
         return conn;
         
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
           return null;
     }
   
 }
}   

