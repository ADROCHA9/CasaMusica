
package ar.com.casamusica.proyectofinal.gui.inicio.principal;


import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

public class GestorVentanas 
 {private static final List<JFrame> ventanasAbiertas = new ArrayList<>();

 public static void agregarVentana(JFrame ventana) 
     {ventanasAbiertas.add(ventana);}

 public static void cerrarVentanas() 
     {for (JFrame ventana : ventanasAbiertas) 
         {ventana.dispose();}
     ventanasAbiertas.clear();}}
