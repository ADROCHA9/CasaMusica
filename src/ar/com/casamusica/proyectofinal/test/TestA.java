
package ar.com.casamusica.proyectofinal.test;
import ar.com.casamusica.proyectofinal.entities.Amplificador;
import ar.com.casamusica.proyectofinal.dao.AmplificadorDAOImpl;
import java.sql.SQLException;
import java.util.Scanner;


public class TestA 
 {public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception
     {
         //Amplificador a = new Amplificador(7, "Microfono", "Blue");
         //System.out.println(a);
         AmplificadorDAOImpl a = new AmplificadorDAOImpl();
         //System.out.println("Consultar Amplificadores");
         //a.consultarAmplificadores();
         //a.consultarAmplificador(5);
         //a.cargarlista();
         //System.out.println("Insercion");
         //Scanner lector = new Scanner(System.in);
            
         //System.out.println("ingrese el id del amplificador");
         //int id = lector.nextInt();
            
         //System.out.println("ingrese el tipo de amplificador: ");
         //String tipo = lector.next();
            
         //System.out.println("ingrese la marca del amplificador: ");
         //String marca = lector.next();
            
         //Amplificador am = new Amplificador(id, tipo, marca);
             
         //a.agregar(am);
         //a.consultarAmplificadores();
         //System.out.println("Insercion correcta");

         System.out.println("Eliminacion");
         Scanner lector = new Scanner(System.in);
            
         System.out.println("ingrese el id a eliminar: ");
         int idA = lector.nextInt();
                       
         a.eliminar(idA);
         a.consultarAmplificadores();
         System.out.println("Eliminacion correcta");
     
     }
}
