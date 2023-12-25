package ar.com.casamusica.proyectofinal.gui.inicio.principal;


public class VentanaSobreNosotros extends javax.swing.JInternalFrame 
 {public VentanaSobreNosotros() 
     {super("Sobre Nosotros...");
      initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaSobreNosotros.DO_NOTHING_ON_CLOSE);
      this.setLocation(180, 140);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSobreNosotros = new javax.swing.JPanel();
        lblMusicEmpire = new javax.swing.JLabel();
        jbtnAtras = new javax.swing.JButton();
        jtxtDetalle = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        pnlSobreNosotros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMusicEmpire.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMusicEmpire.setForeground(new java.awt.Color(255, 255, 255));
        lblMusicEmpire.setText("MusicEmpire");
        pnlSobreNosotros.add(lblMusicEmpire, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jbtnAtras.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAtras.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAtras.setText("ATRAS");
        jbtnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });
        pnlSobreNosotros.add(jbtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jtxtDetalle.setBackground(new java.awt.Color(51, 51, 51));
        jtxtDetalle.setColumns(20);
        jtxtDetalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtxtDetalle.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDetalle.setRows(5);
        jtxtDetalle.setText("Somos una tienda de instrumentos musicales fundada en 2023,\natendida por  amantes de la música comprometidos con nuestros\nclientes.\n\nSomos una empresa que proporciona instrumentos y\namplificadores musicales para satisfacer las necesidades de\nnuestros clientes, ofreciendo calidad, las mejores marcas y el\nmejor servicio, enriqueciendo la cultura musical de la región.");
        jtxtDetalle.setFocusable(false);
        pnlSobreNosotros.add(jtxtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 170));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlSobreNosotros.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSobreNosotros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSobreNosotros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
     this.dispose();
    }//GEN-LAST:event_jbtnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JTextArea jtxtDetalle;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMusicEmpire;
    private javax.swing.JPanel pnlSobreNosotros;
    // End of variables declaration//GEN-END:variables
}
