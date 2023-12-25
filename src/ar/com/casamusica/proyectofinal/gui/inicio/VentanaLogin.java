package ar.com.casamusica.proyectofinal.gui.inicio;

import static ar.com.casamusica.proyectofinal.connectors.Conexion.obtenerConexion;
import ar.com.casamusica.proyectofinal.dao.CarritoDAOImpl;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.VentanaPrincipal;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class VentanaLogin extends javax.swing.JFrame {
 CarritoDAOImpl caD = new CarritoDAOImpl();
    public VentanaLogin() 
     {super("LOGIN");
      initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaLogin.DO_NOTHING_ON_CLOSE);
      this.setResizable(false);
      this.setLocationRelativeTo(this);
      caD.eliminarTodo();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnRegistrate = new javax.swing.JButton();
        pswContraseña = new javax.swing.JPasswordField();
        btnRecuperar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        tbtnSalir = new javax.swing.JToggleButton();
        lblFondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 140, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        btnRegistrate.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrate.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrate.setText("REGISTRATE");
        btnRegistrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrateActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        pswContraseña.setBackground(new java.awt.Color(51, 51, 51));
        pswContraseña.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 140, -1));

        btnRecuperar.setBackground(new java.awt.Color(0, 0, 0));
        btnRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperar.setText("RECUPERAR INGRESO");
        btnRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/inicio/musica empire logo-modified (2).png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, 160));

        tbtnSalir.setBackground(new java.awt.Color(102, 102, 102));
        tbtnSalir.setForeground(new java.awt.Color(204, 204, 204));
        tbtnSalir.setText("SALIR");
        tbtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbtnSalir.setFocusPainted(false);
        tbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(tbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificarCredenciales(String email, String contraseña) 
     {// Realizar la conexión y consulta a la base de datos
      // Devuelve true si las credenciales son válidas, de lo contrario, false
     try {Connection conexion = obtenerConexion(); // Método ficticio para obtener la conexión
          String consulta = "SELECT * FROM clientes WHERE email = ? AND dni = ?";
         try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) 
             {pstmt.setString(1, email);
              pstmt.setString(2, contraseña);
              ResultSet rs = pstmt.executeQuery();
              return rs.next();} // Devuelve true si hay al menos una fila (es decir, credenciales válidas)
        } catch (Exception e) 
             {e.printStackTrace();
              return false;}}
 
 
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
     String email = txtEmail.getText();
     String contraseña = pswContraseña.getText();
     if (verificarCredenciales(email, contraseña)) 
         {VentanaPrincipal vp = new VentanaPrincipal();  
          vp.setVisible(true);
          this.dispose();}
        else {JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnIngresarActionPerformed

    
    private void btnRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrateActionPerformed
     VentanaCliente vc = new VentanaCliente();
     vc.setVisible(true);
    }//GEN-LAST:event_btnRegistrateActionPerformed

    
    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
     VentanaRecuperar vr = new VentanaRecuperar();
     vr.setVisible(true);
    }//GEN-LAST:event_btnRecuperarActionPerformed

    
    private void tbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnSalirActionPerformed
     System.exit(0);        
    }//GEN-LAST:event_tbtnSalirActionPerformed

    
    public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
       catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}

        
     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaLogin().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnRegistrate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JToggleButton tbtnSalir;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
