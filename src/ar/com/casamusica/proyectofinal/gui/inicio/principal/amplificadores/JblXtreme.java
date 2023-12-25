package ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores;


public class JblXtreme extends javax.swing.JInternalFrame 
 {public JblXtreme() 
     {super("JBL Xtreme 2");
      initComponents();
      this.setLocation(470,150);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lblJbl = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblJbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Parlante Portatil Jbl Xtreme 2 (1).jpg"))); // NOI18N
        lblJbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblJbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 210));

        txtDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        txtDescripcion.setText("CONCTIVIDAD: BUETOOTH\n-------------------------------   \nALIMENTACION: BATERIA\n                               CARGADA\n------------------------------- \nTIEMPO DE CARGA: 24HRS\n-------------------------------\nGENERACION: 5ª\n-------------------------------\nCOLOR: VERDE MILITAR\n-------------------------------\nRESISTENCIA AL AGUA: SI\n");
        txtDescripcion.setFocusable(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 200, 210));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblJbl;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
