/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.ConInsumos;
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
public class SolicitarInsumoView extends javax.swing.JFrame {

    public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
       }

    public SolicitarInsumoView() {

        initComponents();
        
        
        llenarCboElimianr();
        CargartablaPRoducto();
        llenarCboProveedor();
        llenarCboFiltro();
        llenarCboProducto(); 
        CalcularTotal();

                 
        
    }

 
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cboProducto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cboProveedor = new javax.swing.JComboBox<>();
        txtPesaje = new javax.swing.JTextField();
        txtPeueba = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        cboFiltroTabla = new javax.swing.JComboBox<>();
        txtSuma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 91, 133));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 140, 30));

        txtCantidad.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtCantidadComponentAdded(evt);
            }
        });
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCantidadMouseExited(evt);
            }
        });
        txtCantidad.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtCantidadCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCantidadInputMethodTextChanged(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 570, 230));

        cboProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProductoItemStateChanged(evt);
            }
        });
        jPanel1.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("REGISTRO INGREDIENTES POR RECETA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 150, -1));

        jPanel1.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 140, -1));

        txtPesaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesajeActionPerformed(evt);
            }
        });
        jPanel1.add(txtPesaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 140, -1));
        jPanel1.add(txtPeueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 40, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pesaje");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Proveedor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("total");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 40, 20));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 140, -1));

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        cboEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(cboEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 120, -1));

        cboFiltroTabla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFiltroTablaItemStateChanged(evt);
            }
        });
        jPanel1.add(cboFiltroTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 170, -1));

        txtSuma.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtSuma.setToolTipText("");
        txtSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 160, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/kisspng-ingredient-kitchen-utensil-food-condiment-ingredients-and-kitchen-utensils-5a70503c83a3c0.7918750215173100125392.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -130, 200, 620));

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("total");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     
            SolicitarInsumo();
            CargartablaPRoducto();

     
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              
        try {

            String id  = (String) cboEliminar.getSelectedItem();
            Statement consulta = conectar().createStatement();
            String sql = "delete from LISTA_INSUMOS where ID_COMPRAS = '"+id+"'";
            consulta.execute(sql);
            
            JOptionPane.showMessageDialog(null, "INSUMO ELIMINADO");
            CargartablaPRoducto();
            cboEliminar.setSelectedIndex(0);
            llenarCboElimianr();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed
            String pesaje ;
            String precio;
            int id_p;
    
    private void cboProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProductoItemStateChanged
           
        try {       

            String nombreProd = (String) cboProducto.getSelectedItem();
            PreparedStatement ps = null;
            ResultSet r = null;

            String sq = "select id_producto from producto where nombre = '"+nombreProd+"'";

        
            ps = conectar().prepareStatement(sq);    
            r = ps.executeQuery();
        
            if(r.next()){
                 id_p = r.getInt(1);
                

                PreparedStatement psr = null;
                ResultSet rs = null;

                String sql = "select tp.descripcion , p.precio from producto p join tipo_pesaje tp on tp.id_pesaje = p.TIPO_PESAJE_ID_PESAJE where p.id_producto = '"+id_p+"'";


                psr = conectar().prepareStatement(sql);    
                rs = psr.executeQuery();

                if(rs.next()){
                    pesaje = rs.getString(1);
                    precio = rs.getString(2);

                    txtPeueba.setText(precio);
                    txtPesaje.setText(pesaje);
                }
         
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(SolicitarInsumoView.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
    }//GEN-LAST:event_cboProductoItemStateChanged

    private void txtPesajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesajeActionPerformed

    private void txtCantidadInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCantidadInputMethodTextChanged
        

    }//GEN-LAST:event_txtCantidadInputMethodTextChanged

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtCantidadComponentAdded

        
    }//GEN-LAST:event_txtCantidadComponentAdded

    private void txtCantidadCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCantidadCaretPositionChanged

    }//GEN-LAST:event_txtCantidadCaretPositionChanged

    private void txtCantidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseExited

    }//GEN-LAST:event_txtCantidadMouseExited
int cant;
int preci;
    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        int pre = Integer.valueOf(precio); 
        cant = Integer.valueOf(txtCantidad.getText());
        
        preci = pre*cant;
        
        txtTotal.setText(String.valueOf(preci));
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void cboEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEliminarActionPerformed

    private void cboFiltroTablaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFiltroTablaItemStateChanged
        
        
