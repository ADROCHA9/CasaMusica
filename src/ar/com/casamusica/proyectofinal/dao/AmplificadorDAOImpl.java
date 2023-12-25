
package ar.com.casamusica.proyectofinal.dao;
import ar.com.casamusica.proyectofinal.entities.Amplificador;
import ar.com.casamusica.proyectofinal.interfaces.AmplificadorDAO;
import java.util.ArrayList;
import java.util.List;
import ar.com.casamusica.proyectofinal.connectors.Conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



public class AmplificadorDAOImpl implements AmplificadorDAO 
 {@Override
 public List<Amplificador> consultarAmplificadores() 
     {Connection unaConexion = null;
     
     
      List<Amplificador> lista = new ArrayList<>();
     
      
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
      
     
     String unaConsulta = "Select * from Amplificadores";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Amplificador no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {while (unResultado.next())
             {System.out.println("ID: " + unResultado.getInt("id"));
              System.out.println("Tipo: " + unResultado.getString("tipo"));
              System.out.println("Marca: " + unResultado.getString("marca"));
              System.out.println("Precio: " + unResultado.getDouble("precio"));
              System.out.println("---------------------------------------------------------------------------------------------------------------");}} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     return lista;}
 
 
 
 @Override
 public void consultarAmplificador(int idAmplificador) 
     {Connection unaConexion = null;
     
     
      List<Amplificador> lista = new ArrayList<>();
      
        
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex); }
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from amplificadores where id = " + idAmplificador;
     
     
     Statement unaSentencia = null;
        
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
     ResultSet unResultado = null;
        
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Amplificador no encontrado", ex);}
         catch (Exception ex) {
             Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
    
     
     try {if (unResultado.next()) 
             {System.out.println("ID: " + unResultado.getInt("id"));
              System.out.println("Tipo: " + unResultado.getString("tipo"));
              System.out.println("Marca: " + unResultado.getString("marca"));
              System.out.println("Precio: " + unResultado.getDouble("precio"));}}
         catch (SQLException ex) {
            Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);
        }
         catch (Exception ex) 
         {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
        catch (SQLException ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}}
 
 

 @Override
 public ArrayList<Amplificador> cargarlista() 
     {ArrayList<Amplificador> lista = new ArrayList<Amplificador>();
     
     
      Connection unaConexion = null;
        
      
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);}
         catch (IllegalAccessException ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
        String unaConsulta = "Select * from amplificadores";
        
        
        Statement unaSentencia = null;
        
        
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
        ResultSet unResultado = null;
        
        
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Cliente no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
             {int id = unResultado.getInt("id");
              String tipo = unResultado.getString("tipo");
              String marca = unResultado.getString("marca");
              double precio = unResultado.getDouble("precio");
              
              
              Amplificador amplificador = new Amplificador(id, tipo, marca, precio);
              lista.add(amplificador);}} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
 
     return lista;}
 
 

 @Override
 public void eliminar(int idA) 
     {Connection unaConexion = null;
     
        
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);}
         catch (IllegalAccessException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaEliminacion = "delete from amplificadores where id = ?";
        
        
     PreparedStatement unaSentencia = null;
        
        
     try {unaSentencia = unaConexion.prepareStatement(unaEliminacion);}
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1, idA);} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Eliminacion Correcta:)");
     
        
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);} }

 
 
 
 @Override
 public void agregar(Amplificador a)
     {Connection unaConexion = null;
        
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             { Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
      
        
     String unaInsercion = "insert into amplificadores(id,tipo,marca,precio) values (?,?,?,?)";
     
        
     PreparedStatement unaSentencia = null;
     
        
     try {unaSentencia = unaConexion.prepareStatement(unaInsercion);}
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);} 
     
        
     try {unaSentencia.setInt(1,a.getId());} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
     try {unaSentencia.setString(2,a.getTipo());}
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(3,a.getMarca());} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setDouble(4,a.getPrecio());} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex)
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
        System.out.println("Amplificador Correcto");
        
        
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
         {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);} }    
 }
