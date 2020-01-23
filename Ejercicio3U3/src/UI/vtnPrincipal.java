/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class vtnPrincipal extends javax.swing.JFrame {

    private final String titulo = "Registro de Matrícula";

    public static void VerMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);

    }

    public vtnPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuEstudiante = new javax.swing.JMenu();
        mnunuevo = new javax.swing.JMenuItem();
        mniReporte = new javax.swing.JMenuItem();
        mnMatricula = new javax.swing.JMenu();
        mniNueva = new javax.swing.JMenuItem();
        mniCalificar = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuEstudiante.setMnemonic('e');
        mnuEstudiante.setText("Estudiante");

        mnunuevo.setMnemonic('t');
        mnunuevo.setText("Nuevo");
        mnunuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnunuevoActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mnunuevo);

        mniReporte.setMnemonic('r');
        mniReporte.setText("Reporte de Calificaciones");
        mniReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReporteActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mniReporte);

        menuBar.add(mnuEstudiante);

        mnMatricula.setMnemonic('f');
        mnMatricula.setText("Matricula");

        mniNueva.setMnemonic('o');
        mniNueva.setText("Nueva");
        mniNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevaActionPerformed(evt);
            }
        });
        mnMatricula.add(mniNueva);

        mniCalificar.setMnemonic('s');
        mniCalificar.setText("Calificar");
        mniCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCalificarActionPerformed(evt);
            }
        });
        mnMatricula.add(mniCalificar);

        mniSalir.setMnemonic('x');
        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnMatricula.add(mniSalir);

        menuBar.add(mnMatricula);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevaActionPerformed
        frmRegistrodeMatricula miFrmMatricula = new frmRegistrodeMatricula();
        this.desktopPane.add(miFrmMatricula);
        miFrmMatricula.show();    }//GEN-LAST:event_mniNuevaActionPerformed

    private void mnunuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnunuevoActionPerformed
        frmRegistroEstudiantes miFrmEstudiantes = new frmRegistroEstudiantes();
        this.desktopPane.add(miFrmEstudiantes);
        miFrmEstudiantes.show();    }//GEN-LAST:event_mnunuevoActionPerformed

    private void mniCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCalificarActionPerformed
        frmRegistrodeCalificaciones miFrmCalificar = new frmRegistrodeCalificaciones();
        this.desktopPane.add(miFrmCalificar);
        miFrmCalificar.show();     }//GEN-LAST:event_mniCalificarActionPerformed

    private void mniReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReporteActionPerformed
        frmReporteCalificaciones miFrmCalificaciones = new frmReporteCalificaciones();
        this.desktopPane.add(miFrmCalificaciones);
        miFrmCalificaciones.show();
    }//GEN-LAST:event_mniReporteActionPerformed

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
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnMatricula;
    private javax.swing.JMenuItem mniCalificar;
    private javax.swing.JMenuItem mniNueva;
    private javax.swing.JMenuItem mniReporte;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuEstudiante;
    private javax.swing.JMenuItem mnunuevo;
    // End of variables declaration//GEN-END:variables

}
