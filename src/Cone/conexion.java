
package Cone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexion {

    
    
  public static Connection conectar() throws SQLException{

        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
      
    }
}


