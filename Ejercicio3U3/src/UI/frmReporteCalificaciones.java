
package UI;

import BEU.Curso;
import BEU.Matricula;
import BLL.GestionCurso;
import BLL.GestionMatricula;
import Navas.Util;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReporteCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Reporte de Calificaciones";
    private GestionCurso cursosBLL = new GestionCurso();
    private List<Curso> curso;
    private List<Matricula> calificaciones;
    private final DefaultTableModel dtmCalificaciones = new DefaultTableModel();
    private GestionMatricula matriculaBLL = new GestionMatricula();

    private void leerCursos() {
        try {
            Curso ficticio = new Curso("--Seleccione--", "", 0.0f);
            cmbCurso.addItem(ficticio);
            curso = cursosBLL.getMicurso();
            //Expresion lambda
            curso.forEach((c) -> {
                cmbCurso.addItem(c);
            });

        } catch (Exception e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al leer los cursos", titulo, JOptionPane.ERROR_MESSAGE);

        }

    }

    private void configurarModeloTabla() {
        String[] columnas = {"Nombre", "Promedio", "Estado"};
        dtmCalificaciones.setColumnIdentifiers(columnas);
        tblcalificaciones.setModel(dtmCalificaciones);

    }

    private void MostrarCalificaciones() {
        //ELimina las filas de la tabla
        int lim = dtmCalificaciones.getRowCount() - 1;
        for (int i = lim; i >= 0; i--) {
            dtmCalificaciones.removeRow(i);
        }

        for (Matricula m : calificaciones) {
            Vector fila = new Vector();
            fila.addElement(m.getEstudiante());
            fila.addElement(m.getPromedio());
            fila.addElement(m.getEstado());

            dtmCalificaciones.addRow(fila);

        }
        tblcalificaciones.setModel(dtmCalificaciones);

    }

    private void BuscarMatriculas() throws IOException {
        Curso seleccionado = (Curso) cmbCurso.getSelectedItem();
        calificaciones = matriculaBLL.reportar(seleccionado.getTitulo());
        MostrarCalificaciones();

    }

    public frmReporteCalificaciones() {
        initComponents();
        leerCursos();
        configurarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNumeroMatricula = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcalificaciones = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Reporte de Calificaciones");
        jLabel1.setToolTipText("");

        lblNumeroMatricula.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNumeroMatricula.setText("Curso:");

        btnbuscar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/iconos/search.png")); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblcalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblcalificaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblNumeroMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {
            BuscarMatriculas();
        } catch (Exception e) {
            Util.imprimir("Error" + e.toString());
            vtnPrincipal.VerMensaje("Error al buscar la matrícula", titulo, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumeroMatricula;
    private javax.swing.JTable tblcalificaciones;
    // End of variables declaration//GEN-END:variables
}
