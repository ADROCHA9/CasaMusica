package ar.com.casamusica.proyectofinal.gui.principal.carrito.pago;


import ar.com.casamusica.proyectofinal.gui.inicio.principal.VentanaPrincipal;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores.VentanaAmplificadores;

import ar.com.casamusica.proyectofinal.gui.inicio.principal.instrumentos.VentanaInstrumentos;
import ar.com.casamusica.proyectofinal.gui.principal.carrito.VentanaCarrito;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

 public class VentanaDebito extends javax.swing.JFrame {
 VentanaPago vp = new VentanaPago();
 VentanaCarrito vc = new VentanaCarrito();
 VentanaInstrumentos vi = new VentanaInstrumentos();
 VentanaPrincipal vpr = new VentanaPrincipal();
 VentanaAmplificadores vam = new VentanaAmplificadores();
 boolean bandera = false;
 
 public VentanaDebito() 
     {super("TarjetaCredito");
      initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaDebito.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);
      
     txtTarjeta.addFocusListener(new FocusAdapter() 
         {@Override
         public void focusGained(FocusEvent e) 
         {verificarNumero();}});
         
     txtTarjeta.addKeyListener(new KeyAdapter() 
         {@Override
          public void keyTyped(KeyEvent e) 
             {verificarNumero();}});         
        
     txtMes.addFocusListener(new FocusAdapter() 
         {@Override
         public void focusLost(FocusEvent e) 
             {verificarNumeroMes();}});}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTarjeta = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtTarjeta = new javax.swing.JTextField();
        lblVencimiento = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        txtCVC = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        txtFondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre Titular");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        pnlTarjeta.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 300, -1));

        txtTarjeta.setBackground(new java.awt.Color(51, 51, 51));
        txtTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        txtTarjeta.setText("Numero Tarjeta");
        txtTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTarjetaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTarjetaFocusLost(evt);
            }
        });
        pnlTarjeta.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 300, -1));

        lblVencimiento.setBackground(new java.awt.Color(0, 0, 0));
        lblVencimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblVencimiento.setText("Vencimiento:");
        pnlTarjeta.add(lblVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtMes.setBackground(new java.awt.Color(51, 51, 51));
        txtMes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMes.setForeground(new java.awt.Color(255, 255, 255));
        txtMes.setText("Mes");
        txtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMesFocusLost(evt);
            }
        });
        pnlTarjeta.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        txtAño.setBackground(new java.awt.Color(51, 51, 51));
        txtAño.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAño.setForeground(new java.awt.Color(255, 255, 255));
        txtAño.setText("Año");
        txtAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAñoFocusLost(evt);
            }
        });
        pnlTarjeta.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        btnPagar.setBackground(new java.awt.Color(0, 0, 0));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        pnlTarjeta.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        txtCVC.setBackground(new java.awt.Color(51, 51, 51));
        txtCVC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCVC.setForeground(new java.awt.Color(255, 255, 255));
        txtCVC.setText("CVC");
        txtCVC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCVCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCVCFocusLost(evt);
            }
        });
        pnlTarjeta.add(txtCVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        pnlTarjeta.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 40, 30));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlTarjeta.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlTarjeta.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        txtFondo.setText("jTextField1");
        pnlTarjeta.add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void verificarNumeroMes() 
     {try {String mesStr = txtMes.getText().trim();
         // Verificar si la cadena no está vacía
         if (!mesStr.isEmpty()) 
             {int mes = Integer.parseInt(mesStr);
             // Verificar si el mes es válido
             if (mes <= 0 || mes > 12) 
                 {mostrarAdvertencia("Ingrese un número de mes válido.");}}}
                 // Puedes limpiar el campo o realizar otras acciones según tus necesidades
       catch (NumberFormatException ex) 
         {// Manejar la excepción si la entrada no es un número válido
         txtMes.setText("Mes");}// Puedes limpiar el campo o realizar otras acciones según tus necesidades
    }
   
 private void mostrarAdvertencia(String mensaje) 
     {JOptionPane.showMessageDialog(this, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);}
   
 
 private void verificarNumero() 
     {String numeroTarjeta = txtTarjeta.getText();

     if (!numeroTarjeta.isEmpty()) 
         {char primerDigito = numeroTarjeta.charAt(0);
         if (primerDigito == '4') 
             {mostrarLogo("src\\ar\\com\\casamusica\\proyectofinal\\picture\\carrito\\pago\\VISA.jpg");} 
          else if (primerDigito == '3') 
             {mostrarLogo("src\\ar\\com\\casamusica\\proyectofinal\\picture\\carrito\\pago\\AMEX.jpg");} 
          else if (primerDigito == '5') 
             {mostrarLogo("src\\ar\\com\\casamusica\\proyectofinal\\picture\\carrito\\pago\\MASTERCARD.jpg");}
          else {// Si el primer dígito no es 4, 3 ni 5, no mostrar ninguna imagen
             mostrarAdvertencia("Digitos incorrectos, Ingrese Numero valido");
             lblImagen.setIcon(null);
             txtTarjeta.setText("");}} 
      else {// Si el campo de texto está vacío, no mostrar ninguna imagen
         lblImagen.setIcon(null);}}
 
 
 private void mostrarLogo(String imagenPath) 
     {ImageIcon icon = new ImageIcon(imagenPath);
      lblImagen.setIcon(icon);}
   
 
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
     try {String nombre = txtNombre.getText();
          String numeroTarjeta = txtTarjeta.getText();
          int mes = Integer.parseInt(txtMes.getText());
          int año = Integer.parseInt(txtAño.getText());
          int CVC = Integer.parseInt(txtCVC.getText());

         // Verificar si se cumplen todas las condiciones
         if (nombre.isEmpty() || mes <= 0 || año <= 0) 
             {JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios y deben contener valores válidos.",
                 "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
             return;}
            
         if (numeroTarjeta.length() < 16) 
             {mostrarAdvertencia("El número de tarjeta debe ser valido.");
              lblImagen.setIcon(null);
              return;}       
            
            
          if (CVC < 001 || CVC > 999) 
             {mostrarAdvertencia("El CVC no es válido");
              return;}
            
            
         JOptionPane.showMessageDialog(this, "Gracias por su compra :)", "MusicEmpire", JOptionPane.PLAIN_MESSAGE);
         System.exit(0);} 
      catch (NumberFormatException ex) 
         {JOptionPane.showMessageDialog(this, "Verifique si los campos numericos requeridos son válidos ",
             "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnPagarActionPerformed

    
    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
     txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtTarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTarjetaFocusGained
     txtTarjeta.setText(null);
     verificarNumero();        
    }//GEN-LAST:event_txtTarjetaFocusGained

    
    private void txtMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFocusGained
     txtMes.setText(null); 
    }//GEN-LAST:event_txtMesFocusGained

    
    private void txtAñoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoFocusGained
     txtAño.setText("");
    }//GEN-LAST:event_txtAñoFocusGained

    
    private void txtCVCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCVCFocusGained
     txtCVC.setText("");
    }//GEN-LAST:event_txtCVCFocusGained

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     UIManager.put("OptionPane.yesButtonText", "SI");
     UIManager.put("OptionPane.noButtonText", "NO");
     int confirmacion = JOptionPane.showConfirmDialog(this,
         "¿Está seguro de que desea cancelar el pago?",
         "Confirmar cancelación",
         JOptionPane.YES_NO_OPTION);

     // Si el usuario elige "Sí" (YES_OPTION), entonces cierra la ventana
     if (confirmacion == JOptionPane.YES_OPTION) 
         {this.dispose();}
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
     if (txtNombre.getText().trim().isEmpty()) 
         {txtNombre.setText("Nombre Titular");}
    }//GEN-LAST:event_txtNombreFocusLost

    
    private void txtTarjetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTarjetaFocusLost
     if (txtTarjeta.getText().trim().isEmpty()) 
         {txtTarjeta.setText("Numero Tarjeta");}
    }//GEN-LAST:event_txtTarjetaFocusLost

    
    private void txtMesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFocusLost
     if (txtMes.getText().trim().isEmpty()) 
         {txtMes.setText("Mes");}
    }//GEN-LAST:event_txtMesFocusLost

    
    private void txtAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoFocusLost
     if (txtAño.getText().trim().isEmpty()) 
         {txtAño.setText("Año");}
    }//GEN-LAST:event_txtAñoFocusLost

    
    private void txtCVCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCVCFocusLost
     if (txtCVC.getText().trim().isEmpty()) 
         {txtCVC.setText("CVC");}
    }//GEN-LAST:event_txtCVCFocusLost

    
 public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
       catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        
     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaDebito().setVisible(true);}});}

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblVencimiento;
    private javax.swing.JPanel pnlTarjeta;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCVC;
    private javax.swing.JTextField txtFondo;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTarjeta;
    // End of variables declaration//GEN-END:variables
}
