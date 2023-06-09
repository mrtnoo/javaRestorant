/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class FinanzasView extends javax.swing.JFrame {

    /**
     * Creates new form FinanzasView
     */
    public FinanzasView() {
        try {
            initComponents();
            Cargartabla();
            CalcularTotal();
            CargartablaMes();
        } catch (SQLException ex) {
            Logger.getLogger(FinanzasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtTdiario = new javax.swing.JTextField();
        txtRtotal = new javax.swing.JTextField();
        txtdesiva = new javax.swing.JTextField();
        txtdesPropina = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 91, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 330, 350));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 310, 350));

        txtTdiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTdiarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtTdiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 110, -1));

        txtRtotal.setText("jTextField1");
        jPanel1.add(txtRtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 110, -1));

        txtdesiva.setText("jTextField2");
        jPanel1.add(txtdesiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 110, -1));

        txtdesPropina.setText("jTextField3");
        jPanel1.add(txtdesPropina, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 110, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("10% propina");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 90, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Liquido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 80, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Bruto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 60, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("19% iva");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 60, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 120, -1));

        jToggleButton1.setText("Buscar");
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 190, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA DESDE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 90, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  VENTAS MENSUALES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("VENTAS DIARIAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 150, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 160, -1));

        jLabel1.setText("total:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 20));

        jLabel3.setText("total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 30, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 120, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA HASTA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTdiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTdiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTdiarioActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    public Connection conectar() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "martin";
        String pass = "123";
        
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
       }
    
    
    
    
public void Cargartabla() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
 
            
            String sql = "select trunc(fecha), TO_CHAR(sum(total_costo), '$999G999G999') from orden group by trunc(fecha)";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("Fecha");           
            modelo.addColumn("Total diario");
         
            
       

            
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

public void CargartablaMes() throws SQLException {
       
        
        try {
            
            Connection con = conectar();
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
 
            
            String sql = "select TRUNC(fecha,'mm'),  TO_CHAR(sum(total_costo), '$999G999G999')  from orden group by TRUNC(fecha,'mm')";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("Fecha");           
            modelo.addColumn("Total");
         
            
       

            
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

    
public void CalcularTotal(){
    
            PreparedStatement ps = null;
            ResultSet rs = null;
            

                   
            try {
                String sql = "select sum(total_costo) from orden";
                ResultSet myRS;
                ps = conectar().prepareStatement(sql);
                myRS = ps.executeQuery();
                if(myRS.next()){
                
                    int bruto = myRS.getInt(1);
                    String tbruto = String.valueOf(bruto);
                    txtTdiario.setText(tbruto);


                    int dtotal = (int) (bruto*0.29);
                    int diva = (int) (bruto*0.19);
                    int dpropina = (int) (bruto*0.10);
                    
                    String destotal = String.valueOf(dtotal);
                    String desiva = String.valueOf(diva);
                    String despropina = String.valueOf(dpropina);
                    
                    txtdesiva.setText(desiva);
                    txtdesPropina.setText(despropina);
                    
                    
                    
                    
                    
                    
                    int Rtotal = (int) (bruto*0.71);
                    int Riva = (int) (bruto*0.81);
                    int Rpropina = (int) (bruto*0.90);
                    
                    String rtotal = String.valueOf(Rtotal);
                    String riva = String.valueOf(Riva);
                    String rpropina = String.valueOf(Rpropina);
                    
                    txtRtotal.setText(rtotal);
                 
                    
                    
                    
                    
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedido.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FinanzasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinanzasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinanzasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinanzasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinanzasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtRtotal;
    private javax.swing.JTextField txtTdiario;
    private javax.swing.JTextField txtdesPropina;
    private javax.swing.JTextField txtdesiva;
    // End of variables declaration//GEN-END:variables
}
