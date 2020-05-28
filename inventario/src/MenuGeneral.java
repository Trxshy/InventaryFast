
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class MenuGeneral extends javax.swing.JFrame {

    /**
     * Creates new form MenuGeneral
     */
    public MenuGeneral() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        btngestionproveedor = new javax.swing.JButton();
        btnIngresarStock = new javax.swing.JButton();
        btnGestionproductos = new javax.swing.JButton();
        btnHistorialventas = new javax.swing.JButton();
        btnreporteventas = new javax.swing.JButton();
        btnvencimiento = new javax.swing.JButton();
        btnGestionUsuarios = new javax.swing.JButton();
        btncerrarsesion = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menú General");

        btngestionproveedor.setText("Gestion de proveedores");
        btngestionproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngestionproveedorActionPerformed(evt);
            }
        });

        btnIngresarStock.setText("Ingresar Stock");
        btnIngresarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarStockActionPerformed(evt);
            }
        });

        btnGestionproductos.setText("Gestion de productos");
        btnGestionproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionproductosActionPerformed(evt);
            }
        });

        btnHistorialventas.setText("Historial de ventas");
        btnHistorialventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialventasActionPerformed(evt);
            }
        });

        btnreporteventas.setText("Reporte de ventas");
        btnreporteventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteventasActionPerformed(evt);
            }
        });

        btnvencimiento.setText("Reporte de vencimiento");
        btnvencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvencimientoActionPerformed(evt);
            }
        });

        btnGestionUsuarios.setText("Gestion de usuarios");
        btnGestionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionUsuariosActionPerformed(evt);
            }
        });

        btncerrarsesion.setText("Cerrar sesión");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGestionproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorialventas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnvencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngestionproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnreporteventas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncerrarsesion)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngestionproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorialventas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnreporteventas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncerrarsesion)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngestionproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngestionproveedorActionPerformed
        // TODO add your handling code here:
        GestionProveedor gp = null;
        try {
            gp = new GestionProveedor();
        } catch (SQLException ex) {
            Logger.getLogger(MenuGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
        gp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btngestionproveedorActionPerformed

    private void btnIngresarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarStockActionPerformed

    private void btnGestionproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionproductosActionPerformed
        GestionProductos gp = new GestionProductos();
        gp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestionproductosActionPerformed

    private void btnHistorialventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialventasActionPerformed
        // TODO add your handling code here:
        HistorialVentas hv = null;
        try {
            hv = new HistorialVentas();
        } catch (SQLException ex) {
            Logger.getLogger(MenuGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
        hv.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnHistorialventasActionPerformed

    private void btnreporteventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreporteventasActionPerformed

    private void btnvencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvencimientoActionPerformed

    private void btnGestionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUsuariosActionPerformed
        // TODO add your handling code here:
        GestionUsuarios gu = null;
        try {
            gu = new GestionUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(MenuGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
        gu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestionUsuariosActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Su sesión ha finalizado","",JOptionPane.INFORMATION_MESSAGE);
        InicioSesion is = new InicioSesion();
        is.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionUsuarios;
    private javax.swing.JButton btnGestionproductos;
    private javax.swing.JButton btnHistorialventas;
    private javax.swing.JButton btnIngresarStock;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JButton btngestionproveedor;
    private javax.swing.JButton btnreporteventas;
    private javax.swing.JButton btnvencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
