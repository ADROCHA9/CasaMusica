package ar.com.casamusica.proyectofinal.gui.inicio.principal.instrumentos;

import ar.com.casamusica.proyectofinal.entities.Instrumento;
import ar.com.casamusica.proyectofinal.gui.principal.carrito.VentanaCarrito;
import ar.com.casamusica.proyectofinal.dao.CarritoDAOImpl;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.GestorVentanas;
import ar.com.casamusica.proyectofinal.gui.inicio.principal.VentanaPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaInstrumentos extends javax.swing.JFrame 
 {protected DefaultTableModel modeloCarrito;
  DefaultTableModel ModeloCarrito = new DefaultTableModel();
  VentanaCarrito vc = new VentanaCarrito();
  CarritoDAOImpl caD = new CarritoDAOImpl();
    
  public VentanaInstrumentos() 
     {super("INSTRUMENTOS");
      initComponents();
      GestorVentanas.agregarVentana(this);
      this.setResizable(false);
      this.setDefaultCloseOperation(VentanaInstrumentos.DO_NOTHING_ON_CLOSE);
      this.setLocationRelativeTo(this);}

    
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpInstrumentos = new javax.swing.JDesktopPane();
        pnlInstrumentos = new javax.swing.JPanel();
        lblTeclado = new javax.swing.JLabel();
        btnTeclado = new javax.swing.JButton();
        btnAñadirTeclado = new javax.swing.JButton();
        lblPrecioTeclado = new javax.swing.JLabel();
        lblBateria = new javax.swing.JLabel();
        btnBateria = new javax.swing.JButton();
        btnAñadirBateria = new javax.swing.JButton();
        lblPrecioBateria = new javax.swing.JLabel();
        lblBombo = new javax.swing.JLabel();
        btnBombo = new javax.swing.JButton();
        btnAñadirBombo = new javax.swing.JButton();
        lblPrecioBombo = new javax.swing.JLabel();
        lblGuitarraA = new javax.swing.JLabel();
        btnGuitarraA = new javax.swing.JButton();
        btnAñadirGuitarraA = new javax.swing.JButton();
        lblPrecioGuitarraA = new javax.swing.JLabel();
        lblGuitarraE = new javax.swing.JLabel();
        btnGuitarraE = new javax.swing.JButton();
        btnAñadirGuitarraE = new javax.swing.JButton();
        lblPrecioGuitarraE = new javax.swing.JLabel();
        lblViolin = new javax.swing.JLabel();
        btnViolin = new javax.swing.JButton();
        btnAñadirViolin = new javax.swing.JButton();
        lblPrecioViolin = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblLinea1 = new javax.swing.JLabel();
        lblLinea2 = new javax.swing.JLabel();
        lblLinea3 = new javax.swing.JLabel();
        lblLinea4 = new javax.swing.JLabel();
        lblLinea5 = new javax.swing.JLabel();
        lblLinea6 = new javax.swing.JLabel();
        lblLinea7 = new javax.swing.JLabel();
        lblLinea8 = new javax.swing.JLabel();
        lblLinea9 = new javax.swing.JLabel();
        lblLinea10 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlInstrumentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTeclado.setForeground(new java.awt.Color(0, 0, 0));
        lblTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/teclado.jpg"))); // NOI18N
        lblTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInstrumentos.add(lblTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 140, 130));

        btnTeclado.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTeclado.setForeground(new java.awt.Color(255, 255, 255));
        btnTeclado.setText("TECLADO ARRANJADOR ROLAND EX20");
        btnTeclado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecladoActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, 40));

        btnAñadirTeclado.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirTeclado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirTeclado.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirTeclado.setText("AÑADIR AL CARRITO");
        btnAñadirTeclado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirTecladoActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnAñadirTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));

        lblPrecioTeclado.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioTeclado.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioTeclado.setText("$ 115.7");
        pnlInstrumentos.add(lblPrecioTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 60, -1));

        lblBateria.setForeground(new java.awt.Color(0, 0, 0));
        lblBateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/bateria.jpg"))); // NOI18N
        lblBateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInstrumentos.add(lblBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 140, 130));

        btnBateria.setBackground(new java.awt.Color(0, 0, 0));
        btnBateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBateria.setForeground(new java.awt.Color(255, 255, 255));
        btnBateria.setText("BATERIA PEARL EXPORT EXX725");
        btnBateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBateriaActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, 40));

        btnAñadirBateria.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirBateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirBateria.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirBateria.setText("AÑADIR AL CARRITO");
        btnAñadirBateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirBateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirBateriaActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnAñadirBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        lblPrecioBateria.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioBateria.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioBateria.setText("$ 146.0");
        pnlInstrumentos.add(lblPrecioBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 60, -1));

        lblBombo.setForeground(new java.awt.Color(0, 0, 0));
        lblBombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/bassDrum.jpg"))); // NOI18N
        lblBombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInstrumentos.add(lblBombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 140, 130));

        btnBombo.setBackground(new java.awt.Color(0, 0, 0));
        btnBombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBombo.setForeground(new java.awt.Color(255, 255, 255));
        btnBombo.setText("BOMBO MAXTONE 24\"");
        btnBombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBomboActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnBombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, 40));

        btnAñadirBombo.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirBombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirBombo.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirBombo.setText("AÑADIR AL CARRITO");
        btnAñadirBombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirBombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirBomboActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnAñadirBombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        lblPrecioBombo.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioBombo.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioBombo.setText("$ 139.9");
        pnlInstrumentos.add(lblPrecioBombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 60, -1));

        lblGuitarraA.setForeground(new java.awt.Color(0, 0, 0));
        lblGuitarraA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/guitarraAcustica.jpg"))); // NOI18N
        lblGuitarraA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInstrumentos.add(lblGuitarraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 130));

        btnGuitarraA.setBackground(new java.awt.Color(0, 0, 0));
        btnGuitarraA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuitarraA.setForeground(new java.awt.Color(255, 255, 255));
        btnGuitarraA.setText("GUITARRA ACUSTICA  YAMAHA F310TBS");
        btnGuitarraA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuitarraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuitarraAActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnGuitarraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, 40));

        btnAñadirGuitarraA.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirGuitarraA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirGuitarraA.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirGuitarraA.setText("AÑADIR AL CARRITO");
        btnAñadirGuitarraA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirGuitarraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirGuitarraAActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnAñadirGuitarraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        lblPrecioGuitarraA.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioGuitarraA.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioGuitarraA.setText("$ 125.5");
        pnlInstrumentos.add(lblPrecioGuitarraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, -1));

        lblGuitarraE.setForeground(new java.awt.Color(0, 0, 0));
        lblGuitarraE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/guitarraElectrica.jpg"))); // NOI18N
        lblGuitarraE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInstrumentos.add(lblGuitarraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 130));

        btnGuitarraE.setBackground(new java.awt.Color(0, 0, 0));
        btnGuitarraE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuitarraE.setForeground(new java.awt.Color(255, 255, 255));
        btnGuitarraE.setText("GUITARRA ELECTRICA GIBSON ES335");
        btnGuitarraE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuitarraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuitarraEActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnGuitarraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 40));

        btnAñadirGuitarraE.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirGuitarraE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirGuitarraE.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirGuitarraE.setText("AÑADIR AL CARRITO");
        btnAñadirGuitarraE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirGuitarraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirGuitarraEActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnAñadirGuitarraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        lblPrecioGuitarraE.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioGuitarraE.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioGuitarraE.setText("$ 150.0");
        pnlInstrumentos.add(lblPrecioGuitarraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 60, -1));

        lblViolin.setForeground(new java.awt.Color(0, 0, 0));
        lblViolin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/instrumentos/violin.jpg"))); // NOI18N
        lblViolin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInstrumentos.add(lblViolin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 130));

        btnViolin.setBackground(new java.awt.Color(0, 0, 0));
        btnViolin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViolin.setForeground(new java.awt.Color(255, 255, 255));
        btnViolin.setText("VIOLIN YAMAHA V10Y");
        btnViolin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViolin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViolinActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnViolin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 40));

        btnAñadirViolin.setBackground(new java.awt.Color(0, 0, 0));
        btnAñadirViolin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirViolin.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirViolin.setText("AÑADIR AL CARRITO");
        btnAñadirViolin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirViolin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirViolinActionPerformed(evt);
            }
        });
        pnlInstrumentos.add(btnAñadirViolin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        lblPrecioViolin.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecioViolin.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioViolin.setText("$ 166.4");
        pnlInstrumentos.add(lblPrecioViolin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 60, -1));

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
        pnlInstrumentos.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

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
        pnlInstrumentos.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        lblLinea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 10));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 610, 10));

        lblLinea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 0, 10, 50));

        lblLinea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 190, 10));

        lblLinea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 10, 380));

        lblLinea6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 10, 400));

        lblLinea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 320, 10));

        lblLinea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 610, 10));

        lblLinea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 10, 400));

        lblLinea10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        pnlInstrumentos.add(lblLinea10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 400));

        lblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/NEGRO.jpg"))); // NOI18N
        lblFondo2.setText("jLabel23");
        pnlInstrumentos.add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 190, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/casamusica/proyectofinal/picture/fondo/GRIS.jpg"))); // NOI18N
        pnlInstrumentos.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        dtpInstrumentos.setLayer(pnlInstrumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dtpInstrumentosLayout = new javax.swing.GroupLayout(dtpInstrumentos);
        dtpInstrumentos.setLayout(dtpInstrumentosLayout);
        dtpInstrumentosLayout.setHorizontalGroup(
            dtpInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dtpInstrumentosLayout.setVerticalGroup(
            dtpInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpInstrumentos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpInstrumentos)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
     //CarritoDAOImpl c = new CarritoDAOImpl();
     //ArrayList lista = c.cargarlista();
     //for (Object unObjeto : lista) {
     //Carrito ca = (Carrito) unObjeto;
     //Object[] rowData = {ca.getNombre(), ca.getTipo(), ca.getMarca(), ca.getPrecio()};
     //modeloCarrito.addRow(rowData);
     vc.actualizarTabla();
     vc.setVisible(true);
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnAñadirGuitarraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirGuitarraAActionPerformed
     
     //Instrumento ga = new Instrumento(120,"Guitarra", "Acustica", "Yamaha F310TBS",125.5);
     //Object[] rowData = {ga.getNombre(), ga.getTipo(), ga.getMarca(), ga.getPrecio()};
     //ModeloCarrito.addRow(rowData);
     //vc.agregarFila(rowData);

     //Instrumento ga = new Instrumento(120,"Guitarra", "Acustica", "Yamaha F310TBS",125.5);
     //Object[] rowData = {ga.getId(),ga.getNombre(), ga.getTipo(), ga.getMarca(), ga.getPrecio()};
     //DefaultTableModel modeloCarrito = vc.getModeloCarrito();
     //modeloCarrito.addRow(rowData);
     //vc.agregarFila(rowData);


     //int id = 120;
     //String nombre = "Guitarra";
     //String tipo = "Acustica";
     //String marca = "Yamaha F310TBS";
     //double precio = 125.5;
  
     //Instrumento ga = new Instrumento(id, nombre, tipo, marca, precio);
     //CarritoDAOImpl caD = new CarritoDAOImpl();
     //caD.agregarI(ga);
     //Object[] rowData = {ga.getNombre(), ga.getTipo(), ga.getMarca(), ga.getPrecio()};
     //DefaultTableModel modeloCarrito = vc.getModeloCarrito();
     //modeloCarrito.addRow(rowData);
     //vc.actualizarTabla();       
     //vc.actualizarTablat();
     int id = 120;
     String nombre = "Guitarra";
     String tipo = "Acustica";
     String marca = "Yamaha F310TBS";
     double precio = 125.5;

     Instrumento ga = new Instrumento(id, nombre, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     // Verificar si el instrumento ya está en el carrito
     boolean instrumentoYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {instrumentoYaEnCarrito = true;
              break;}}

     if (!instrumentoYaEnCarrito) 
         {// El instrumento no está en el carrito, agregarlo
          caD.agregarI(ga);
          Object[] rowData = {ga.getNombre(), ga.getTipo(), ga.getMarca(), ga.getPrecio()};
          modeloCarrito.addRow(rowData);
          vc.actualizarTabla();
          vc.actualizarTablat();
          JOptionPane.showMessageDialog(this, "Guitarra Acustica agregada al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El instrumento ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}     
    }//GEN-LAST:event_btnAñadirGuitarraAActionPerformed

    private void btnGuitarraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuitarraAActionPerformed
     GuitarraAcustica ga = new GuitarraAcustica();
     dtpInstrumentos.add(ga);
     ga.setVisible(true);
    }//GEN-LAST:event_btnGuitarraAActionPerformed

    private void btnGuitarraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuitarraEActionPerformed
     GuitarraElectrica ge = new GuitarraElectrica();
     dtpInstrumentos.add(ge);
     ge.setVisible(true);
    }//GEN-LAST:event_btnGuitarraEActionPerformed

    private void btnViolinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViolinActionPerformed
     Violin vi = new Violin();
     dtpInstrumentos.add(vi);
     vi.setVisible(true);        
    }//GEN-LAST:event_btnViolinActionPerformed

    private void btnBateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBateriaActionPerformed
     Bateria ba = new Bateria();
     dtpInstrumentos.add(ba);
     ba.setVisible(true);
    }//GEN-LAST:event_btnBateriaActionPerformed

    private void btnBomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBomboActionPerformed
     Bombo bo = new Bombo();
     dtpInstrumentos.add(bo);
     bo.setVisible(true);
    }//GEN-LAST:event_btnBomboActionPerformed

    private void btnTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoActionPerformed
     Teclado te = new Teclado();
     dtpInstrumentos.add(te);
     te.setVisible(true);
    }//GEN-LAST:event_btnTecladoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     VentanaPrincipal vp = new VentanaPrincipal();
     vp.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAñadirGuitarraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirGuitarraEActionPerformed
     int id = 101;
     String nombre = "Guitarra";
     String tipo = "Electrica";
     String marca = "Gibson ES335";
     double precio = 150.0;

     Instrumento ge = new Instrumento(id, nombre, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     
     boolean instrumentoYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {instrumentoYaEnCarrito = true;
              break;}}

     if (!instrumentoYaEnCarrito) 
         {caD.agregarI(ge);
         Object[] rowData = {ge.getNombre(), ge.getTipo(), ge.getMarca(), ge.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Guitarra Electrica agregada al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El instrumento ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAñadirGuitarraEActionPerformed

    private void btnAñadirViolinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirViolinActionPerformed
     int id = 130;
     String nombre = "Violin";
     String tipo = "Barroco";
     String marca = "Yamaha V10Y";
     double precio = 166.4;

     Instrumento vi = new Instrumento(id, nombre, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean instrumentoYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {instrumentoYaEnCarrito = true;
              break;}}

     if (!instrumentoYaEnCarrito) 
         {caD.agregarI(vi);
         Object[] rowData = {vi.getNombre(), vi.getTipo(), vi.getMarca(), vi.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Violin Barroco agregado al carrito");}
      else {JOptionPane.showMessageDialog(this, "El instrumento ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAñadirViolinActionPerformed

    private void btnAñadirBomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirBomboActionPerformed
     int id = 165;
     String nombre = "Bombo";
     String tipo = "24''";
     String marca = "Maxtone";
     double precio = 139.9;

     Instrumento bb = new Instrumento(id, nombre, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean instrumentoYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

         String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
         String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {instrumentoYaEnCarrito = true;
              break;}}

     if (!instrumentoYaEnCarrito) 
         {caD.agregarI(bb);
         Object[] rowData = {bb.getNombre(), bb.getTipo(), bb.getMarca(), bb.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Bombo agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El instrumento ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAñadirBomboActionPerformed

    private void btnAñadirBateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirBateriaActionPerformed
     int id = 125;
     String nombre = "Bateria";
     String tipo = "Export";
     String marca = "Pearl EXX725";
     double precio = 146.7;

     Instrumento bt = new Instrumento(id, nombre, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();
 
     boolean instrumentoYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

          String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
          String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {instrumentoYaEnCarrito = true;
              break;}}

     if (!instrumentoYaEnCarrito) 
         {caD.agregarI(bt);
         Object[] rowData = {bt.getNombre(), bt.getTipo(), bt.getMarca(), bt.getPrecio()};
         modeloCarrito.addRow(rowData);
         vc.actualizarTabla();
         vc.actualizarTablat();
         JOptionPane.showMessageDialog(this, "Bateria Pearl agregada al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El instrumento ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAñadirBateriaActionPerformed

    private void btnAñadirTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirTecladoActionPerformed
     int id = 105;
     String nombre = "Teclado";
     String tipo = "Arranjador";
     String marca = "Roland EX20";
     double precio = 115.7;

     Instrumento tc = new Instrumento(id, nombre, tipo, marca, precio);
     CarritoDAOImpl caD = new CarritoDAOImpl();
     DefaultTableModel modeloCarrito = vc.getModeloCarrito();

     boolean instrumentoYaEnCarrito = false;
     for (int i = 0; i < modeloCarrito.getRowCount(); i++) 
         {Object nombreCarritoObj = modeloCarrito.getValueAt(i, 0);
          String nombreCarrito = (nombreCarritoObj != null) ? nombreCarritoObj.toString() : "";

          String tipoCarrito = modeloCarrito.getValueAt(i, 1).toString();
          String marcaCarrito = modeloCarrito.getValueAt(i, 2).toString();

         if (nombreCarrito.equals(nombre) && tipoCarrito.equals(tipo) && marcaCarrito.equals(marca)) 
             {instrumentoYaEnCarrito = true;
              break;}}

     if (!instrumentoYaEnCarrito) 
         {caD.agregarI(tc);
          Object[] rowData = {tc.getNombre(), tc.getTipo(), tc.getMarca(), tc.getPrecio()};
          modeloCarrito.addRow(rowData);
          vc.actualizarTabla();
          vc.actualizarTablat();
          JOptionPane.showMessageDialog(this, "Teclado agregado al carrito");} 
      else {JOptionPane.showMessageDialog(this, "El instrumento ya está en el carrito", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAñadirTecladoActionPerformed

     public static void main(String args[]) 
         {try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
                 {if ("Nimbus".equals(info.getName())) 
                     {javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;}}} 
          catch (ClassNotFoundException ex) 
             {java.util.logging.Logger.getLogger(VentanaInstrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
          catch (InstantiationException ex) 
             {java.util.logging.Logger.getLogger(VentanaInstrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
          catch (IllegalAccessException ex) 
             {java.util.logging.Logger.getLogger(VentanaInstrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
          catch (javax.swing.UnsupportedLookAndFeelException ex) 
             {java.util.logging.Logger.getLogger(VentanaInstrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        
         java.awt.EventQueue.invokeLater(new Runnable() 
             {public void run() 
                 {new VentanaInstrumentos().setVisible(true);}});
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAñadirBateria;
    private javax.swing.JButton btnAñadirBombo;
    private javax.swing.JButton btnAñadirGuitarraA;
    private javax.swing.JButton btnAñadirGuitarraE;
    private javax.swing.JButton btnAñadirTeclado;
    private javax.swing.JButton btnAñadirViolin;
    private javax.swing.JButton btnBateria;
    private javax.swing.JButton btnBombo;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnGuitarraA;
    private javax.swing.JButton btnGuitarraE;
    private javax.swing.JButton btnTeclado;
    private javax.swing.JButton btnViolin;
    private javax.swing.JDesktopPane dtpInstrumentos;
    private javax.swing.JLabel lblBateria;
    private javax.swing.JLabel lblBombo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblGuitarraA;
    private javax.swing.JLabel lblGuitarraE;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea10;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLinea4;
    private javax.swing.JLabel lblLinea5;
    private javax.swing.JLabel lblLinea6;
    private javax.swing.JLabel lblLinea7;
    private javax.swing.JLabel lblLinea8;
    private javax.swing.JLabel lblLinea9;
    private javax.swing.JLabel lblPrecioBateria;
    private javax.swing.JLabel lblPrecioBombo;
    private javax.swing.JLabel lblPrecioGuitarraA;
    private javax.swing.JLabel lblPrecioGuitarraE;
    private javax.swing.JLabel lblPrecioTeclado;
    private javax.swing.JLabel lblPrecioViolin;
    private javax.swing.JLabel lblTeclado;
    private javax.swing.JLabel lblViolin;
    private javax.swing.JPanel pnlInstrumentos;
    // End of variables declaration//GEN-END:variables
}
