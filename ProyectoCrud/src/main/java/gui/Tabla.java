package gui;

public class Tabla extends javax.swing.JFrame {


  public Tabla() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaLectura = new javax.swing.JTable();
    btnAtras = new javax.swing.JButton();
    btnBorrado = new javax.swing.JButton();
    btnActualiza = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(102, 102, 102));

    jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Registro de estudiantes");

    tablaLectura.setBackground(new java.awt.Color(102, 102, 102));
    tablaLectura.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "ID", "Nombre", "DNI", "Carrera", "Año"
      }
    ));
    jScrollPane1.setViewportView(tablaLectura);

    btnAtras.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    btnAtras.setForeground(new java.awt.Color(0, 0, 0));
    btnAtras.setText("Atrás");
    btnAtras.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAtrasActionPerformed(evt);
      }
    });

    btnBorrado.setBackground(new java.awt.Color(153, 153, 153));
    btnBorrado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    btnBorrado.setForeground(new java.awt.Color(255, 51, 51));
    btnBorrado.setText("Borrar datos de estudiante");

    btnActualiza.setBackground(new java.awt.Color(153, 153, 153));
    btnActualiza.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    btnActualiza.setForeground(new java.awt.Color(0, 255, 0));
    btnActualiza.setText("Actualizar datos de estudiante");
    btnActualiza.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnActualizaActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(227, 227, 227)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAtras))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1)))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(98, 98, 98)
        .addComponent(btnActualiza)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
        .addComponent(btnBorrado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(66, 66, 66))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(btnAtras)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnActualiza, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
          .addComponent(btnBorrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(12, 12, 12))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
    // TODO add your handling code here:
    Principal princ = new Principal();
    princ.setVisible(true);
    princ.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnAtrasActionPerformed

  private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnActualizaActionPerformed

  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnActualiza;
  private javax.swing.JButton btnAtras;
  private javax.swing.JButton btnBorrado;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tablaLectura;
  // End of variables declaration//GEN-END:variables
}
