/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BEU.Curso;
import BEU.Estudiante;
import BLL.GestionCurso;
import BLL.GestionEstudiante;
import BLL.GestionMatricula;
import Navas.Util;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class frmRegistrodeMatricula extends javax.swing.JInternalFrame {

    private final String titulo = "Registro de Matrícula";
    //Servicio - Business Logic Layer
    private GestionCurso cursosBLL = new GestionCurso();
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;
    private GestionEstudiante estudianteBLL = new GestionEstudiante();
    private GestionMatricula matriculaBLL = new GestionMatricula();

    private void CrearMatricula() throws IOException{
        
      Curso cr = (Curso) cmbCurso.getSelectedItem();
      Estudiante est = (Estudiante)cmbEstudiante.getSelectedItem();
      matriculaBLL.crear();
      matriculaBLL.Configurar(cr, est);
      matriculaBLL.archivar();
        
    }
    
    
    private boolean Validar(){
    
     Curso cr = (Curso) cmbCurso.getSelectedItem();
     if(cr.getTitulo().equals("--Seleccione--")){
     vtnPrincipal.VerMensaje("Curso no Válido", titulo, JOptionPane.WARNING_MESSAGE);
     
     return false;
     
    }
    Estudiante est = (Estudiante)cmbEstudiante.getSelectedItem();
    if(est.getNombre().equals("--Seleccione--")){
    vtnPrincipal.VerMensaje("Estudiante no Válido", titulo, JOptionPane.WARNING_MESSAGE);
    
    return false;
    }
        return true;
    }
    
        private void leerEstudiantes() {
        try {
            Estudiante ficticio = new Estudiante();
            ficticio.setNombre("--Seleccione--");
            ficticio.setApellido("");
            cmbEstudiante.addItem(ficticio);
            estudiantes = estudianteBLL.leerEstudiantes();
            //Expresion lambda
            estudiantes.forEach((est) -> {
                cmbEstudiante.addItem(est);
            });

        } catch (Exception e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al leer los estudiantes", titulo, JOptionPane.ERROR_MESSAGE);

        }

    }
    
    private void leerCursos() {
        try {
            Curso ficticio = new Curso("--Seleccione--","", 0.0f);
            cmbCurso.addItem(ficticio);
            cursos = cursosBLL.getMicurso();
            //Expresion lambda
            cursos.forEach((c) -> {
                cmbCurso.addItem(c);
            });

        } catch (Exception e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al leer los cursos", titulo, JOptionPane.ERROR_MESSAGE);

        }

    }

    public frmRegistrodeMatricula() {
        initComponents();
        leerCursos();
        leerEstudiantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistroMatricula = new javax.swing.JLabel();
        pnlRegistro = new javax.swing.JPanel();
        lblEstudiante = new javax.swing.JLabel();
        cmbEstudiante = new javax.swing.JComboBox<>();
        lblCurso = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblRegistroMatricula.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblRegistroMatricula.setText("Registro de Matrícula");

        pnlRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro"));

        lblEstudiante.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        lblCurso.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCurso.setText("Curso:");

        btnGuardar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/iconos/save.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistroLayout.createSequentialGroup()
                                .addComponent(lblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRegistroLayout.createSequentialGroup()
                                .addComponent(lblCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnGuardar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnGuardar)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      if(Validar()){
        try {
            CrearMatricula();
            vtnPrincipal.VerMensaje("Matrícula creada correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al crear la matrícula", titulo, JOptionPane.ERROR_MESSAGE);

        }
      }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JComboBox<Estudiante> cmbEstudiante;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblRegistroMatricula;
    private javax.swing.JPanel pnlRegistro;
    // End of variables declaration//GEN-END:variables
}
