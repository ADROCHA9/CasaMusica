
package ar.com.casamusica.proyectofinal.dao;

import ar.com.casamusica.proyectofinal.connectors.Conexion;
import ar.com.casamusica.proyectofinal.entities.Pedido;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import ar.com.casamusica.proyectofinal.interfaces.PedidoDAO;

public class PedidoDAOImpl implements PedidoDAO {

 @Override
 public List<Pedido> consultarPedidos() 
     {Connection unaConexion = null;
     
     
     List<Pedido> lista = new ArrayList<>();
     
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from pedidos";
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
             {System.out.println("#Pedido: " + unResultado.getInt("id_pedido"));
             System.out.println("Nombre: " + unResultado.getString("cliente_nombre"));
             System.out.println("DNI: " + unResultado.getInt("cliente_dni"));
             System.out.println("idInstrumento: " + unResultado.getInt("id_instrumento"));
             System.out.println("idAmplificador: " + unResultado.getInt("id_Amplificador"));
             System.out.println("---------------------------------------------------------------------------------------------------------------");}} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     return lista;}

 
 
 @Override
 public void consultarPedido(int idPedido) 
     {Connection unaConexion = null;
      
     
     List<Pedido> lista = new ArrayList<>();
     
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from pedidos where id_pedido = " +idPedido;
     
     
     Statement unaSentencia = null;
        
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {if (unResultado.next()) 
             {System.out.println("#Pedido: " + unResultado.getInt("id_pedido"));
              System.out.println("Nombre: " + unResultado.getString("cliente_nombre"));
              System.out.println("DNI: " + unResultado.getInt("cliente_dni"));
              System.out.println("idInstrumento: " + unResultado.getInt("id_instrumento"));
              System.out.println("idAmplificador: " + unResultado.getInt("id_Amplificador"));}} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

 
 
 @Override
 public ArrayList<Pedido> cargarlista() 
     {ArrayList<Pedido> lista = new ArrayList<Pedido>();
       
     
     Connection unaConexion = null;
        
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex)
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}   
     
     
     String unaConsulta = "Select * from pedidos";
    
     
     Statement unaSentencia = null;
        
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
            { int id = unResultado.getInt("id_pedido");
              String nombre = unResultado.getString("cliente_nombre");
              int DNI = unResultado.getInt("cliente_dni");
              int idInstrumento = unResultado.getInt("id_instrumento");
              int idAmplificador = unResultado.getInt("id_amplificador");
              
              Pedido pedido = new Pedido(id, nombre, DNI, idInstrumento, idAmplificador);
              lista.add(pedido);}} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
 
     
     return lista;}

 
 
 @Override
 public void eliminar(int idPedido) 
     {Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     String unaEliminacion = "delete from pedidos where id_pedido = ?";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaEliminacion);}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1, idPedido);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Eliminacion Correcta:)");
     
     
     try {unaConexion.close();} 
         catch (SQLException ex)
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

 
 
 @Override
 public void agregar(Pedido p) 
     {Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE,"Pedido no encontrado", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaInsercion = "insert into pedidos values (?,?,?,?,?)";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaInsercion);} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1,p.getId_pedido());} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setString(2,p.getCliente_nombre());}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(3,p.getCliente_DNI());} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(4,p.getId_instrumento());} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(5,p.getId_amplificador());} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();}
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Pedido Correcto");
     
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}        
    }

   

   

   
   
    
    

}
