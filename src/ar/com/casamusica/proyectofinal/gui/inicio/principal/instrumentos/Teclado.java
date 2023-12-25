package ar.com.casamusica.proyectofinal.gui.inicio.principal.instrumentos;

public class Teclado extends javax.swing.JInternalFrame 
 {public Teclado() 
     {super("Teclado Arranjador Ronald EX20");
      initComponents();
      this.setLocation(470,150);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        srllDescripcion = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        lblTeclado = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txtDetalle.setBackground(new java.awt.Color(51, 51, 51));
        txtDetalle.setColumns(20);
        txtDetalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDetalle.setForeground(new java.awt.Color(255, 255, 255));
        txtDetalle.setRows(5);
        txtDetalle.setText("- 61 teclas (sensitivas).\n-------------------------------------------\n- 404 + 256 (Gm2) sonidos.\n-------------------------------------------\n- 128 voces de polifonía.\n-------------------------------------------\n- 140 canciones – Memoria interna\n-------------------------------------------\n- Grabación: 10 canciones\n-------------------------------------------\n- Puerto USB.\n-------------------------------------------\n- Dimensiones: 95.6 x 36 x 13 cm\n-------------------------------------------\n- Peso: 5kg");
        txtDetalle.setFocusable(false);
        srllDescripcion.setViewportView(txtDetalle);

        getContentPane().add(srllDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        lblTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/tecladoCompl.jpg"))); // NOI18N
        lblTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 340, 120));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTeclado;
    private javax.swing.JScrollPane srllDescripcion;
    private javax.swing.JTextArea txtDetalle;
    // End of variables declaration//GEN-END:variables
}
