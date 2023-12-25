package ar.com.casamusica.proyectofinal.gui.inicio.principal;

import ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores.VentanaAmplificadores;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.instrumentos.VentanaInstrumentos;
import ar.com.casamusica.proyectofinal.gui.inicio.VentanaLogin;
import ar.com.casamusica.proyectofinal.gui.principal.carrito.VentanaCarrito;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class VentanaPrincipal extends javax.swing.JFrame 
 {VentanaCarrito vc = new VentanaCarrito();
 public VentanaPrincipal() 
     {super("MusicEmpire");
      initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaPrincipal.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);  
      GestorVentanas.agregarVentana(this);}
    

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnlPrincipal = new javax.swing.JPanel();
        btnCarrito = new javax.swing.JButton();
        lblAmplificadores = new javax.swing.JLabel();
        lblInstrumentos = new javax.swing.JLabel();
        jbtnVerA = new javax.swing.JButton();
        jbtnVerI = new javax.swing.JButton();
        lblInstrumento = new javax.swing.JLabel();
        lblAmplificador = new javax.swing.JLabel();
        lblCarrito = new javax.swing.JLabel();
        btnOffline = new javax.swing.JButton();
        lblFonfoI = new javax.swing.JLabel();
        lblFondoA = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        mnbEmpire = new javax.swing.JMenuBar();
        mnuVacio = new javax.swing.JMenu();
        mnuVacioo = new javax.swing.JMenu();
        mnuSobreNosotros = new javax.swing.JMenu();
        jmuMusicEmpire = new javax.swing.JMenuItem();
        mnuVaciooo = new javax.swing.JMenu();
        mnuOpciones = new javax.swing.JMenu();
        jmuAtencionC = new javax.swing.JMenuItem();
        jmuAcercaDe = new javax.swing.JMenuItem();
        jmuSalir = new javax.swing.JMenuItem();
        mnuVacioooo = new javax.swing.JMenu();
        mnuVaciooooo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCarrito.setBackground(new java.awt.Color(0, 0, 0));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("CARRITO");
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, -1, -1));

        lblAmplificadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/principal/marshal.png"))); // NOI18N
        lblAmplificadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPrincipal.add(lblAmplificadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 470));

        lblInstrumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/principal/guitarraybajos.png"))); // NOI18N
        lblInstrumentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPrincipal.add(lblInstrumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 470));

        jbtnVerA.setBackground(new java.awt.Color(153, 153, 153));
        jbtnVerA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnVerA.setForeground(new java.awt.Color(0, 0, 0));
        jbtnVerA.setText("VER");
        jbtnVerA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerAActionPerformed(evt);
            }
        });
        pnlPrincipal.add(jbtnVerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        jbtnVerI.setBackground(new java.awt.Color(153, 153, 153));
        jbtnVerI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnVerI.setForeground(new java.awt.Color(0, 0, 0));
        jbtnVerI.setText("VER");
        jbtnVerI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVerI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerIActionPerformed(evt);
            }
        });
        pnlPrincipal.add(jbtnVerI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        lblInstrumento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInstrumento.setForeground(new java.awt.Color(204, 204, 204));
        lblInstrumento.setText("INSTRUMENTOS");
        pnlPrincipal.add(lblInstrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        lblAmplificador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAmplificador.setForeground(new java.awt.Color(204, 204, 204));
        lblAmplificador.setText("AMPLIFICADORES");
        pnlPrincipal.add(lblAmplificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        lblCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/carrito/carrrito (1) (1).png"))); // NOI18N
        pnlPrincipal.add(lblCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 70, 60));

        btnOffline.setBackground(new java.awt.Color(0, 0, 0));
        btnOffline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOffline.setForeground(new java.awt.Color(255, 255, 255));
        btnOffline.setText("CERRAR SESION");
        btnOffline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOffline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfflineActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnOffline, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        lblFonfoI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlPrincipal.add(lblFonfoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 466, 290, 50));

        lblFondoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlPrincipal.add(lblFondoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 466, 290, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        pnlPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 600));

        jDesktopPane1.setLayer(pnlPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnbEmpire.setBackground(new java.awt.Color(0, 0, 0));
        mnbEmpire.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnbEmpire.setForeground(new java.awt.Color(255, 255, 255));
        mnbEmpire.setOpaque(true);

        mnuVacio.setText("I");
        mnbEmpire.add(mnuVacio);

        mnuVacioo.setText("I");
        mnbEmpire.add(mnuVacioo);

        mnuSobreNosotros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuSobreNosotros.setText("SOBRE NOSOTROS");
        mnuSobreNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuSobreNosotros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jmuMusicEmpire.setText("MusicEmpire");
        jmuMusicEmpire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmuMusicEmpireActionPerformed(evt);
            }
        });
        mnuSobreNosotros.add(jmuMusicEmpire);

        mnbEmpire.add(mnuSobreNosotros);

        mnuVaciooo.setText("I");
        mnbEmpire.add(mnuVaciooo);

        mnuOpciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuOpciones.setText("OPCIONES");
        mnuOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuOpciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOpcionesActionPerformed(evt);
            }
        });

        jmuAtencionC.setText("Atencion al Cliente");
        jmuAtencionC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmuAtencionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmuAtencionCActionPerformed(evt);
            }
        });
        mnuOpciones.add(jmuAtencionC);

        jmuAcercaDe.setText("Acerca de.....");
        jmuAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmuAcercaDeActionPerformed(evt);
            }
        });
        mnuOpciones.add(jmuAcercaDe);

        jmuSalir.setText("Salir");
        jmuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmuSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(jmuSalir);

        mnbEmpire.add(mnuOpciones);

        mnuVacioooo.setText("I");
        mnbEmpire.add(mnuVacioooo);

        mnuVaciooooo.setText("I");
        mnbEmpire.add(mnuVaciooooo);

        setJMenuBar(mnbEmpire);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOpcionesActionPerformed
     VentanaAtencionC va = new VentanaAtencionC();
     va.setVisible(true);
    }//GEN-LAST:event_mnuOpcionesActionPerformed

    private void jmuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmuAcercaDeActionPerformed
     VentanaAcercaDe va = new VentanaAcercaDe();
     jDesktopPane1.add(va);
     va.setVisible(true);
    }//GEN-LAST:event_jmuAcercaDeActionPerformed

    private void jmuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmuSalirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jmuSalirActionPerformed

    private void jmuAtencionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmuAtencionCActionPerformed
     VentanaAtencionC va = new VentanaAtencionC();
     va.setVisible(true);        
    }//GEN-LAST:event_jmuAtencionCActionPerformed

    private void jbtnVerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerAActionPerformed
     VentanaAmplificadores va = new VentanaAmplificadores();
     va.setVisible(true);
     this.dispose();       
    }//GEN-LAST:event_jbtnVerAActionPerformed

    private void jbtnVerIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerIActionPerformed
     VentanaInstrumentos vi = new VentanaInstrumentos();
     vi.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jbtnVerIActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
     vc.actualizarVentana();
     vc.setVisible(true);                         
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnOfflineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfflineActionPerformed
     VentanaLogin vl = new VentanaLogin();
     UIManager.put("OptionPane.yesButtonText", "SI");
     UIManager.put("OptionPane.noButtonText", "NO");
             
     int respuesta = JOptionPane.showConfirmDialog(this, "¿Confirmas el cierre de sesión?",
                      "", JOptionPane.YES_NO_OPTION);

     if (respuesta == JOptionPane.YES_OPTION) 
         {GestorVentanas.cerrarVentanas();
          vl.setVisible(true);           
          this.dispose();}        
    }//GEN-LAST:event_btnOfflineActionPerformed

    private void jmuMusicEmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmuMusicEmpireActionPerformed
     VentanaSobreNosotros vsn = new VentanaSobreNosotros();
     jDesktopPane1.add(vsn);
     vsn.setVisible(true);
    }//GEN-LAST:event_jmuMusicEmpireActionPerformed

 public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
       catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
       catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
       catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        

     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaPrincipal().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnOffline;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jbtnVerA;
    private javax.swing.JButton jbtnVerI;
    private javax.swing.JMenuItem jmuAcercaDe;
    private javax.swing.JMenuItem jmuAtencionC;
    private javax.swing.JMenuItem jmuMusicEmpire;
    private javax.swing.JMenuItem jmuSalir;
    private javax.swing.JLabel lblAmplificador;
    private javax.swing.JLabel lblAmplificadores;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondoA;
    private javax.swing.JLabel lblFonfoI;
    private javax.swing.JLabel lblInstrumento;
    private javax.swing.JLabel lblInstrumentos;
    private javax.swing.JMenuBar mnbEmpire;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuSobreNosotros;
    private javax.swing.JMenu mnuVacio;
    private javax.swing.JMenu mnuVacioo;
    private javax.swing.JMenu mnuVaciooo;
    private javax.swing.JMenu mnuVacioooo;
    private javax.swing.JMenu mnuVaciooooo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
