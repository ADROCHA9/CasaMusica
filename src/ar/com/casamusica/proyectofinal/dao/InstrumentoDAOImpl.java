
package ar.com.casamusica.proyectofinal.dao;
import ar.com.casamusica.proyectofinal.entities.Instrumento;
import ar.com.casamusica.proyectofinal.interfaces.InstrumentoDAO;
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


public class InstrumentoDAOImpl implements InstrumentoDAO{

 @Override
 public List<Instrumento> consultarIntrumentos() 
     {Connection unaConexion = null;
     
     
     List<Instrumento> lista = new ArrayList<>();
     
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from instrumentos";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Instrumento no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
        
     try {while (unResultado.next())
             {System.out.println("ID: " + unResultado.getInt("id"));
              System.out.println("Nombre: " + unResultado.getString("nombre"));
              System.out.println("Tipo: " + unResultado.getString("tipo"));
              System.out.println("Marca: " + unResultado.getString("marca"));
              System.out.println("Precio: " + unResultado.getDouble("precio"));
              System.out.println("---------------------------------------------------------------------------------------------------------------");}} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     return lista;}

 
 
 @Override
 public void consultarIntrumento(int idInstrumento) 
     {Connection unaConexion = null;
      
     List<Instrumento> lista = new ArrayList<>();
        
     
     try {unaConexion = Conexion.obtenerConexion();}
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);}
         catch (IllegalAccessException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from instrumentos where id: '" +idInstrumento+"'";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Instrumento no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {if (unResultado.next()) 
             {System.out.println("ID: " + unResultado.getInt("id"));
              System.out.println("Nombre: " + unResultado.getString("nombre"));
              System.out.println("Tipo: " + unResultado.getString("tipo"));
              System.out.println("Marca: " + unResultado.getString("marca"));
              System.out.println("Precio: " + unResultado.getDouble("precio"));} } 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

 
 
 @Override
 public ArrayList<Instrumento> cargarlista() 
     {ArrayList<Instrumento> lista = new ArrayList<Instrumento>();
     
     
     Connection unaConexion = null;
        
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from instrumentos";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
        
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Cliente no encontrado", ex);} 
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
             {int id = unResultado.getInt("id");
              String nombre = unResultado.getString("nombre");         
              String tipo = unResultado.getString("tipo");
              String marca = unResultado.getString("marca");
              double precio = unResultado.getDouble("precio");
              
              
              Instrumento instrumento = new Instrumento(id, nombre, tipo, marca, precio);
              lista.add(instrumento);}} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
 
     
     return lista;}

 
 
 @Override
 public void eliminar(int id) 
     {Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaEliminacion = "delete from instrumentos where id = ?";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaEliminacion);}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1, id);}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Eliminacion Correcta:)");
     
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

 
 
 @Override
 public void agregar(Instrumento i) 
     {Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}   
     
     
     String unaInsercion = "insert into instrumentos(id,nombre,tipo,marca,precio) values (?,?,?,?,?)";
        
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaInsercion);} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1,i.getId());} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(2,i.getNombre());} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(3,i.getTipo());} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(4,i.getMarca());}
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setDouble(5,i.getPrecio());} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Instrumento Correcto");
     
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(InstrumentoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }
    
}
