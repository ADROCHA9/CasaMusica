package ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores;

public class MicrofonoRode extends javax.swing.JInternalFrame 
 {public MicrofonoRode() 
     {super("Microfono Rode NT1");
      initComponents();
      this.setLocation(430, 220);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lblRode = new javax.swing.JLabel();
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

        lblRode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Microfono RODE NT1 (1).jpg"))); // NOI18N
        lblRode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblRode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 210));

        txtDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        txtDescripcion.setText("PESO: 1,90 Libras   \n-------------------------------   \nDIMENCIONES : 19,69x19,69\n                              x11,02''\n------------------------------- \nCONECTOR: XLR, USB\n-------------------------------\nGENERACION: 5ª\n-------------------------------\nCUERPO: ALUMINIO NIQUELADO\n-------------------------------\nREVESTIMIENTO: CERAMICO\n");
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
    private javax.swing.JLabel lblRode;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
