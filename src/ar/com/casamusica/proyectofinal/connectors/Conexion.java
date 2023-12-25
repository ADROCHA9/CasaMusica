
package ar.com.casamusica.proyectofinal.connectors;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion 
{public static Connection obtenerConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
     {String driver = "com.mysql.cj.jdbc.Driver";
        
      String conexion = "jdbc:mysql://127.0.0.1:3306/casamusica";
        
      String usuario = "root";
        
      String clave = "";
                 
      Class.forName(driver).newInstance();
        
     return DriverManager.getConnection(conexion,usuario,clave);}
}