CargartablaPRoducto();
CalcularTotal();
        
    }//GEN-LAST:event_cboFiltroTablaItemStateChanged

    private void txtSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSumaActionPerformed


    
    public void CargartablaPRoducto(){
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int nro = cboFiltroTabla.getSelectedIndex();
            String sql;
            if(nro == 0){
                sql = "select ls.id_compras,pr.nombre , p.nombre , ls.cantidad ,p.precio ,tp.DESCRIPCION,total\n" +
                        "from lista_insumos ls \n" +
                        "join producto p \n" +
                        "on p.id_producto = ls.producto_id_producto\n" +
                        "join tipo_pesaje tp\n" +
                        "on tp.id_pesaje = p.tipo_pesaje_id_pesaje\n" +
                        "join proveedores pr \n" +
                        "on pr.id_provee = ls.proveedor_id_proveedor";
            }else{
                String res = (String) cboFiltroTabla.getSelectedItem();
                sql = "select ls.id_compras,pr.nombre , p.nombre , ls.cantidad , p.precio ,tp.DESCRIPCION, total\n" +
                        "from lista_insumos ls \n" +
                        "join producto p \n" +
                        "on p.id_producto = ls.producto_id_producto\n" +
                        "join tipo_pesaje tp\n" +
                        "on tp.id_pesaje = p.tipo_pesaje_id_pesaje\n" +
                        "join proveedores pr \n" +
                        "on pr.id_provee = ls.proveedor_id_proveedor\n" +
                        "where pr.nombre = '"+res+"'";
            
            }
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            

         
            modelo.addColumn("N° pedido");              
            modelo.addColumn("PROVEEDOR");
            modelo.addColumn("PRODUCTO");
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("PRECIO");
            modelo.addColumn("UNIDAD MEDIDA");
            modelo.addColumn("COSTO");           
   
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
        try {
            conectar().close();
        } catch (SQLException ex) {
            Logger.getLogger(SolicitarInsumoView.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
  
    public void llenarCboProveedor() {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre from proveedores";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboProveedor.addItem("PROVEEDOR");   
                while(rs.next()){
            
            cboProveedor.addItem(rs.getString(1));
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    } 

   
    public void llenarCboElimianr() {
        try {cboEliminar.removeAllItems();
            Connection con = null;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select ID_COMPRAS from LISTA_INSUMOS";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboEliminar.addItem("ELIMINAR");   
                while(rs.next()){
            
            cboEliminar.addItem(rs.getString(1));
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }con.close();
        } catch (Exception e) {
        }
    
    } 
    

    public void llenarCboFiltro() {
        try {cboFiltroTabla.removeAllItems();
            Connection con = null;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select nombre from proveedores";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
            cboFiltroTabla.addItem("TODOS");   
                while(rs.next()){
            
            cboFiltroTabla.addItem(rs.getString(1));
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }con.close();
        } catch (Exception e) {
        }
    
    } 
        
    
    public void SolicitarInsumo(){

        try{
            
            String nombreProd = (String) cboProveedor.getSelectedItem();
            PreparedStatement ps = null;
            ResultSet r = null;

            String sq = "select id_provee from Proveedores where nombre = '"+nombreProd+"'";

            ps = conectar().prepareStatement(sq);    
            r = ps.executeQuery();
        
            if(r.next()){
                int prov = r.getInt(1);

               
            ConInsumos con = new ConInsumos();
  
                    int CANTIDAD = cant;
                    int TOTAL = preci;
                    int PRODUCTO_ID_PRODUCTO = id_p;
                    int PROVEEDOR_ID_PROVEEDOR = prov;
            
                    
            if(con.SolicitarInsumo(CANTIDAD, TOTAL, PRODUCTO_ID_PRODUCTO, PROVEEDOR_ID_PROVEEDOR)>0){
                
                
                JOptionPane.showMessageDialog(null, "agregado");
            }else{
                JOptionPane.showMessageDialog(null, "errror2");
            }   
            
            }
            else{
                JOptionPane.showMessageDialog(null, "errror1");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        
    }
    
    
    
    public void CalcularTotal(){

        try{
            txtSuma.setText("");
            Connection con = conectar();
            PreparedStatement ps ;
            ResultSet r ;

            
            
            int nro = cboFiltroTabla.getSelectedIndex();
            String a = (String) cboFiltroTabla.getSelectedItem();
            String sql;
            
            if(nro == 0){
            
                sql = "select sum(total) from lista_insumos"; 
          
            }else{
       
                sql = "select sum(total) from lista_insumos l join proveedores p\n" +
                "on p.id_provee = l.proveedor_id_proveedor where p.nombre = '"+a+"'";                
            }
                
            ps = con.prepareStatement(sql);
            r = ps.executeQuery();
            if(r.next()){
        int prov = r.getInt(1);
        txtSuma.setText(String.valueOf(prov));
            }
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
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
                new SolicitarInsumoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JComboBox<String> cboFiltroTabla;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPesaje;
    private javax.swing.JTextField txtPeueba;
    private javax.swing.JTextField txtSuma;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
