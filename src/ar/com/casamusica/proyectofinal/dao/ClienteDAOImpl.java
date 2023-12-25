
package ar.com.casamusica.proyectofinal.dao;
import ar.com.casamusica.proyectofinal.interfaces.ClienteDAO;
import ar.com.casamusica.proyectofinal.entities.Cliente;
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


public class ClienteDAOImpl implements ClienteDAO{

 @Override
 public List<Cliente> consultarClientes() 
     {Connection unaConexion = null;
     
      List<Cliente> lista = new ArrayList<>();
     
      
     try {unaConexion = Conexion.obtenerConexion();}
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
         {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from clientes";
         
         
     Statement unaSentencia = null;
        
         
     try {unaSentencia = (Statement) unaConexion.createStatement();} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
        
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Cliente no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
             {System.out.println("Nombre: " + unResultado.getString("nombre"));
              System.out.println("DNI: " + unResultado.getInt("dni"));
              System.out.println("Telefono: " + unResultado.getInt("telefono"));
              System.out.println("Mail: " + unResultado.getString("email"));
              System.out.println("Direccion: " + unResultado.getString("direccion"));
              System.out.println("---------------------------------------------------------------------------------------------------------------");}} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     return lista;}
 
 

 @Override
 public void consultarCliente(int dni) 
     {Connection unaConexion = null;
     
     
      List<Cliente> lista = new ArrayList<>();
      
      
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from clientes where dni: '" +dni+"'";
     
     
     Statement unaSentencia = null;
     
        
     try {unaSentencia = (Statement) unaConexion.createStatement();} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Cliente no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {if (unResultado.next()) 
             {System.out.println("Nombre: " + unResultado.getString("nombre"));
              System.out.println("DNI: " + unResultado.getInt("dni"));
              System.out.println("Telefono: " + unResultado.getInt("telefono"));
              System.out.println("Mail: " + unResultado.getString("email"));
              System.out.println("Direccion: " + unResultado.getString("direccion"));}} 
         catch (SQLException ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(PedidoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

 
 
 @Override
 public ArrayList<Cliente> cargarlista() 
     {ArrayList<Cliente> lista = new ArrayList<Cliente>();
     
     
     Connection unaConexion = null;
     
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from clientes";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Cliente no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
             {String nombre = unResultado.getString("nombre");
              int DNI = unResultado.getInt("dni");
              int telefono = unResultado.getInt("telefono");
              String mail = unResultado.getString("email");
              String direccion = unResultado.getString("direccion");
              
              
             Cliente cliente = new Cliente(nombre, DNI, telefono, mail, direccion);
             lista.add(cliente);}} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
 
     
     return lista;}

 
 
 @Override
 public void eliminar(int cliente_DNI) 
     {Connection unaConexion = null;
     
        
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaEliminacion = "delete from clientes where dni = ?";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaEliminacion);}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1, cliente_DNI);}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Eliminacion Correcta:)");
     
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

 
 
 @Override
 public void agregar(Cliente c) 
     {Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);}
         catch (InstantiationException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);}
         catch (IllegalAccessException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaInsercion = "insert into clientes(nombre,dni,telefono,email,direccion) values (?,?,?,?,?)";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaInsercion);}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setString(1,c.getNombrec());}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setInt(2,c.getDNI());}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setInt(3,c.getTelefono());}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(4,c.getEmail());}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     try {unaSentencia.setString(5,c.getDireccion());}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
     try {unaSentencia.execute();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Cliente Correcto");
     
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }
}
