package ar.com.casamusica.proyectofinal.gui.principal.carrito;

import ar.com.casamusica.proyectofinal.gui.principal.carrito.pago.VentanaPago;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class VentanaIngresoDatos extends javax.swing.JInternalFrame 
 {VentanaCarrito vc = new VentanaCarrito();
    
 public VentanaIngresoDatos(String nombre, int dni, String telefono, String email, String direccion) 
     {super("Datos de Envio");
      initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaIngresoDatos.DO_NOTHING_ON_CLOSE);
      txtNombre.setText(nombre);
      txtDNI.setText(String.valueOf(dni));
      txtTelefono.setText(telefono);
      txtEmail.setText(email);
      txtDireccion.setText(direccion);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLinea1 = new javax.swing.JLabel();
        lblLinea2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLinea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        getContentPane().add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        getContentPane().add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 390, 30));

        txtDireccion.setBackground(new java.awt.Color(51, 51, 51));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));

        txtDNI.setBackground(new java.awt.Color(51, 51, 51));
        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre*");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        lblDni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDni.setForeground(new java.awt.Color(255, 255, 255));
        lblDni.setText("DNI*");
        lblDni.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono");
        lblTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email*");
        lblEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion*");
        lblDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(0, 0, 0));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 330, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     UIManager.put("OptionPane.yesButtonText", "SI");
     UIManager.put("OptionPane.noButtonText", "NO");
     try {String nombre = txtNombre.getText();
          String email = txtEmail.getText();
          String dniText = txtDNI.getText().trim();
          int telefono = Integer.parseInt(txtTelefono.getText());
          String direccion = txtDireccion.getText();

         // Verificar campos obligatorios
         if (nombre.isEmpty() || email.isEmpty() || direccion.isEmpty()) 
             {JOptionPane.showMessageDialog(this, "Los campos Nombre, Email y Dirección son obligatorios.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
             // Salir del método si hay campos obligatorios vacíos
             return;}

         // Validar formato de correo electrónico (contiene "@")
         if (!email.contains("@")) 
             {JOptionPane.showMessageDialog(this, "El campo Email debe ser un correo electrónico válido.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
              txtEmail.requestFocus();
              return;}

         if (dniText.isEmpty()) 
             {JOptionPane.showMessageDialog(this, "El campo DNI no puede estar vacío.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
             txtDNI.requestFocus();
             return;}

         // Verificar que el DNI tenga exactamente 8 dígitos si no está vacío
         if (!dniText.isEmpty() && dniText.length() != 8) 
             {JOptionPane.showMessageDialog(this, "El campo DNI debe tener exactamente 8 dígitos.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
             txtDNI.requestFocus();
             return;}

         // Convertir DNI a entero si no está vacío
         int dni = Integer.parseInt(dniText);

         // Convertir telefono a entero si no está vacío, o dejarlo como 0 si está vacío
         if (telefono < 1100000000 || telefono > 1599999999 ) 
             {JOptionPane.showMessageDialog(this, "El telefono que ingresaste es incorrecto", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
              return;} 

         // Mostrar confirmación de los datos ingresados
         int confirmacion = JOptionPane.showConfirmDialog(this,
             "¿Confirma que los datos ingresados son correctos?\n\n"
                 + "Nombre: " + nombre + "\n"
                 + "Email: " + email + "\n"
                 + "DNI: " + dni + "\n"
                 + "Teléfono: " + telefono + "\n"
                 + "Dirección: " + direccion,
             "Confirmación de Datos",
             JOptionPane.YES_NO_OPTION);

         if (confirmacion == JOptionPane.YES_OPTION) 
             {// Datos confirmados, mostrar la ventana de pago
             VentanaPago vp = new VentanaPago();
             this.dispose();
             vp.setVisible(true);}}
      catch (NumberFormatException ex) 
         {JOptionPane.showMessageDialog(this, "El campo DNI debe ser un número válido si no está vacío.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
         txtDNI.requestFocus();}
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
