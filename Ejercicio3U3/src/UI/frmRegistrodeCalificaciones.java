package UI;

import BLL.GestionMatricula;
import Navas.Util;
import java.io.IOException;
import javax.swing.JOptionPane;

public class frmRegistrodeCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Registro de Calificaciones";
    private GestionMatricula matriculaBLL = new GestionMatricula();
   
    
    
    private boolean Validar(){
    float nota = (float) snnValor.getValue();
    if(nota ==0.f){
    vtnPrincipal.VerMensaje("Calificación no válida", titulo, JOptionPane.WARNING_MESSAGE);
    return false;
    }
    return true;
    }

    private void ConsultarMatricula() throws IOException {
        String numero = txtnumeromatricula.getText();
        matriculaBLL.consultar(numero);
        txtDatosMatricula.setText(matriculaBLL.imprimir());

    }

    private String Calificar() throws IOException {
        float nota = (float) snnValor.getValue();
        String mensaje = matriculaBLL.calificar(nota);
        matriculaBLL.archivar();
        return mensaje;

    }

    public frmRegistrodeCalificaciones() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistrodeCalificaciones = new javax.swing.JLabel();
        lblNumeroMatricula = new javax.swing.JLabel();
        txtnumeromatricula = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        pnlDatosMatricula = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosMatricula = new javax.swing.JTextArea();
        pnlCalificaciones = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        snnValor = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblRegistrodeCalificaciones.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblRegistrodeCalificaciones.setText("Registro de Calificaciones");

        lblNumeroMatricula.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNumeroMatricula.setText("Número de Matrícula:");

        btnbuscar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/iconos/search.png")); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        pnlDatosMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de Matrícula"));

        txtDatosMatricula.setEditable(false);
        txtDatosMatricula.setColumns(20);
        txtDatosMatricula.setRows(5);
        jScrollPane1.setViewportView(txtDatosMatricula);

        javax.swing.GroupLayout pnlDatosMatriculaLayout = new javax.swing.GroupLayout(pnlDatosMatricula);
        pnlDatosMatricula.setLayout(pnlDatosMatriculaLayout);
        pnlDatosMatriculaLayout.setHorizontalGroup(
            pnlDatosMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlDatosMatriculaLayout.setVerticalGroup(
            pnlDatosMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCalificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calificación"));

        lblValor.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblValor.setText("Valor:");

        snnValor.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(0.01f)));

        javax.swing.GroupLayout pnlCalificacionesLayout = new javax.swing.GroupLayout(pnlCalificaciones);
        pnlCalificaciones.setLayout(pnlCalificacionesLayout);
        pnlCalificacionesLayout.setHorizontalGroup(
            pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalificacionesLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pnlCalificacionesLayout.setVerticalGroup(
            pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/iconos/save.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNumeroMatricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumeromatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnbuscar))
                                    .addComponent(pnlDatosMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(lblRegistrodeCalificaciones)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrodeCalificaciones)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumeromatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(pnlDatosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {
            ConsultarMatricula();
        } catch (IOException e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al buscar la matrícula", titulo, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(Validar()){
        try {
            String mensaje = Calificar();
            vtnPrincipal.VerMensaje(mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al calificar la matrícula", titulo, JOptionPane.ERROR_MESSAGE);
        }
        }    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumeroMatricula;
    private javax.swing.JLabel lblRegistrodeCalificaciones;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlCalificaciones;
    private javax.swing.JPanel pnlDatosMatricula;
    private javax.swing.JSpinner snnValor;
    private javax.swing.JTextArea txtDatosMatricula;
    private javax.swing.JTextField txtnumeromatricula;
    // End of variables declaration//GEN-END:variables
}
