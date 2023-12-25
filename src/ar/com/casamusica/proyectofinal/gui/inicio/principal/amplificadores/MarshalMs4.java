package ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores;


public class MarshalMs4 extends javax.swing.JInternalFrame 
 {public MarshalMs4() 
     {super("Marshal MS-4");
      initComponents();
      this.setLocation(380, 60);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lblMarshal = new javax.swing.JLabel();
        txtDescrpcion = new javax.swing.JTextArea();
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

        lblMarshal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Marshal MS-4 (1).jpg"))); // NOI18N
        lblMarshal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblMarshal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 210));

        txtDescrpcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescrpcion.setColumns(20);
        txtDescrpcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescrpcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescrpcion.setRows(5);
        txtDescrpcion.setText("PESO: 1,1 Libras   \n-------------------------------   \nDIMENCIONES : 10x3x5''\n------------------------------- \nBATERIA: REQUIERE \n                1 BATERIA(9V)\n-------------------------------\nCOMPATIBLE: GUITARRA\n-------------------------------\nSALIDA: 1 VATIO\n");
        txtDescrpcion.setFocusable(false);
        getContentPane().add(txtDescrpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 170, 170));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMarshal;
    private javax.swing.JTextArea txtDescrpcion;
    // End of variables declaration//GEN-END:variables
}
