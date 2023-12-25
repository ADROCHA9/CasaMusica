package ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores;


public class MicrofonoShure extends javax.swing.JInternalFrame 
 {public MicrofonoShure() 
     {super("Microfono Shure Cardioide PGA58");
      initComponents();
      this.setLocation(180, 220);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lblShure = new javax.swing.JLabel();
        srllDescripcion = new javax.swing.JScrollPane();
        lstDetalle = new javax.swing.JList<>();
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

        lblShure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Microfono Shure Cardioide PGA58(1).jpg"))); // NOI18N
        lblShure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblShure, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 210));

        lstDetalle.setBackground(new java.awt.Color(51, 51, 51));
        lstDetalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lstDetalle.setForeground(new java.awt.Color(255, 255, 255));
        lstDetalle.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "PESO: 1,68 Libras   ", "-------------------------------   ", "DIMENCIONES : 3,5 x10 x 5''", "------------------------------- ", "COLOR :  NEGRO", "-------------------------------", "CONECTOR: XLR", "-------------------------------", "COMPATIBLE: AMPLIFICADOR,", "                          ALTAVOZ", "---------------------------------", "ALIMENTACION: ELECTRICO", "                               CON CABLE", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstDetalle.setFocusable(false);
        srllDescripcion.setViewportView(lstDetalle);

        getContentPane().add(srllDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 200, 210));

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
    private javax.swing.JLabel lblShure;
    private javax.swing.JList<String> lstDetalle;
    private javax.swing.JScrollPane srllDescripcion;
    // End of variables declaration//GEN-END:variables
}
