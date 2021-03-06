
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class GestionUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUsuario
     * @throws java.sql.SQLException
     */
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    Metodos met = new Metodos();
    public GestionUsuarios() throws SQLException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        mostrar();
        
    }
        private void mostrar() throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = ConexionBD.getTabla("select idUsu, run,digitoverificador, nomUsu, nombre, apePaterno, apeMaterno, email, nomTiUsu from mydb.usuario join mydb.ti_usu ON (mydb.usuario.Ti_Usu_idTiUsu = mydb.ti_usu.idTiUsu)");
        model.setColumnIdentifiers(new Object[]{"id","run","Digito verificador","nombre usuario","nombre","apellido paterno","apellido materno","email","cargo"});
        try {
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("idUsu"),rs.getString("run"),  rs.getString("digitoverificador") ,rs.getString("nomUsu"),
                rs.getString("nombre"),rs.getString("apePaterno"),rs.getString("apeMaterno"),rs.getString("email"),rs.getString("nomTiUsu")});
            }
            tablaUsuarios.setModel(model);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
        private void limpiarCajas(){
            this.txtRun.setText("");
        }
        
            void mostrardatos(String run){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("run");
    modelo.addColumn("DV");
    modelo.addColumn("nombre de usuario");
    modelo.addColumn("nombre");
    modelo.addColumn("apellido paterno");
    modelo.addColumn("apellido materno");
    modelo.addColumn("correo");
    modelo.addColumn("cargo");

    tablaUsuarios.setModel(modelo);
    String sql="";
    if(run.equals(""))
    {
        
        sql="SELECT idUsu, run,digitoverificador, nomUsu, nombre, apePaterno, apeMaterno, email,(select ti_usu.nomTiUsu from mydb.ti_usu WHERE mydb.usuario.Ti_Usu_idTiUsu = ti_usu.idTiUsu) from mydb.usuario ";
        JOptionPane.showMessageDialog(null, "Debe ingresar un run");
        
    }
    else{
        sql="SELECT idUsu, run,digitoverificador, nomUsu, nombre, apePaterno, apeMaterno, email, (select ti_usu.nomTiUsu from mydb.ti_usu WHERE mydb.usuario.Ti_Usu_idTiUsu = ti_usu.idTiUsu) from mydb.usuario WHERE run='"+run+"'";
    }
 
    String []datos = new String [9];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);   
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modelo.addRow(datos);
            }
            tablaUsuarios.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtRun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Gestión de usuarios");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese el run sin puntos ni digito verificador");

        btnAgregar.setText("Agregar Usuario");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Debe buscar el usuario para poder eliminarlo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtRun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscar))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        AgregarUsuario au = null;
        try {
            au = new AgregarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        au.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        ModificarUsuario mu = null;
        try {
            mu = new ModificarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        mu.setVisible(true);
        this.setVisible(false);
        int cor = tablaUsuarios.getSelectedRow();
        mu.txtid.setText(tablaUsuarios.getValueAt(cor, 0).toString());
        mu.txtrun.setText(tablaUsuarios.getValueAt(cor, 1).toString());
        mu.txtdv.setText(tablaUsuarios.getValueAt(cor, 2).toString());
        mu.txtnomusu.setText(tablaUsuarios.getValueAt(cor, 3).toString());
        mu.txtnombre.setText(tablaUsuarios.getValueAt(cor, 4).toString());
        mu.txtapellidoP.setText(tablaUsuarios.getValueAt(cor, 5).toString());
        mu.txtapellidoM.setText(tablaUsuarios.getValueAt(cor, 6).toString());
        mu.txtcorreo.setText(tablaUsuarios.getValueAt(cor, 7).toString());
        mu.cmb_cargo.setSelectedItem(tablaUsuarios.getValueAt(cor, 8).toString());
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrardatos(txtRun.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        MenuGeneral mg = new MenuGeneral();
        mg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.txtRun.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el run del usuario.");
        }
        else{
        try {
            met.eliminarUsuario(this.txtRun.getText());
            limpiarCajas();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestionUsuarios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtRun;
    // End of variables declaration//GEN-END:variables
}
