package com.mycompany.sistemadegestiondepuerto;

import VentanasAdmin.CrudUsuarios;
import VentanasAdmin.Visual;

/**
 *
 * @author villa
 */
public class InterfazAdministradorSistema extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAdministradorSistema
     */
    public InterfazAdministradorSistema() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
<<<<<<< HEAD
        CerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        verUsuarios = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
=======
        CerrarVentana = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        VisualizarUsuarios = new javax.swing.JMenuItem();
        crud = new javax.swing.JMenuItem();
>>>>>>> 08712da71d81fba46d6d16a28ed25ee8a7c0f9fd

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Administrador Sistema");

        jMenu1.setText("Inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(CerrarSesion);
=======
        CerrarVentana.setText("Cerrar");
        CerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarVentanaActionPerformed(evt);
            }
        });
        jMenu1.add(CerrarVentana);
>>>>>>> 08712da71d81fba46d6d16a28ed25ee8a7c0f9fd

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");

<<<<<<< HEAD
        verUsuarios.setText("Visualizar Usuarios");
        verUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(verUsuarios);
=======
        VisualizarUsuarios.setText("Visualizar Usuarios");
        VisualizarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(VisualizarUsuarios);
>>>>>>> 08712da71d81fba46d6d16a28ed25ee8a7c0f9fd

        crud.setText("Gestion de Usuarios");
        crud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudActionPerformed(evt);
            }
        });
        jMenu2.add(crud);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(740, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(513, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void verUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUsuariosActionPerformed
        Visual v = new Visual();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_verUsuariosActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
       InterfazLogin login  = new InterfazLogin();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed
=======
    private void VisualizarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarUsuariosActionPerformed
        Visual v = new Visual();
        v.setVisible(true);
    }//GEN-LAST:event_VisualizarUsuariosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        //
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void CerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarVentanaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarVentanaActionPerformed

    private void crudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudActionPerformed
        CrudUsuarios d = new CrudUsuarios();
        d.setVisible(true);
    }//GEN-LAST:event_crudActionPerformed
>>>>>>> 08712da71d81fba46d6d16a28ed25ee8a7c0f9fd

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
            java.util.logging.Logger.getLogger(InterfazAdministradorSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministradorSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministradorSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministradorSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministradorSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JMenuItem CerrarSesion;
=======
    private javax.swing.JMenuItem CerrarVentana;
    private javax.swing.JMenuItem VisualizarUsuarios;
    private javax.swing.JMenuItem crud;
>>>>>>> 08712da71d81fba46d6d16a28ed25ee8a7c0f9fd
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
<<<<<<< HEAD
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem verUsuarios;
=======
>>>>>>> 08712da71d81fba46d6d16a28ed25ee8a7c0f9fd
    // End of variables declaration//GEN-END:variables
}
