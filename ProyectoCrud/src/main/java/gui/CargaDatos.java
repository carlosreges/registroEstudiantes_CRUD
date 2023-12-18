package gui;

public class CargaDatos extends javax.swing.JFrame {

  public CargaDatos() {
    initComponents();
  }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    txtDNI = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    txtEmail = new javax.swing.JTextField();
    txtCarrera = new javax.swing.JTextField();
    cmbAnio = new javax.swing.JComboBox<>();
    btnGuardar = new javax.swing.JButton();
    btnLimpiar = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    btnAtras = new javax.swing.JButton();

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
    jLabel2.setText("Registro de estudiantes");

    jLabel3.setText("jLabel2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(102, 102, 102));
    jPanel1.setPreferredSize(new java.awt.Dimension(830, 380));

    jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Registro de estudiantes");

    jPanel2.setBackground(new java.awt.Color(102, 102, 102));
    jPanel2.setMinimumSize(new java.awt.Dimension(1, 1));

    jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Nombre del estudiante:");

    jLabel12.setBackground(new java.awt.Color(102, 102, 102));
    jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("DNI:");

    jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Correo electrónico:");

    jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Año de la carrera:");

    jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Nombre de la carrera:");

    txtDNI.setText("Sin puntos ni espacios");
    txtDNI.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtDNIActionPerformed(evt);
      }
    });

    txtNombre.setText("Nombre y apellido");

    txtEmail.setText("login@page.com");
    txtEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEmailActionPerformed(evt);
      }
    });

    txtCarrera.setText("Sin errores");
    txtCarrera.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtCarreraActionPerformed(evt);
      }
    });

    cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º año", "2º año", "3º año", "4º año", "5º año" }));

    btnGuardar.setBackground(new java.awt.Color(0, 153, 0));
    btnGuardar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
    btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
    btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\Cursos\\SigloXXI\\ProyectoFinal\\IconGuardar.png")); // NOI18N
    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGuardarActionPerformed(evt);
      }
    });

    btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
    btnLimpiar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
    btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
    btnLimpiar.setIcon(new javax.swing.ImageIcon("D:\\Cursos\\SigloXXI\\ProyectoFinal\\IconLimpiar.png")); // NOI18N
    btnLimpiar.setText(" Limpiar");
    btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimpiarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel6)
              .addComponent(jLabel10)
              .addComponent(jLabel9)
              .addComponent(jLabel12)
              .addComponent(jLabel7)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel11)
                  .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(143, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(btnLimpiar)
            .addGap(27, 27, 27)
            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
          .addComponent(txtNombre)
          .addComponent(txtDNI)
          .addComponent(txtEmail)
          .addComponent(txtCarrera)))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel11)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(23, 23, 23)
        .addComponent(jLabel10))
    );

    jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Cursos\\SigloXXI\\ProyectoFinal\\student.png")); // NOI18N
    jLabel4.setText("jLabel2");

    btnAtras.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    btnAtras.setForeground(new java.awt.Color(0, 0, 0));
    btnAtras.setText("Atrás");
    btnAtras.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAtrasActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(32, 32, 32)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(40, 40, 40))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(212, 212, 212)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnAtras)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(btnAtras))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(57, 57, 57)
            .addComponent(jLabel4))
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtEmailActionPerformed

  private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtDNIActionPerformed

  private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtCarreraActionPerformed

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnGuardarActionPerformed

  private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    txtNombre.setText("");
    txtDNI.setText("");
    txtEmail.setText("");
    txtCarrera.setText("");
    cmbAnio.setSelectedIndex(0);
  }//GEN-LAST:event_btnLimpiarActionPerformed

  private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
    // TODO add your handling code here:
    Principal princ = new Principal();
    princ.setVisible(true);
    princ.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnAtrasActionPerformed

  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAtras;
  private javax.swing.JButton btnGuardar;
  private javax.swing.JButton btnLimpiar;
  private javax.swing.JComboBox<String> cmbAnio;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField txtCarrera;
  private javax.swing.JTextField txtDNI;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtNombre;
  // End of variables declaration//GEN-END:variables
}
