package ar.com.casamusica.proyectofinal.gui.principal.carrito.pago;

import ar.com.casamusica.proyectofinal.gui.inicio.principal.GestorVentanas;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.VentanaPrincipal;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class VentanaPago extends javax.swing.JFrame 
 {public VentanaPago() 
     {super("MusicEmpire");
      initComponents();
      GestorVentanas.agregarVentana(this);
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaPrincipal.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(rbtnDebito);
      buttonGroup.add(rbtnCredito);
      buttonGroup.add(rbtnMercadoP);
      buttonGroup.add(rbtnPaypal);
      buttonGroup.add(rbtnContraentrega);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        rbtnDebito = new javax.swing.JRadioButton();
        rbtnCredito = new javax.swing.JRadioButton();
        rbtnMercadoP = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbtnPaypal = new javax.swing.JRadioButton();
        rbtnContraentrega = new javax.swing.JRadioButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione su metodo de pago:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        rbtnDebito.setBackground(new java.awt.Color(0, 0, 0));
        rbtnDebito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnDebito.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDebito.setText("DEBITO");
        rbtnDebito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtnDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        rbtnCredito.setBackground(new java.awt.Color(0, 0, 0));
        rbtnCredito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnCredito.setForeground(new java.awt.Color(255, 255, 255));
        rbtnCredito.setText("CREDITO");
        rbtnCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtnCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        rbtnMercadoP.setBackground(new java.awt.Color(0, 0, 0));
        rbtnMercadoP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnMercadoP.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMercadoP.setText("MERCADO PAGO");
        rbtnMercadoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtnMercadoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CONTINUAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        rbtnPaypal.setBackground(new java.awt.Color(0, 0, 0));
        rbtnPaypal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnPaypal.setForeground(new java.awt.Color(255, 255, 255));
        rbtnPaypal.setText("PAYPAL");
        rbtnPaypal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtnPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        rbtnContraentrega.setBackground(new java.awt.Color(0, 0, 0));
        rbtnContraentrega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnContraentrega.setForeground(new java.awt.Color(255, 255, 255));
        rbtnContraentrega.setText("CONTRAENTREGA");
        rbtnContraentrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtnContraentrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     UIManager.put("OptionPane.yesButtonText", "SI");
     UIManager.put("OptionPane.noButtonText", "NO");
     if (rbtnDebito.isSelected()) 
         {int respuesta = JOptionPane.showConfirmDialog(this,
             "¿Confirmas el pago con tarjeta de débito?",
             "Confirmación de Pago",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);
        
         if (respuesta == JOptionPane.YES_OPTION) 
             {VentanaDebito vd = new VentanaDebito();
             vd.setVisible(true);}}
      else if (rbtnCredito.isSelected()) 
         {int respuesta = JOptionPane.showConfirmDialog(this,
             "¿Confirmas el pago con tarjeta de crédito?",
             "Confirmación de Pago",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);
        
             if (respuesta == JOptionPane.YES_OPTION)
             {VentanaCredito vc = new VentanaCredito();  
              vc.setVisible(true);}} 
      else if (rbtnMercadoP.isSelected()) 
         {int respuesta = JOptionPane.showConfirmDialog(this,
             "¿Confirmas el pago con MercadoPago?",
             "Confirmación de Pago",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);
        
             if (respuesta == JOptionPane.YES_OPTION) 
                 {JOptionPane.showMessageDialog(this, "Redirigiendo a MercadoPago, Gracias por tu Compra:)", "MusicEmpire", JOptionPane.PLAIN_MESSAGE);
                 abrirEnlace("https://www.mercadopago.com.ar/paid?CODE=V1C70X&utm_source=google"
                 + "&utm_medium=cpc&utm_campaign=MLA_MP_G_AO_ALL_BRD_SEARCH_MP_"
                 + "EXACT&matt_tool=28766038&matt_word=MLA_MP_Sellers_AO_X_G_Search_X_BrandKW_"
                 + "X&gclid=CjwKCAiAu9yqBhBmEiwAHTx5p4kYzMCbYQxTR0WBJMgHkAyTc7tksoisRV-_N0r_Ntd6dNgNpAu2WxoC5s4QAvD_BwE"); 
                 System.exit(0);}}
      else if (rbtnPaypal.isSelected()) 
         {int respuesta = JOptionPane.showConfirmDialog(this,
             "¿Confirmas el pago con Paypal?",
             "Confirmación de Pago",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);
        
             if (respuesta == JOptionPane.YES_OPTION) 
                 {JOptionPane.showMessageDialog(this, "Redirigiendo a Paypal, Gracias por tu Compra:)", "MusicEmpire", JOptionPane.PLAIN_MESSAGE);
                 abrirEnlace("https://www.paypal.com/ar/home?locale.x=es_AR");   
                 System.exit(0);}} 
      else if (rbtnContraentrega.isSelected()) 
         {int respuesta = JOptionPane.showConfirmDialog(this,
             "¿Confirmas el pago contra entrega?",
             "Confirmación de Pago",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);
        
         if (respuesta == JOptionPane.YES_OPTION) 
             {JOptionPane.showMessageDialog(this, "Gracias por tu compra, pagas al recibir en tu domicilio", "MusicEmpire", JOptionPane.PLAIN_MESSAGE);
             System.exit(0);}}
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

 
 private void abrirEnlace(String url) 
     {try {Desktop.getDesktop().browse(new URI(url));} 
      catch (Exception e) 
         {e.printStackTrace();}}
    
 
 public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
      catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
     catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
     catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
     catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
     
     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaPago().setVisible(true);}});}

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JRadioButton rbtnContraentrega;
    private javax.swing.JRadioButton rbtnCredito;
    private javax.swing.JRadioButton rbtnDebito;
    private javax.swing.JRadioButton rbtnMercadoP;
    private javax.swing.JRadioButton rbtnPaypal;
    // End of variables declaration//GEN-END:variables
}
