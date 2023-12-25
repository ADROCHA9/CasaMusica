package ar.com.casamusica.proyectofinal.gui.inicio.principal;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;


public class VentanaAtencionC extends javax.swing.JFrame 
 {public VentanaAtencionC() 
     {super("Atencion al Cliente");
      initComponents();
      GestorVentanas.agregarVentana(this);
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaAtencionC.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);}

    
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        srllPreguntasF = new javax.swing.JScrollPane();
        lstPreguntasF = new javax.swing.JList<>();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        srllDescripcion = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstPreguntasF.setBackground(new java.awt.Color(51, 51, 51));
        lstPreguntasF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), null), "PREGUNTAS FRECUENTES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        lstPreguntasF.setForeground(new java.awt.Color(255, 255, 255));
        lstPreguntasF.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "¿Qué tipo de garantía tengo al ", "comprar en MusicEmpire?", "Todos los productos cuentan con una ", "garantía limitada de 2 años ofrecida ", "por el fabricante.", " ", "¿Se pueden hacer pedidos por teléfono?", "Los pedidos se realizan preferentemente ", "online. No obstante, si te surgen dudas o", " quieres hacer la compra en una tienda", " concreta, llámanos y lo solucionamos.", " ", "¿Qué tipo de instrumento musical puedo", " comprar en MusicEmpire?", "En nuestras tiendas de música disponemos", " de todo tipo de instrumentos musicales, ", "clásico, moderno, sonido, Dj, etc.", " ", "Tengo dudas y necesito consejo ", "profesional. ¿Qué hago?", "¡Nos encanta ayudarte! No dudes en ", "contactar con nosotros mediante nuestro ", "formulario y te", " asesoraremos según", " tus necesidades concretas.", " ", "¿Puedo comprar online accesorios para ", "mi instrumento?", "Sí. Te recomendamos que busques", " conocidos o amigos para agrupar tu ", "compra de accesorios. De esta manera ", "llegarás con facilidad a los 175K ", "de compra y el transporte será gratis. ", " ", "¿Qué métodos de pago puedo utilizar ", "para mi compra online?", "Los métodos de pago online son:", "Paypal. Las compras con este método de", " pago llevan un 3% de recargo sobre el", " valor del producto, pero este es el método ", "más rápido ya que tu pago queda", " reflejado instantáneamente.", "Tarjeta de Crédito o Débito", "Transferencia bancaria", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPreguntasF.setFocusable(false);
        srllPreguntasF.setViewportView(lstPreguntasF);

        pnlFondo.add(srllPreguntasF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 290, 230));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo:");
        pnlFondo.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 290, -1));

        lblDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripcion:");
        pnlFondo.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 0, 0));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("ENVIAR");
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 90, -1));

        txtDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setColumns(20);
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        srllDescripcion.setViewportView(txtDescripcion);

        pnlFondo.add(srllDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 290, 100));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/principal/AtencionAlCliente.jpg"))); // NOI18N
        lblFondo.setText("Descripcion:");
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
     String correo = txtCorreo.getText();
     String descripcion = txtDescripcion.getText();

     if (!correo.isEmpty() && !descripcion.isEmpty()) 
         {if (correo.contains("@")) 
             {JOptionPane.showMessageDialog(this,"Mensaje enviado, a la brevedad estaremos respondiendo... Gracias!!", "Confirmacion", PLAIN_MESSAGE);
              txtCorreo.setText(null);
              txtDescripcion.setText(null);} 
          else {JOptionPane.showMessageDialog(this, "Correo no Valido", "", ERROR_MESSAGE);}} 
     else {JOptionPane.showMessageDialog(this, "Por favor, complete ambos campos antes de enviar el mensaje.","A TENER EN CUENTA", ERROR_MESSAGE);}
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

 public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
       catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaAtencionC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaAtencionC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaAtencionC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaAtencionC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        
     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaAtencionC().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JList<String> lstPreguntasF;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane srllDescripcion;
    private javax.swing.JScrollPane srllPreguntasF;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
