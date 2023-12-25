package ar.com.casamusica.proyectofinal.gui.principal.carrito;

import ar.com.casamusica.proyectofinal.connectors.Conexion;
import ar.com.casamusica.proyectofinal.dao.AmplificadorDAOImpl;
import ar.com.casamusica.proyectofinal.dao.CarritoDAOImpl;
import ar.com.casamusica.proyectofinal.entities.Carrito;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.GestorVentanas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class VentanaCarrito extends javax.swing.JFrame 
 {DefaultTableModel modeloCarrito = new DefaultTableModel();
  DefaultTableModel modeloTotal = new DefaultTableModel();
  CarritoDAOImpl caD = new CarritoDAOImpl();
   
 public VentanaCarrito() 
     {super("Carrito");
      initComponents();
      GestorVentanas.agregarVentana(this);
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaCarrito.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);
      
      addWindowListener(new WindowAdapter() 
         {@Override
          public void windowIconified(WindowEvent e) 
             {// Evitar la minimización de la ventana
              setExtendedState(JFrame.NORMAL);}});
        
    
     modeloCarrito = new DefaultTableModel();
     modeloTotal = new DefaultTableModel();
     tblPedido.setModel(modeloCarrito);       
     modeloCarrito.addColumn("Nombre");
     modeloCarrito.addColumn("Tipo");
     modeloCarrito.addColumn("Marca");
     modeloCarrito.addColumn("Precio");
     ArrayList lista = caD.cargarlista();
     
     for (Object unObjeto : lista) 
         {Carrito ca = (Carrito) unObjeto;
          Object[] rowData = {ca.getNombre(), ca.getTipo(), ca.getMarca(), ca.getPrecio()};
          modeloCarrito.addRow(rowData);}
        
     tblTotal.setModel(modeloTotal);
     modeloTotal.addColumn("Total");
     this.actualizarTablat();}
        
 private void abrirVentanaIngreso() 
     {//Muestra un JOptionPane para solicitar el número de DNI
     String inputDNI = JOptionPane.showInputDialog(this, "Ingrese su número de DNI:");

     //Verifica si el DNI ingresado tiene exactamente 8 caracteres numéricos
     if (inputDNI != null && inputDNI.matches("\\d{8}")) 
         {int dni = Integer.parseInt(inputDNI);
         //Consulta la base de datos para verificar si el DNI existe
         boolean dniExistente = caD.verificarDNIBaseDatos(dni);

         if (dniExistente) 
             {java.sql.Connection unaConexion = null;
             try {unaConexion = Conexion.obtenerConexion();} 
              catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) 
                 {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error al obtener la conexión", ex);}
           
             String consulta = "SELECT nombre, telefono, email, direccion FROM clientes WHERE dni = ?";
             try (PreparedStatement pstmt = unaConexion.prepareStatement(consulta)) 
                 { pstmt.setInt(1, dni);
                 try (ResultSet rs = pstmt.executeQuery()) 
                     {if (rs.next()) 
                         {// Obtener los datos del cliente desde el ResultSet
                         String nombre = rs.getString("nombre");
                         String telefono = rs.getString("telefono");
                         String email = rs.getString("email");
                         String direccion = rs.getString("direccion");
                    
                         VentanaIngresoDatos vi = new VentanaIngresoDatos(nombre, dni, telefono, email, direccion);
                         dkpCarrito.add(vi);
                         vi.setVisible(true);}}}
              catch (SQLException ex) 
                 {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);}} 
          else {JOptionPane.showMessageDialog(this, "El DNI no existe en la base de datos.");
                VentanaIngresoDatos vi = new VentanaIngresoDatos("", dni,"","","");
                dkpCarrito.add(vi);
                vi.setVisible(true);}}
      else {JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");}}
         
       
 public void actualizarVentana()
     {VentanaCarrito vc = new VentanaCarrito();
      vc.actualizarTabla();
      vc.actualizarTablat();}
 
 
 public void actualizarTabla() 
     {modeloCarrito.fireTableDataChanged();}
    
 
 public void actualizarTablat() 
     {//double total = caD.total();        
      //Object[] rowData = {total};
      //modeloTotal.addRow(rowData);
      //total = caD.total();
      //modeloTotal.setValueAt(total, 0, 0);
      //modeloTotal.fireTableDataChanged();
     double total = caD.total();
     // Limpiar todas las filas actuales
     while (modeloTotal.getRowCount() > 0) 
         {modeloTotal.removeRow(0);}

     // Agregar la nueva fila con el total actualizado
     Object[] rowData = { total };
     modeloTotal.addRow(rowData);

     // No es necesario setValueAt ya que estás eliminando todas las filas y agregando una nueva
     }
 
 
 public DefaultTableModel getModeloCarrito() 
     {return modeloCarrito;}
    
    
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpCarrito = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        srllPedido = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        tblTotal = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblUsd = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(0, 0, 0));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        tblPedido.setBackground(new java.awt.Color(0, 0, 0));
        tblPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblPedido.setForeground(new java.awt.Color(255, 255, 255));
        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Marca", "Precio"
            }
        ));
        tblPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srllPedido.setViewportView(tblPedido);

        jPanel1.add(srllPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 490, 320));

        tblTotal.setBackground(new java.awt.Color(0, 0, 0));
        tblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblTotal.setForeground(new java.awt.Color(255, 255, 255));
        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Total"
            }
        ));
        tblTotal.setFocusable(false);
        jPanel1.add(tblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 50, 20));

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("Total:");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        lblUsd.setBackground(new java.awt.Color(0, 0, 0));
        lblUsd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsd.setForeground(new java.awt.Color(0, 0, 0));
        lblUsd.setText("USD");
        jPanel1.add(lblUsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 500));

        dkpCarrito.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpCarritoLayout = new javax.swing.GroupLayout(dkpCarrito);
        dkpCarrito.setLayout(dkpCarritoLayout);
        dkpCarritoLayout.setHorizontalGroup(
            dkpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dkpCarritoLayout.setVerticalGroup(
            dkpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpCarrito)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpCarrito)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 //public void agregarFila(Object[] rowData) 
     //{modeloCarrito.addRow(rowData);}
      
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     int filaSeleccionada = tblPedido.getSelectedRow();
     if (filaSeleccionada != -1) 
         {UIManager.put("OptionPane.yesButtonText", "SI");
          UIManager.put("OptionPane.noButtonText", "NO");
          int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar el elemento seleccionado?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
         if (confirmacion == JOptionPane.YES_OPTION) 
             {// Obtener el valor de la columna "Precio" de la fila seleccionada
             double precio = (double) tblPedido.getValueAt(filaSeleccionada, 3);  // 3 es el índice de la columna "Precio"
            
             // Eliminar la fila seleccionada
             modeloCarrito.removeRow(filaSeleccionada);
            
             // Llamar al método eliminar de la clase CarritoDAOImpl
             CarritoDAOImpl c = new CarritoDAOImpl();
             c.eliminar(precio); 
             ArrayList lista = caD.cargarlista();
             this.actualizarTabla();
             this.actualizarTablat();
             JOptionPane.showMessageDialog(this, "Eliminación correcta");}} 
      else {JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     if (modeloCarrito.getRowCount() == 0) 
         {JOptionPane.showMessageDialog(this, "El carrito está vacío. Agregue productos antes de continuar.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);} 
      else {UIManager.put("OptionPane.yesButtonText", "SI");
         UIManager.put("OptionPane.noButtonText", "NO");
         int opcion = JOptionPane.showConfirmDialog(
             this,"¿Desea continuar con el pago?",
             "Confirmación de Pago",JOptionPane.YES_NO_OPTION);

         if (opcion == JOptionPane.YES_OPTION) 
             {abrirVentanaIngreso();}}
    }//GEN-LAST:event_btnContinuarActionPerformed
 
 public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}}
      catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
      catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
      catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
      catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        
     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaCarrito().setVisible(true);}});}

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnEliminar;
    protected javax.swing.JDesktopPane dkpCarrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsd;
    private javax.swing.JScrollPane srllPedido;
    protected javax.swing.JTable tblPedido;
    private javax.swing.JTable tblTotal;
    // End of variables declaration//GEN-END:variables
}
