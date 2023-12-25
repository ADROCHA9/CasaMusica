
package ar.com.casamusica.proyectofinal.gui.inicio;

import ar.com.casamusica.proyectofinal.connectors.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaCliente extends javax.swing.JFrame {

    
 public VentanaCliente() 
     {initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaCliente.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre*");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        lblDNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setText("DNI*");
        lblDNI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono");
        lblTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");
        lblDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email*");
        lblEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, -1));

        txtDNI.setBackground(new java.awt.Color(51, 51, 51));
        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));

        txtDireccion.setBackground(new java.awt.Color(51, 51, 51));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        
     try {String nombre = txtNombre.getText();
          String email = txtEmail.getText();
          String dniText = txtDNI.getText().trim();
          int telefono = Integer.parseInt(txtTelefono.getText());
          String direccion = txtDireccion.getText();

     // Verificar campos obligatorios
     if (nombre.isEmpty() || email.isEmpty()) 
     {JOptionPane.showMessageDialog(this, "Los campos Nombre y Email son obligatorios.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
      return;}// Salir del método si hay campos obligatorios vacíos

     if (!email.contains("@")) 
         {JOptionPane.showMessageDialog(this, "El campo Email debe ser un correo electrónico válido.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
          txtEmail.requestFocus();
          return;}
    
     if (dniText.isEmpty()) 
         {JOptionPane.showMessageDialog(this, "El campo DNI no puede estar vacio", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
          txtDNI.requestFocus();
          return;}
    
     // Verificar que el DNI tenga exactamente 8 dígitos si no está vacío
     if (!dniText.isEmpty() && dniText.length() != 8) 
         {JOptionPane.showMessageDialog(this, "El campo DNI debe tener exactamente 8 dígitos.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
          txtDNI.requestFocus();
          return;}

     // Convertir DNI a entero si no está vacío
     int dni = dniText.isEmpty() ? 0 : Integer.parseInt(dniText);

     if (telefono < 1100000000 || telefono > 1599999999 ) 
         {JOptionPane.showMessageDialog(this, "El telefono que ingresaste es incorrecto", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
          return;}
      
     Connection conexion = Conexion.obtenerConexion();
     String sql = "insert into clientes(nombre, dni, telefono, email, direccion) values (?, ?, ?, ?, ?)";

     PreparedStatement statement = conexion.prepareStatement(sql);
     statement.setString(1, nombre);
     statement.setInt(2, dni);
     statement.setInt(3, telefono);
     statement.setString(4, email);
     statement.setString(5, direccion);

     int filasAfectadas = statement.executeUpdate();

     if (filasAfectadas > 0) 
         {JOptionPane.showMessageDialog(this, "Datos insertados con éxito.");
          this.dispose();}
     else {JOptionPane.showMessageDialog(this, "Error al insertar datos.");
           txtNombre.requestFocus();}
     
     
     } catch (SQLException ex) 
         {ex.printStackTrace();}
      catch (ClassNotFoundException ex) 
         {Logger.getLogger(VentanaCliente.class.getName()).log(Level.SEVERE, null, ex);} 
      catch (NumberFormatException ex) 
         {JOptionPane.showMessageDialog(this, "El campo DNI debe ser un número válido si no está vacío.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
          txtDNI.requestFocus();}
      catch (InstantiationException | IllegalAccessException ex) 
         {Logger.getLogger(VentanaCliente.class.getName()).log(Level.SEVERE, null, ex);}

     
     // Limpiar los campos después de la inserción (o en caso de error)
     txtNombre.setText(null);
     txtDNI.setText(null);
     txtTelefono.setText(null);
     txtEmail.setText(null);
     txtDireccion.setText(null);
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();    
    }//GEN-LAST:event_btnAtrasActionPerformed


    public static void main(String args[]) 
     {java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() 
         {new VentanaCliente().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
