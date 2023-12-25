
package ar.com.casamusica.proyectofinal.dao;

import ar.com.casamusica.proyectofinal.connectors.Conexion;
import ar.com.casamusica.proyectofinal.entities.Amplificador;
import ar.com.casamusica.proyectofinal.entities.Carrito;
import ar.com.casamusica.proyectofinal.entities.Instrumento;
import ar.com.casamusica.proyectofinal.interfaces.CarritoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CarritoDAOImpl implements CarritoDAO{
      


    @Override
    public List<Carrito> consultar() {
     Connection unaConexion = null;
     
     
     List<Carrito> lista = new ArrayList<>();
     
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from carrito";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
     
     try {unResultado = unaSentencia.executeQuery(unaConsulta);}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Carrito no encontrado", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
        
     try {while (unResultado.next())
             {System.out.println("ID: " + unResultado.getInt("id"));
              System.out.println("Nombre: " + unResultado.getString("nombre"));
              System.out.println("Tipo: " + unResultado.getString("tipo"));
              System.out.println("Marca: " + unResultado.getString("marca"));
              System.out.println("Precio: " + unResultado.getDouble("precio"));
              System.out.println("Total: " + unResultado.getDouble("total"));
              System.out.println("---------------------------------------------------------------------------------------------------------------");}} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
        
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     return lista;
    }


    @Override
    public ArrayList<Carrito> cargarlista() {
       ArrayList<Carrito> lista = new ArrayList<Carrito>();
     
     
     Connection unaConexion = null;
        
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaConsulta = "Select * from Carrito";
     
     
     Statement unaSentencia = null;
     
     
     try {unaSentencia = (Statement) unaConexion.createStatement();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     ResultSet unResultado = null;
     
        
     try {unResultado = unaSentencia.executeQuery(unaConsulta);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Cliente no encontrado", ex);} 
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {while (unResultado.next())
             {int id = unResultado.getInt("id");
              String nombre = unResultado.getString("nombre");         
              String tipo = unResultado.getString("tipo");
              String marca = unResultado.getString("marca");
              double precio = unResultado.getDouble("precio");
              
              
              Carrito carrito = new Carrito(id, nombre, tipo, marca, precio, precio);
              lista.add(carrito);}} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
 
     
     return lista;
    }

    @Override
    public void eliminar(double precio) 
    { Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaEliminacion = "delete from carrito where precio = ?";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaEliminacion);}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setDouble(1, precio);}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Eliminacion Correcta:)");
     
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

    @Override
    public void agregarI(Instrumento i) {
       Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}   
     
     
     String unaInsercion = "insert into carrito(id,nombre,tipo,marca,precio,total) values (?,?,?,?,?,0)";
        
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaInsercion);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1,i.getId());} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(2,i.getNombre());} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(3,i.getTipo());} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(4,i.getMarca());}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setDouble(5,i.getPrecio());} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Ingreso Correcto");
     
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

    @Override
    public void agregarA(Amplificador a) {
        Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}   
     
     
     String unaInsercion = "insert into carrito(id,tipo,marca,precio,total) values (?,?,?,?,0)";
        
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaInsercion);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.setInt(1,a.getId());} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     
     try {unaSentencia.setString(2,a.getTipo());} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setString(3,a.getMarca());}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.setDouble(4,a.getPrecio());} 
         catch (SQLException ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
     
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Ingreso Correcto");
     
     
     try {unaConexion.close();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

    @Override
    public double total() {
        
     double totalCarrito = 0.0;

    Connection unaConexion = null;

    try {
        unaConexion = Conexion.obtenerConexion();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
        Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error al obtener la conexión", ex);
    }

    String unaOperacion = "UPDATE carrito SET Total = (SELECT SUM(precio) FROM carrito)";
    String sql = "SELECT Total FROM carrito ORDER BY id DESC LIMIT 1";

    try (PreparedStatement unaSuma = unaConexion.prepareStatement(unaOperacion);
         PreparedStatement unaSentencia = unaConexion.prepareStatement(sql)) {

        // Realizar la actualización de la suma total en la base de datos
        unaSuma.executeUpdate();

        // Obtener el total de la última fila
        try (ResultSet resultSet = unaSentencia.executeQuery()) {
            // Verificar si hay algún resultado
            if (resultSet.next()) {
                totalCarrito = resultSet.getDouble("Total");
                // Mostrar el resultado en la consola
                System.out.println("Total del carrito: " + totalCarrito);
            } else {
                System.out.println("No hay registros en la tabla carrito.");
            }
        }

    } catch (SQLException ex) {
        Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error al ejecutar la consulta", ex);
    }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return totalCarrito;  
 

        }

    @Override
    public void eliminarTodo() {
        Connection unaConexion = null;
      
     
     try {unaConexion = Conexion.obtenerConexion();} 
         catch (ClassNotFoundException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE,"Conexion no encontrada", ex);} 
         catch (InstantiationException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);} 
         catch (IllegalAccessException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Acceso ilegal", ex);} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     String unaEliminacion = "delete from carrito";
     
     
     PreparedStatement unaSentencia = null;
     
     
     try {unaSentencia = unaConexion.prepareStatement(unaEliminacion);}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     try {unaSentencia.execute();} 
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
        
     
     System.out.println("Eliminacion Correcta:)");
     
     
     try {unaConexion.close();}
         catch (SQLException ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Consulta Incorrecta", ex);}
         catch (Exception ex) 
             {Logger.getLogger(CarritoDAOImpl.class.getName()).log(Level.SEVERE, "Error", ex);}
    }

    @Override
    public boolean verificarDNIBaseDatos(int dni) {
         Connection unaConexion = null;

    try {
        unaConexion = Conexion.obtenerConexion();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
        Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error al obtener la conexión", ex);
        return false;
    }

    String unaConsulta = "SELECT * FROM clientes WHERE dni = ?";
    try (PreparedStatement pstmt = unaConexion.prepareStatement(unaConsulta)) {
        pstmt.setInt(1, dni);
        ResultSet rs = pstmt.executeQuery();

        // Devuelve true si hay al menos una fila (es decir, el DNI existe en la base de datos)
        return rs.next();
    } catch (SQLException ex) {
        Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error en la consulta del DNI", ex);
        return false;
    } finally {
        try {
            
           unaConexion.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AmplificadorDAOImpl.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
        }
    }
    }

  
    
    }
    
    
    


