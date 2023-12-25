package ar.com.casamusica.proyectofinal.gui.inicio.principal.amplificadores;

import ar.com.casamusica.proyectofinal.dao.CarritoDAOImpl;
import ar.com.casamusica.proyectofinal.entities.Amplificador;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.GestorVentanas;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.VentanaPrincipal;
import ar.com.casamusica.proyectofinal.gui.principal.carrito.VentanaCarrito;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaAmplificadores extends javax.swing.JFrame 
 {protected DefaultTableModel modeloCarrito;
  DefaultTableModel ModeloCarrito = new DefaultTableModel();
  VentanaCarrito vc = new VentanaCarrito();
  CarritoDAOImpl caD = new CarritoDAOImpl();
 public VentanaAmplificadores() 
     {super("AMPLIFICADORES");
      initComponents();
      GestorVentanas.agregarVentana(this);
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaAmplificadores.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpAmplificadores = new javax.swing.JDesktopPane();
        pnlAmplificadores = new javax.swing.JPanel();
        lblBose = new javax.swing.JLabel();
        btnBose = new javax.swing.JButton();
        btnAñadirBose = new javax.swing.JButton();
        lblPrecioBose = new javax.swing.JLabel();
        lblShure = new javax.swing.JLabel();
        btnShure = new javax.swing.JButton();
        btnAñadirShure = new javax.swing.JButton();
        lblPrecioShure = new javax.swing.JLabel();
        lblJblI = new javax.swing.JLabel();
        btnJblI = new javax.swing.JButton();
        btnAñadirJblI = new javax.swing.JButton();
        lblPrecioJblI = new javax.swing.JLabel();
        lblMarshal = new javax.swing.JLabel();
        btnMarshal = new javax.swing.JButton();
        btnAñadirMarshal = new javax.swing.JButton();
        lblPrecioMarshal = new javax.swing.JLabel();
        lblRode = new javax.swing.JLabel();
        btnRode = new javax.swing.JButton();
        btnAñadirRode = new javax.swing.JButton();
        lblPrecioRode = new javax.swing.JLabel();
        lblJblX = new javax.swing.JLabel();
        btnJblX = new javax.swing.JButton();
        btnAñadirJblX = new javax.swing.JButton();
        lblPrecioJblX = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblLinea1 = new javax.swing.JLabel();
        lblLinea2 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        lblLinea3 = new javax.swing.JLabel();
        lblLinea4 = new javax.swing.JLabel();
        lblLinea5 = new javax.swing.JLabel();
        lblLinea6 = new javax.swing.JLabel();
        lblLinea7 = new javax.swing.JLabel();
        lblLinea8 = new javax.swing.JLabel();
        lblLinea9 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAmplificadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBose.setForeground(new java.awt.Color(0, 0, 0));
        lblBose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Bose Altavoz Companion 50.jpg"))); // NOI18N
        lblBose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAmplificadores.add(lblBose, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 130));

        btnBose.setBackground(new java.awt.Color(0, 0, 0));
        btnBose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBose.setForeground(new java.awt.Color(255, 255, 255));
        btnBose.setText("ALTAVOZ BOSE COMPANION 50");
        btnBose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoseActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnBose, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, 40));

        btnAñadirBose.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirBose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirBose.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirBose.setText("AÑADIR AL CARRITO");
        btnAñadirBose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirBose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirBoseActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnAñadirBose, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        lblPrecioBose.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioBose.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioBose.setText("$ 99.9");
        pnlAmplificadores.add(lblPrecioBose, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, -1));

        lblShure.setForeground(new java.awt.Color(0, 0, 0));
        lblShure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Captura de pantalla 2023-11-10 155302.jpg"))); // NOI18N
        lblShure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAmplificadores.add(lblShure, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 130));

        btnShure.setBackground(new java.awt.Color(0, 0, 0));
        btnShure.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShure.setForeground(new java.awt.Color(255, 255, 255));
        btnShure.setText("MICROFONO SHURE CARDIOIDE PGA58");
        btnShure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShureActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnShure, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 40));

        btnAñadirShure.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirShure.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirShure.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirShure.setText("AÑADIR AL CARRITO");
        btnAñadirShure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirShure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirShureActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnAñadirShure, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        lblPrecioShure.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioShure.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioShure.setText("$ 82.5");
        pnlAmplificadores.add(lblPrecioShure, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 60, -1));

        lblJblI.setForeground(new java.awt.Color(0, 0, 0));
        lblJblI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/JBL IRX 108 BT.jpg"))); // NOI18N
        lblJblI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAmplificadores.add(lblJblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 130));

        btnJblI.setBackground(new java.awt.Color(0, 0, 0));
        btnJblI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnJblI.setForeground(new java.awt.Color(255, 255, 255));
        btnJblI.setText("JBL IRX 108BT");
        btnJblI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJblI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJblIActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnJblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 40));

        btnAñadirJblI.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirJblI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirJblI.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirJblI.setText("AÑADIR AL CARRITO");
        btnAñadirJblI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirJblI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirJblIActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnAñadirJblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        lblPrecioJblI.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioJblI.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioJblI.setText("$ 110.0");
        pnlAmplificadores.add(lblPrecioJblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 60, -1));

        lblMarshal.setForeground(new java.awt.Color(0, 0, 0));
        lblMarshal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Marshal MS-4.jpg"))); // NOI18N
        lblMarshal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAmplificadores.add(lblMarshal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 140, 130));

        btnMarshal.setBackground(new java.awt.Color(0, 0, 0));
        btnMarshal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMarshal.setForeground(new java.awt.Color(255, 255, 255));
        btnMarshal.setText("MARSHAL MS-4");
        btnMarshal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMarshal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarshalActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnMarshal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, 40));

        btnAñadirMarshal.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirMarshal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirMarshal.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirMarshal.setText("AÑADIR AL CARRITO");
        btnAñadirMarshal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirMarshal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirMarshalActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnAñadirMarshal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        lblPrecioMarshal.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioMarshal.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioMarshal.setText("$ 203.6");
        pnlAmplificadores.add(lblPrecioMarshal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 60, -1));

        lblRode.setForeground(new java.awt.Color(0, 0, 0));
        lblRode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Microfono RODE NT1.jpg"))); // NOI18N
        lblRode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAmplificadores.add(lblRode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 140, 130));

        btnRode.setBackground(new java.awt.Color(0, 0, 0));
        btnRode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRode.setForeground(new java.awt.Color(255, 255, 255));
        btnRode.setText("MICROFONO RODE NT1");
        btnRode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRodeActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnRode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, 40));

        btnAñadirRode.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirRode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirRode.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirRode.setText("AÑADIR AL CARRITO");
        btnAñadirRode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirRode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirRodeActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnAñadirRode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        lblPrecioRode.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioRode.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioRode.setText("$ 77.7");
        pnlAmplificadores.add(lblPrecioRode, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 60, -1));

        lblJblX.setForeground(new java.awt.Color(0, 0, 0));
        lblJblX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/amplificadores/Parlante Portatil Jbl Xtreme 2.jpg"))); // NOI18N
        lblJblX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAmplificadores.add(lblJblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 140, 130));

        btnJblX.setBackground(new java.awt.Color(0, 0, 0));
        btnJblX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnJblX.setForeground(new java.awt.Color(255, 255, 255));
        btnJblX.setText("JBL PORTATIL XTREME 2");
        btnJblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJblX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJblXActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnJblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, 40));

        btnAñadirJblX.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirJblX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirJblX.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirJblX.setText("AÑADIR AL CARRITO");
        btnAñadirJblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirJblX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirJblXActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnAñadirJblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));

        lblPrecioJblX.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioJblX.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioJblX.setText("$ 82.1");
        pnlAmplificadores.add(lblPrecioJblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 60, -1));

        btnCarrito.setBackground(new java.awt.Color(0, 0, 0));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("CARRITO");
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        pnlAmplificadores.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

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
        pnlAmplificadores.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        lblLinea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 10));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 610, 10));

        lblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        lblFondo2.setText("jLabel23");
        pnlAmplificadores.add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 190, 50));

        lblLinea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 0, 10, 50));

        lblLinea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 10, 380));

        lblLinea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 10, 400));

        lblLinea6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 320, 10));

        lblLinea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 610, 10));

        lblLinea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 400));

        lblLinea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlAmplificadores.add(lblLinea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 10, 400));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        pnlAmplificadores.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        dkpAmplificadores.setLayer(pnlAmplificadores, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpAmplificadoresLayout = new javax.swing.GroupLayout(dkpAmplificadores);
        dkpAmplificadores.setLayout(dkpAmplificadoresLayout);
        dkpAmplificadoresLayout.setHorizontalGroup(
            dkpAmplificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAmplificadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dkpAmplificadoresLayout.setVerticalGroup(
            dkpAmplificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAmplificadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpAmplificadores)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpAmplificadores)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJblXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJblXActionPerformed
     JblXtreme jx = new JblXtreme();
     dkpAmplificadores.add(jx);
     jx.setVisible(true);
    }//GEN-LAST:event_btnJblXActionPerformed

    private void btnRodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRodeActionPerformed
     MicrofonoRode mr = new MicrofonoRode();
     dkpAmplificadores.add(mr);
     mr.setVisible(true);
    }//GEN-LAST:event_btnRodeActionPerformed

    private void btnMarshalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarshalActionPerformed
     MarshalMs4 ms4 = new MarshalMs4();
     dkpAmplificadores.add(ms4);
     ms4.setVisible(true);
    }//GEN-LAST:event_btnMarshalActionPerformed

    private void btnJblIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJblIActionPerformed
     JblIrx jbli = new JblIrx();
     dkpAmplificadores.add(jbli);
     jbli.setVisible(true);
    }//GEN-LAST:event_btnJblIActionPerformed

    private void btnShureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShureActionPerformed
     MicrofonoShure ms = new MicrofonoShure();
     dkpAmplificadores.add(ms);
     ms.setVisible(true);
    }//GEN-LAST:event_btnShureActionPerformed

    private void btnAñadirBoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirBoseActionPerformed
     int id = 200;
     String nombre = "";
     String tipo = "Altavoz Companion 50";
     String marca = "Bose";
     double precio = 99.9;

     Amplificador bs = new Amplificador(id, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

         
     // Verificar si el amplificador ya está en el carrito
     boolean AmplificadorYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {AmplificadorYaEnCarrito = true;
              break;}}

     if (!AmplificadorYaEnCarrito) 
         {// El amplificador no está en el carrito, agregarlo
         caD.agregarA(bs);
         Object[] rowData = {nombre,bs.getTipo(), bs.getMarca(), bs.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Altavoz agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El amplificador ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}           
    }//GEN-LAST:event_btnAñadirBoseActionPerformed

    private void btnBoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoseActionPerformed
     Bose bs = new Bose();
     dkpAmplificadores.add(bs);
     bs.setVisible(true);
    }//GEN-LAST:event_btnBoseActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
     vc.actualizarTabla();
     vc.setVisible(true);
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     VentanaPrincipal vp = new VentanaPrincipal();
     vp.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAñadirShureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirShureActionPerformed
     int id = 255;
     String nombre = "";
     String tipo = "Microfono Cardioide PGA58";
     String marca = "Shure";
     double precio = 82.5;
     Amplificador sh = new Amplificador(id, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean AmplificadorYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";
          String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
          String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {AmplificadorYaEnCarrito = true;
              break;}}

     if (!AmplificadorYaEnCarrito) 
         {caD.agregarA(sh);
         Object[] rowData = {nombre,sh.getTipo(), sh.getMarca(), sh.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Microfono Shure agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El amplificador ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}   
    }//GEN-LAST:event_btnAñadirShureActionPerformed

    private void btnAñadirJblIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirJblIActionPerformed
     int id = 210;
     String nombre = "";
     String tipo = "Parlante IRX 108bt";
     String marca = "JBL";
     double precio = 110.0;
     Amplificador jb = new Amplificador(id, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean AmplificadorYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {AmplificadorYaEnCarrito = true;
              break;}}

     if (!AmplificadorYaEnCarrito) 
         {caD.agregarA(jb);
          Object[] rowData = {nombre,jb.getTipo(), jb.getMarca(), jb.getPrecio()};
          modeloCarrito.addRow(rowData);
          vc.actualizarTabla();
          vc.actualizarTablat();
          JOptionPane.showMessageDialog(this, "Parlante agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El amplificador ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}   
    }//GEN-LAST:event_btnAñadirJblIActionPerformed

    private void btnAñadirMarshalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirMarshalActionPerformed
     int id = 205;
     String nombre = "";
     String tipo = "Amplificador MS-4";
     String marca = "Marshal";
     double precio = 203.6;

     Amplificador ma = new Amplificador(id, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

    
     boolean AmplificadorYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

          String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
          String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
         {AmplificadorYaEnCarrito = true;
         break;}}

     if (!AmplificadorYaEnCarrito) 
         {caD.agregarA(ma);
         Object[] rowData = {nombre,ma.getTipo(), ma.getMarca(), ma.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Amplificador agregado al carrito");}
      else {JOptionPane.showMessageDialog(this, "El amplificador ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}   
    }//GEN-LAST:event_btnAñadirMarshalActionPerformed

    private void btnAñadirRodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirRodeActionPerformed
     int id = 276;
     String nombre = "";
     String tipo = "Microfono NT1";
     String marca = "Rode";
     double precio = 77.8;

     Amplificador rd = new Amplificador(id, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean AmplificadorYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {AmplificadorYaEnCarrito = true;
              break;}}

     if (!AmplificadorYaEnCarrito) 
         {caD.agregarA(rd);
          Object[] rowData = {nombre,rd.getTipo(), rd.getMarca(), rd.getPrecio()};
          modeloCarrito.addRow(rowData);
          vc.actualizarTabla();
          vc.actualizarTablat();
          JOptionPane.showMessageDialog(this, "Microfono Rode agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El amplificador ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}   
    }//GEN-LAST:event_btnAñadirRodeActionPerformed

    private void btnAñadirJblXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirJblXActionPerformed
     int id = 236;
     String nombre = "";
     String tipo = "Parlante Portatil Xtreme2";
     String marca = "JBL";
     double precio = 82.1;

     Amplificador jl = new Amplificador(id, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean AmplificadorYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
          {AmplificadorYaEnCarrito = true;
         break;}}

     if (!AmplificadorYaEnCarrito) 
         {caD.agregarA(jl);
          Object[] rowData = {nombre,jl.getTipo(), jl.getMarca(), jl.getPrecio()};
          modeloCarrito.addRow(rowData);
          vc.actualizarTabla();
          vc.actualizarTablat();
          JOptionPane.showMessageDialog(this, "Parlante Xtreme2 agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El amplificador ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}   
    }//GEN-LAST:event_btnAñadirJblXActionPerformed

 
 public static void main(String args[]) 
     {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
             {if ("Nimbus".equals(info.getName())) 
                 {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;}}} 
       catch (ClassNotFoundException ex) 
         {java.util.logging.Logger.getLogger(VentanaAmplificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (InstantiationException ex) 
         {java.util.logging.Logger.getLogger(VentanaAmplificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
       catch (IllegalAccessException ex) 
         {java.util.logging.Logger.getLogger(VentanaAmplificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
       catch (javax.swing.UnsupportedLookAndFeelException ex) 
         {java.util.logging.Logger.getLogger(VentanaAmplificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
       

     java.awt.EventQueue.invokeLater(new Runnable() 
         {public void run() 
             {new VentanaAmplificadores().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAñadirBose;
    private javax.swing.JButton btnAñadirJblI;
    private javax.swing.JButton btnAñadirJblX;
    private javax.swing.JButton btnAñadirMarshal;
    private javax.swing.JButton btnAñadirRode;
    private javax.swing.JButton btnAñadirShure;
    private javax.swing.JButton btnBose;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnJblI;
    private javax.swing.JButton btnJblX;
    private javax.swing.JButton btnMarshal;
    private javax.swing.JButton btnRode;
    private javax.swing.JButton btnShure;
    private javax.swing.JDesktopPane dkpAmplificadores;
    private javax.swing.JLabel lblBose;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblJblI;
    private javax.swing.JLabel lblJblX;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLinea4;
    private javax.swing.JLabel lblLinea5;
    private javax.swing.JLabel lblLinea6;
    private javax.swing.JLabel lblLinea7;
    private javax.swing.JLabel lblLinea8;
    private javax.swing.JLabel lblLinea9;
    private javax.swing.JLabel lblMarshal;
    private javax.swing.JLabel lblPrecioBose;
    private javax.swing.JLabel lblPrecioJblI;
    private javax.swing.JLabel lblPrecioJblX;
    private javax.swing.JLabel lblPrecioMarshal;
    private javax.swing.JLabel lblPrecioRode;
    private javax.swing.JLabel lblPrecioShure;
    private javax.swing.JLabel lblRode;
    private javax.swing.JLabel lblShure;
    private javax.swing.JPanel pnlAmplificadores;
    // End of variables declaration//GEN-END:variables
}
