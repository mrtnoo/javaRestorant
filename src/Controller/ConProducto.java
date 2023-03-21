/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class ConProducto {
    

       public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;

}
        
        
        public int EliminarProducto(String id) throws SQLException, Exception {
           
        Statement consulta = conectar().createStatement();
        String query = "delete from producto where id_producto='"+id+"' ";
        
            return consulta.executeUpdate(query);

    }   
        
        public int Insertar_Producto(String NOMBRE,double PRECIO,int STOCK,int TIPO_PESAJE_ID_PESAJE,int TIPO_ANIMAL_ID_ANIMAL,int TIPO_PRODUCTO_ID_TPRODUCTO) throws SQLException, Exception{
        
            CallableStatement cs = conectar().prepareCall("{call AGREGAR_PRODUCTO(?,?,?,?,?,?)}");

            
            cs.setString(1, NOMBRE);
            cs.setDouble(2, PRECIO);
            cs.setInt(3, STOCK);
            cs.setInt(4,TIPO_PESAJE_ID_PESAJE);
            cs.setInt(5, TIPO_ANIMAL_ID_ANIMAL);
            cs.setInt(6, TIPO_PRODUCTO_ID_TPRODUCTO);
            
         
            cs.execute();

            return 1;
        }
}

    


