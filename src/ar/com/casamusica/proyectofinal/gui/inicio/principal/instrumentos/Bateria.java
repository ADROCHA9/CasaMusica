package ar.com.casamusica.proyectofinal.gui.inicio.principal.instrumentos;

public class Bateria extends javax.swing.JInternalFrame 
 {public Bateria() 
     {super("Bateria Pearl Export EXX75");
      initComponents();
      this.setLocation(430, 220);}
 
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        srllDescripcion = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        lblBateria = new javax.swing.JLabel();
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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtDetalle.setBackground(new java.awt.Color(51, 51, 51));
        txtDetalle.setColumns(20);
        txtDetalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDetalle.setForeground(new java.awt.Color(255, 255, 255));
        txtDetalle.setRows(5);
        txtDetalle.setText("- B22\"x18 | TT10\"x7 | TT12\"x8 |\n TF16\"x16 | R14\"x5\n- Poplar-Mahogany\n- Jet Black\n- Fierros y Platillos\n- Cantidad de piezas: 5");
        txtDetalle.setFocusable(false);
        srllDescripcion.setViewportView(txtDetalle);

        getContentPane().add(srllDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblBateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/bateriaCompl.jpg"))); // NOI18N
        lblBateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 340, 120));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblBateria;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JScrollPane srllDescripcion;
    private javax.swing.JTextArea txtDetalle;
    // End of variables declaration//GEN-END:variables
}
