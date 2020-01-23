package UI;

import BEU.Estudiante;
import BLL.GestionEstudiante;
import Navas.Util;
import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class frmRegistroEstudiantes extends javax.swing.JInternalFrame {

    private final String titulo = "Registro de Estudiantes";
    private GestionEstudiante estudianteBLL = new GestionEstudiante();

    private void iniciarListado() throws IOException {
        estudianteBLL.leerEstudiantes();
    }

    private String verificarClub(JCheckBox chk) {
        return chk.isSelected() ? chk.getText() : "";
//        if(chk.isSelected())
//            return chk.getText();
//        return "";
    }

    private void CrearEstudiante() {
        Estudiante nuevo = new Estudiante();
        nuevo.setCedula(txtcedula.getText());
        nuevo.setNombre(txtnombres.getText());
        nuevo.setApellido(txtapellidos.getText());
        nuevo.setCarrera(cmbCarrera.getSelectedItem().toString());

        nuevo.addClub(verificarClub(chkAjedrez));
        nuevo.addClub(verificarClub(chkAndinismo));
        nuevo.addClub(verificarClub(chkBasketball));
        nuevo.addClub(verificarClub(chkDanza));
        nuevo.addClub(verificarClub(chkFotografia));
        nuevo.addClub(verificarClub(chkMusica));
        nuevo.addClub(verificarClub(chkProgramacion));
        nuevo.addClub(verificarClub(chkRobotica));

        estudianteBLL.getEstudiantes().add(nuevo);
    }

    private void Archivar() throws IOException {
        estudianteBLL.archivar();
    }

    public frmRegistroEstudiantes() {
        initComponents();
        try {
            iniciarListado();
        } catch (IOException ex) {
            Util.imprimir(ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlDatosPersonales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        pnlDatosAcadémicos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        chkAndinismo = new javax.swing.JCheckBox();
        chkDanza = new javax.swing.JCheckBox();
        chkRobotica = new javax.swing.JCheckBox();
        chkMusica = new javax.swing.JCheckBox();
        chkBasketball = new javax.swing.JCheckBox();
        chkFotografia = new javax.swing.JCheckBox();
        chkAjedrez = new javax.swing.JCheckBox();
        chkProgramacion = new javax.swing.JCheckBox();
        btnGuardarE = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Estudiantes");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Estudiante");

        pnlDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Cédula:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Apellidos:");

        javax.swing.GroupLayout pnlDatosPersonalesLayout = new javax.swing.GroupLayout(pnlDatosPersonales);
        pnlDatosPersonales.setLayout(pnlDatosPersonalesLayout);
        pnlDatosPersonalesLayout.setHorizontalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(txtnombres)
                            .addComponent(txtapellidos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosPersonalesLayout.setVerticalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosAcadémicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Académicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Carrera:");

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Software", "Ingeniería Petroquímica", "Ingeniería Mecatrónica", "Ingeniería Electromecánica", " " }));

        javax.swing.GroupLayout pnlDatosAcadémicosLayout = new javax.swing.GroupLayout(pnlDatosAcadémicos);
        pnlDatosAcadémicos.setLayout(pnlDatosAcadémicosLayout);
        pnlDatosAcadémicosLayout.setHorizontalGroup(
            pnlDatosAcadémicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosAcadémicosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        pnlDatosAcadémicosLayout.setVerticalGroup(
            pnlDatosAcadémicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosAcadémicosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlDatosAcadémicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DatosExtracurriculares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        chkAndinismo.setText("Club de Andinismo");

        chkDanza.setText("Club de Danza");

        chkRobotica.setText("Club de Robótica");

        chkMusica.setText("Club de Música");

        chkBasketball.setText("Club de Basketball");

        chkFotografia.setText("Club de Fotografía");

        chkAjedrez.setText("Club de Ajedrez");

        chkProgramacion.setText("Club de Programación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkDanza)
                    .addComponent(chkAndinismo)
                    .addComponent(chkRobotica)
                    .addComponent(chkMusica))
                .addGap(148, 148, 148)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkProgramacion)
                    .addComponent(chkAjedrez)
                    .addComponent(chkFotografia)
                    .addComponent(chkBasketball))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDanza)
                    .addComponent(chkBasketball))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAndinismo)
                    .addComponent(chkFotografia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRobotica)
                    .addComponent(chkAjedrez))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMusica)
                    .addComponent(chkProgramacion))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        btnGuardarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnGuardarE.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/iconos/save.png")); // NOI18N
        btnGuardarE.setText("Guardar");
        btnGuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDatosAcadémicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnlDatosAcadémicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnGuardarE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEActionPerformed
        try {
            CrearEstudiante();
            Archivar();
            vtnPrincipal.VerMensaje("Estudiante Agregado Correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            vtnPrincipal.VerMensaje("Error al Guardar el Estudiante", titulo, JOptionPane.ERROR_MESSAGE);
            Util.imprimir(e.toString());
        }
    }//GEN-LAST:event_btnGuardarEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarE;
    private javax.swing.JCheckBox chkAjedrez;
    private javax.swing.JCheckBox chkAndinismo;
    private javax.swing.JCheckBox chkBasketball;
    private javax.swing.JCheckBox chkDanza;
    private javax.swing.JCheckBox chkFotografia;
    private javax.swing.JCheckBox chkMusica;
    private javax.swing.JCheckBox chkProgramacion;
    private javax.swing.JCheckBox chkRobotica;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlDatosAcadémicos;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
