/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class ConInsumos {
    
       public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;

}
       
        public int SolicitarInsumo(int TOTAL, int CANTIDAD,int ID_COMPRAPRO, int PROVEEDOR_ID_PROVEEDOR ) throws SQLException {
           
        
            CallableStatement con = conectar().prepareCall("{call PEDIRINSUMO(?,?,?,?)}");

            
            con.setInt(1,TOTAL);
            con.setInt(2,CANTIDAD);
            con.setInt(3,ID_COMPRAPRO);
            con.setInt(4,PROVEEDOR_ID_PROVEEDOR);            
            
            con.execute();
            return 1;
    }   
      
    
}
