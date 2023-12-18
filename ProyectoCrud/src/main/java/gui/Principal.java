package gui;

public class Principal extends javax.swing.JFrame {

  public Principal() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    btnBorrar = new javax.swing.JButton();
    btnCargar = new javax.swing.JButton();
    btnActualizar = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();
    btnMostrar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(102, 102, 102));
    jPanel1.setPreferredSize(new java.awt.Dimension(830, 380));

    jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Registro de estudiantes");

    jPanel2.setBackground(new java.awt.Color(102, 102, 102));

    btnBorrar.setBackground(new java.awt.Color(153, 153, 153));
    btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnBorrar.setForeground(new java.awt.Color(255, 0, 0));
    btnBorrar.setText("Borrar datos de estudiante");
    btnBorrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBorrarActionPerformed(evt);
      }
    });

    btnCargar.setBackground(new java.awt.Color(153, 153, 153));
    btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnCargar.setForeground(new java.awt.Color(51, 255, 0));
    btnCargar.setText("Cargar datos de estudiante");
    btnCargar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCargarActionPerformed(evt);
      }
    });

    btnActualizar.setBackground(new java.awt.Color(153, 153, 153));
    btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnActualizar.setForeground(new java.awt.Color(0, 102, 255));
    btnActualizar.setText("Actualizar datos de estudiante");
    btnActualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnActualizarActionPerformed(evt);
      }
    });

    btnSalir.setBackground(new java.awt.Color(153, 153, 153));
    btnSalir.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
    btnSalir.setForeground(new java.awt.Color(51, 51, 51));
    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    btnMostrar.setBackground(new java.awt.Color(153, 153, 153));
    btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnMostrar.setForeground(new java.awt.Color(255, 255, 102));
    btnMostrar.setText("Mostrar lista de estudiantes");
    btnMostrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMostrarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
          .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(75, 75, 75)
        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnCargar)
        .addGap(18, 18, 18)
        .addComponent(btnActualizar)
        .addGap(18, 18, 18)
        .addComponent(btnMostrar)
        .addGap(18, 18, 18)
        .addComponent(btnBorrar)
        .addGap(28, 28, 28)
        .addComponent(btnSalir)
        .addContainerGap())
    );

    jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Cursos\\SigloXXI\\ProyectoFinal\\student.png")); // NOI18N
    jLabel2.setText("jLabel2");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(54, 54, 54)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(48, 48, 48))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(209, 209, 209))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(51, 51, 51))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(31, 31, 31))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
    CargaDatos pantalla = new CargaDatos();
    pantalla.setVisible(true);
    pantalla.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnCargarActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnSalirActionPerformed

  private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    // TODO add your handling code here:
    Tabla tabla = new Tabla();
    tabla.setVisible(true);
    tabla.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnMostrarActionPerformed

  private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    // TODO add your handling code here:
    Tabla tabla = new Tabla();
    tabla.setVisible(true);
    tabla.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnActualizarActionPerformed

  private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    // TODO add your handling code here:
    Tabla tabla = new Tabla();
    tabla.setVisible(true);
    tabla.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnBorrarActionPerformed


  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnActualizar;
  private javax.swing.JButton btnBorrar;
  private javax.swing.JButton btnCargar;
  private javax.swing.JButton btnMostrar;
  private javax.swing.JButton btnSalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  // End of variables declaration//GEN-END:variables
}
