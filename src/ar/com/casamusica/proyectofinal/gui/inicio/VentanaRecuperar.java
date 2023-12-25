package ar.com.casamusica.proyectofinal.gui.inicio;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;


public class VentanaRecuperar extends javax.swing.JFrame {

   public VentanaRecuperar() 
     {super("Recuperar Ingreso");
      initComponents();
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaRecuperar.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnEnviar1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 30));

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, -1));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnEnviar1.setBackground(new java.awt.Color(0, 0, 0));
        btnEnviar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar1.setText("ENVIAR");
        btnEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        lblFondo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar1ActionPerformed
     String Email = txtEmail.getText();
     if (!Email.isEmpty()) 
         {if (Email.contains("@")) 
             {JOptionPane.showMessageDialog(this, "      Revisa tu Email:)","",PLAIN_MESSAGE);
              this.dispose();}
          else {JOptionPane.showMessageDialog(this, "Email no Valido", "", ERROR_MESSAGE);}} 
     else {JOptionPane.showMessageDialog(this, "Por favor, complete el campo.","",ERROR_MESSAGE);}
    }//GEN-LAST:event_btnEnviar1ActionPerformed

    
    public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
      catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
      catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
      catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
      catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        

        
     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaRecuperar().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
