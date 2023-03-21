/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.ConMesa;
import Controller.ConOrden;
import Controller.ConPersona;
import Controller.ConReceta;
import Controller.ConRecetaStock;
import Model.Empleado;
import Model.Mesa;
import Model.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class RecetaView extends javax.swing.JFrame {

    public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
       }

    public RecetaView() {

        initComponents();
        
        
            try {
                Cargartabla();
                CargartablaProducto();
                llenarCboPlato();
                llenarCboProducto();
                
            } catch (SQLException ex) {
                Logger.getLogger(RecetaView.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
        
    }

 
   

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboPesaje = new javax.swing.JComboBox<>();
        cboPlato = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cboProducto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtIngrediente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 91, 133));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Plato");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesaje");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 28, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 110, 52));
        jButton1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 100, -1));

        cboPesaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PESAJE", "GRAMO", "ML", "C/U" }));
        jPanel1.add(cboPesaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 80, -1));

        cboPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPlatoActionPerformed(evt);
            }
        });
        jPanel1.add(cboPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 450, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 920, 290));

        jPanel1.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("REGISTRO INGREDIENTES POR RECETA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        txtIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngredienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° ingrediente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 90, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 390, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/kisspng-ingredient-kitchen-utensil-food-condiment-ingredients-and-kitchen-utensils-5a70503c83a3c0.7918750215173100125392.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            AgregarOrden();
            Cargartabla();
            CargartablaProducto();
        } catch (SQLException ex) {
            Logger.getLogger(RecetaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPlatoActionPerformed

    }//GEN-LAST:event_cboPlatoActionPerformed

    private void txtIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngredienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              
        try {

            String id  = txtIngrediente.getText();
            Statement consulta = conectar().createStatement();
            String sql = "delete from receta where ID_receta = '"+id+"'";
            consulta.execute(sql);
            
            JOptionPane.showMessageDialog(null, "Ingrediente Eliminado");
            CargartablaProducto();
            Cargartabla();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public void AgregarOrden(){

        try{
               
        ConRecetaStock con = new ConRecetaStock();
        String nombreProd = (String) cboProducto.getSelectedItem();
        String nombrePla = (String) cboPlato.getSelectedItem();
        
        PreparedStatement pt = null;
        ResultSet rs = null;
        
        
        PreparedStatement ps = null;
        ResultSet r = null;
                
        String sq = "select id_producto from producto where nombre = '"+nombreProd+"'";
        String sq2 = "select id_plato from plato where nombre = '"+nombrePla+"'";
                
        pt = conectar().prepareStatement(sq2);
        rs = pt.executeQuery();
                
        
        ps = conectar().prepareStatement(sq);
        r = ps.executeQuery();
        
        if(r.next() && rs.next()){
        int pl = r.getInt(1);
        int p2 = rs.getInt(1);
        
        int CANTIDAD = (Integer.parseInt(txtCantidad.getText()));    
        int PLATO_ID_PLATO = p2;
        int PRODUCTO_ID_PRODUCTO = pl;
        int TIPO_PESAJE_ID_PESAJE = cboPesaje.getSelectedIndex();
        
          
        

            if(con.InsertarReceta(CANTIDAD, PLATO_ID_PLATO, PRODUCTO_ID_PRODUCTO, TIPO_PESAJE_ID_PESAJE)>0){
                

                JOptionPane.showMessageDialog(null, "Ingrediente añadido");
                
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }    
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        
    }

    
    
    public void Cargartabla() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String sql = "select p.nombre ,count(pr.nombre) INGREDIENTES , sum(pr.precio * cantidad) as \"COSTO PLATO\"\n" +
                            "from receta r\n" +
                            "join plato p\n" +
                            "on p.id_plato = r.PLATO_ID_PLATO\n" +
                            "join producto pr \n" +
                            "on pr.id_producto = r.producto_id_producto\n" +
                            "group by  p.nombre";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
           
           
            modelo.addColumn("PLATO");
            modelo.addColumn("INGREDIENTES");
            modelo.addColumn("COSTO PLATO");
            
            
       

            
            while(rs.next()){
                
                
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i< cantidadColumnas ; i++)
                {
                    
                    filas[i] = rs.getObject(i+1);
                    
                }
                
                modelo.addRow(filas);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        this.setLocationRelativeTo(null);
    
        }
    
    
    public void CargartablaProducto() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String sql = "select r.id_receta,p.nombre, pr.nombre ,r.cantidad , t.descripcion\n" +
                            "from receta r \n" +
                            "join plato p\n" +
                            "on p.id_plato = r.PLATO_ID_PLATO\n" +
                            "join producto pr\n" +
                            "on pr.id_producto = r.PRODUCTO_ID_PRODUCTO\n" +
                            "join tipo_pesaje t\n" +
                            "on t.id_pesaje = r.tipo_pesaje_id_pesaje order by p.nombre desc";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("N°INGREDIENTE");                
            modelo.addColumn("PLATO");
            modelo.addColumn("PRODUCTO");
            modelo.addColumn("CANTIDAD ");
            modelo.addColumn("PESAJE");
            
            
            
            while(rs.next()){

                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i< cantidadColumnas ; i++)
                {
                    
                    filas[i] = rs.getObject(i+1);
                    
                }
                
                modelo.addRow(filas);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        this.setLocationRelativeTo(null);
    
        }
    
    
    public void llenarCboPlato() {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre from plato";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboPlato.addItem("PLATOS");   
    
                while(rs.next()){
            
            cboPlato.addItem(rs.getString(1));
         
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    }
    
    
    public void llenarCboProducto() {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre from producto";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboProducto.addItem("PRODUCTOS");   
                while(rs.next()){
            
            cboProducto.addItem(rs.getString(1));
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    }
    


     
     
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPesaje;
    private javax.swing.JComboBox<String> cboPlato;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIngrediente;
    // End of variables declaration//GEN-END:variables
}
