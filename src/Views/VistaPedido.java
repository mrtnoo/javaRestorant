/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.ConMesa;
import Controller.ConOrden;
import Controller.ConPedido;
import Controller.ConPersona;
import Controller.ConReceta;
import Model.Empleado;
import Model.Mesa;
import Model.Persona;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class VistaPedido extends javax.swing.JFrame {

        public Connection con;
        public Connection conectar() throws SQLException {
        try {
            String url = "jdbc:oracle:thin:@//localhost:1521/XE";
            String user = "martin";
            String pass = "123";
            con = DriverManager.getConnection(url, user, pass);


                
            } catch (Exception e) {
            }

        return con;

       }
        

    /**
     * Creates new form ClienteView
     */
    public VistaPedido() {

                
                
            try {
      
                initComponents();
                llenarCboProducto();
                llenarCboPlato();
                CargarTablasOrdenes();
                llenarCboMesa();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
                txtArea.setEditable(false);
                txtTotal_costo.setEditable(false);
                txtTotalOrneed.setEditable(false);
                
        
        this.setLocationRelativeTo(null);
    
                
                
               
           
   

        
        
    }

 
   

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtClienteRut = new javax.swing.JTextField();
        txtTotal_costo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboPlato = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtExtras = new javax.swing.JTextArea();
        txtTotalOrneed = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        cboProducto = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrden = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cboMesa = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboGarzon = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(53, 91, 133));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar plato");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 28, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 110, 52));
        jButton1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton1.setText("Agregar plato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 180, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 90, -1));

        txtClienteRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRutActionPerformed(evt);
            }
        });
        jPanel1.add(txtClienteRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 190, -1));

        txtTotal_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal_costoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 120, -1));

        jButton3.setBackground(new java.awt.Color(59, 110, 52));
        jButton3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton3.setText("Registrar orden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 220, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comentarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 40, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rut Cliente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 100, 20));

        jPanel1.add(cboPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 240, 30));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, 100));

        txtExtras.setColumns(20);
        txtExtras.setRows(5);
        jScrollPane4.setViewportView(txtExtras);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 250, 50));

        txtTotalOrneed.setBorder(null);
        jPanel1.add(txtTotalOrneed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 470, 110, 20));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, 50, 40));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 340, 330));

        jToggleButton1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jToggleButton1.setText("imprimir");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 110, 30));

        jPanel1.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 140, -1));

        jButton4.setText("añadir ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 80, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrediente extra");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 140, 20));

        cboEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nro pedido" }));
        jPanel1.add(cboEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 100, -1));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Boleta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("PLATOS DISPONIBLES");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, -1, -1));

        tablaOrden.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaOrden);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 730, 180));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 140));

        cboMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMesaActionPerformed(evt);
            }
        });
        jPanel1.add(cboMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mesas Disponibles");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, -1));

        cboGarzon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "Juan Herrera", "Martin Huerta", "Marco Ferrada" }));
        jPanel1.add(cboGarzon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 190, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Garzon");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/kisspng-ingredient-kitchen-utensil-food-condiment-ingredients-and-kitchen-utensils-5a70503c83a3c0.7918750215173100125392.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setInheritsPopupMenu(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 480, 500));
        jPanel1.add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, -1));

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


            AgregarPlato();
            CalcularTotal();
            try {
                CargarTablasOrdenes();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
           
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConReceta con = new ConReceta();
            
            
        try {
            
       
            int id  = Integer.parseInt(cboEliminar.getSelectedItem().toString());
            Statement consulta = conectar().createStatement();
            String sql = "delete from orden_platillos where id_pedido = '"+id+"'";
            consulta.execute(sql);
            
            JOptionPane.showMessageDialog(null, "Plato Eliminado");
            txtArea.append("plato: "+id+ " cancelado");
  
          
                
                Cargartabla(nroOrden);
                cboEliminar.setSelectedIndex(0);
                llenarCboEliminar();
                CalcularTotal();
       
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        AgregarOrden();
       
            try {
                CargarTablasOrdenes();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtClienteRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRutActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        txtArea.setText("");
        txtClienteRut.setText("");
        txtDescripcion.setText("");
        txtTotalOrneed.setText("");
        txtTotal_costo.setText("");
        cboPlato.setSelectedIndex(0);
        
            try {
                Connection con = conectar();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
        modelo.setRowCount(0);
        
        
        Properties defaultProps = new Properties();

        PrintJob print=Toolkit.getDefaultToolkit().getPrintJob(this,"Imprimir",defaultProps);       
        Graphics g=print.getGraphics();

        if(g!=null)
        {
                txtArea.printAll(g); // AreaPrograma es JTextArea
        }
        g.dispose();
        print.end();
        

        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String a = (String) cboProducto.getSelectedItem();
        txtExtras.append(a+" ");
        cboProducto.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTotal_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal_costoActionPerformed

    private void cboMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMesaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            String id  = txtOrden.getText();
            Statement consulta = conectar().createStatement();
            String sql = "delete from orden where id_orden = '"+id+"'";
            consulta.execute(sql);
            
            JOptionPane.showMessageDialog(null, "Orden Eliminada");
            CargarTablasOrdenes();

        } catch (Exception e) {
        }
                
    }//GEN-LAST:event_jButton5ActionPerformed
    
    public int sumarExt;
    public int extra ;
    public int nroOrden;
    public String plato;
    public int ext = 0;
    public String agregarExtra;
    public int total = 0;
    public int totaltotal;
    public int totalOrden;
    
    
    
    
    public void AgregarPlato(){
        try {
            

        int id_tipo = 0;
        
        ConOrden ord = new ConOrden();
        ConPedido con = new ConPedido();

                String cbtipo = (String) cboPlato.getSelectedItem();         
                
                plato = (String) cboPlato.getSelectedItem();
        
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select id_plato from plato where nombre = '"+cbtipo+"'";
               
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                id_tipo = rs.getInt(1);
                }
       
                

                String AGREGAR_EXTRA = txtExtras.getText();
                agregarExtra = AGREGAR_EXTRA;
                
                int Cantidadd = 0;
                if(AGREGAR_EXTRA.length()>2){
                for (int i = 0; i < AGREGAR_EXTRA.length(); i++) {
            // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
                if (AGREGAR_EXTRA.charAt(i) == ' ') Cantidadd++;
                    }
                
                    ext = (1000*Cantidadd);
                }
                else{
                    ext = 0;
                }
                
                int ORDEN_ID_ORDEN = nroOrden;
                int PLATO_ID_PLATO = (id_tipo);
        
    

        
        try{

            if(con.InsertarPedido( AGREGAR_EXTRA, ORDEN_ID_ORDEN, PLATO_ID_PLATO)>0){
              ord.Platos(PLATO_ID_PLATO);

                JOptionPane.showMessageDialog(null, "Plato Registrado");
                Cargartabla(nroOrden);
                
                txtExtras.setText("");
                
                
                
                txtArea.append("\n"+plato+" ");
                VerPrecio();
                llenarCboEliminar();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }        

        } catch (Exception e) {
        }        
    }
    
    
    
    
    
    public void AgregarOrden(){

        
        
        ConOrden con = new ConOrden();
        
        String DESCRIPCION = txtDescripcion.getText();
        int TOTAL_COSTO = 0;
        int MESA_ID_MESA = Integer.parseInt(cboMesa.getSelectedItem().toString());
        int EMPLEADO_ID_EMPLEADO = (int) cboGarzon.getSelectedIndex();
        int ESTADO_PEDIDO_ID_EST = 1;
        String PERSONA_RUT = txtClienteRut.getText();
   
        
        int mesa = MESA_ID_MESA;
        try{

            if(con.Ingresar(DESCRIPCION, TOTAL_COSTO, ESTADO_PEDIDO_ID_EST, MESA_ID_MESA, EMPLEADO_ID_EMPLEADO, PERSONA_RUT)>0){
                {
               
                    
                try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql = "select max(id_orden) from orden";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    nroOrden = myRS.getInt(1);
                    
                    String g = String.valueOf(nroOrden);
                    Date date = new Date();
                    txtArea.setText("\n"+date+" \n\nN° Pedido: "+g+"   N° Mesa: "+mesa+" "+"   rut cliente: "+PERSONA_RUT+"\ncomentario: "+DESCRIPCION+"\n");
                    
 
                    
                JOptionPane.showMessageDialog(null, "nro pedido"+nroOrden+"");
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
                            
                  

                
                  
                   
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        
    }
        
    

    
       
        
  
    public void Cargartabla(int orden) throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID = nroOrden;
            
            String sql = "select id_pedido ,nombre, precio, agregar_extra\n" +
                            "from orden_platillos ord\n" +
                            "join plato  pla     on  pla.id_plato = ord.plato_id_plato\n" +
                            "join orden o        on o.id_orden = ord.orden_id_orden\n" +
                            "join promocion pro  on pro.id_promo = pla.PROMOCION_ID_PROMO where orden_id_orden = '"+ID+"'";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            String a = String.valueOf(ext);
            
            modelo.addColumn("id");           
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Extra");
            
            
          
          
            
            
       

            
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
        
    
    
        }
    
    
    
    
    public void CargarTablasOrdenes() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            tablaOrden.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID = nroOrden;
            
            String sql = "select o.id_orden ,o.mesa_id_mesa ,p.nombre, p.apellido , o.persona_rut, o.total_costo ,\n" +
            "es.descripcion from orden o  join empleado e on e.id_empleado = o.empleado_id_empleado\n" +
            "join persona p on p.rut = e.persona_rut join estado_pedido es on es.id_est = \n" +
            "o.estado_pedido_id_est order by o.id_orden desc";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            String a = String.valueOf(ext);
            
         
            modelo.addColumn("N° ORDEN");
            modelo.addColumn("N° MESA");
            modelo.addColumn("GARZON");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("RUT CLIENTE");
            modelo.addColumn("TOTAL");
            modelo.addColumn("ESTADO");
          
            
            
       

            
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
        
    
    
        }
    
    
    
    public void AgregarTotal(int total){ 
        
        PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = (nroOrden);
            totalOrden = total;
            String sa = String.valueOf(totalOrden);
            try {
                
                String sql = "update Orden set total_costo='"+total+"'\n" +
                "  where id_orden= '"+ID+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                
                
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    
    public void CalcularTotal(){
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = nroOrden;
            
            

                   
            try {
                String sql = "select  sum(p.precio) From plato p join orden_platillos o on p.id_plato = o.plato_id_plato where orden_id_orden = '"+ID+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                 
                    total = myRS.getInt(1);
                  
                    int j = total;
                    totaltotal = j + sumarExt +ext;
                    
                    
                    
                    String numCadena= String.valueOf(totaltotal);
                    
                    txtTotal_costo.setText(numCadena);
                   
                String sq = "update Orden set total_costo='"+totaltotal+"'\n" +
                "  where id_orden= '"+ID+"'";
                
                ps = conectar().prepareStatement(sq);
                myRS = ps.executeQuery();
                    
              
                txtTotalOrneed.setText(numCadena);
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }
    

    public void VerPrecio(){
        
        
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            int ID   = nroOrden;
                   
            try {
                String sql = "select  precio From plato p join orden_platillos o on p.id_plato = o.plato_id_plato where nombre = '"+plato+"'";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                 
                    int as = myRS.getInt(1);
                    
                    String exs = "";
                    if(ext>2){
                        exs = "Extra";
                    txtArea.append(""+as+"  "+exs+" "+agregarExtra+" "+ext);
                    }else{
                    txtArea.append(""+as+"  "+exs);}
                    
                    
                    
                  
              
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            


    }
    

    public void CalcularTotalDiario(){

            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql = "select sum(TOTAL_COSTO) from orden";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    int total = myRS.getInt(1);
                    
                    String numCadena= String.valueOf(total);
                    
                    
                            
                  
                   
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            


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
            cboPlato.addItem("seleccione");            
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
            cboProducto.addItem("seleccione");   
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
    
    
    public void llenarCboEliminar() {
        try {
            Connection con;
            try {
                cboEliminar.removeAllItems();

                
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select id_pedido from orden_platillos where orden_id_orden = "+nroOrden+"";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
                cboEliminar.addItem("Nro pedido");
                while(rs.next()){
            
            cboEliminar.addItem(rs.getString(1));
                }
             } catch (SQLException ex) {
                Logger.getLogger(MesaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                 
    }
        } catch (Exception e) {
        }
    
    }    
    

    public void llenarCboMesa() {
        try {
            Connection con;
            try {
                con = conectar();
          
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "select ID_MESA from MESA where activo = 'Disponible' ";
                ps = conectar().prepareStatement(sql);
                rs = ps.executeQuery();
                cboMesa.addItem("seleccione");   
                while(rs.next()){
            
                cboMesa.addItem(rs.getString(1));
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
                new VistaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JComboBox<String> cboGarzon;
    private javax.swing.JComboBox<String> cboMesa;
    private javax.swing.JComboBox<String> cboPlato;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tablaOrden;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtClienteRut;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtExtras;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JTextField txtTotalOrneed;
    private javax.swing.JTextField txtTotal_costo;
    // End of variables declaration//GEN-END:variables
}
