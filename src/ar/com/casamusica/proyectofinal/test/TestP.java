
package ar.com.casamusica.proyectofinal.test;
import ar.com.casamusica.proyectofinal.entities.Pedido;
import ar.com.casamusica.proyectofinal.dao.PedidoDAOImpl;
import java.util.Scanner;
import java.sql.SQLException;

public class TestP 
 {public static void main(String[] args) 
     {System.out.println("pedido");
     //Pedido p = new Pedido(1, "Carlos", 34562345, 12, 5);
     // System.out.println(p);
     PedidoDAOImpl p = new PedidoDAOImpl();    
     //System.out.println("Consultar Pedidos:");
     //p.consultarPedidos();
     //System.out.println("Consultar Pedido");
     //p.consultarPedido(3);
     // p.cargarlista();
     
//     System.out.println("Insercion");
//     Scanner lector = new Scanner(System.in);
//            
//     System.out.println("ingrese el id del pedido: ");
//     int id = lector.nextInt();
//            
//     System.out.println("ingrese el nombre del cliente: ");
//     String nombre = lector.next();
//            
//     System.out.println("ingrese el DNI cliente: ");
//     int dni = lector.nextInt();
//     
//     System.out.println("ingrese id instrumento: ");
//     int idI = lector.nextInt();
//     
//     System.out.println("ingrese id amplificador: ");
//     int idA = lector.nextInt();
//     
//     Pedido pe = new Pedido(id,nombre,dni,idI,idA);
//     p.agregar(pe);
//     p.consultarPedidos();
//     System.out.println("Pedido ingresado");
     
     
      System.out.println("Eliminacion");
         Scanner lector = new Scanner(System.in);
            
         System.out.println("ingrese el id a eliminar: ");
         int id = lector.nextInt();
                       
         p.eliminar(id);
         p.consultarPedidos();
         System.out.println("Eliminacion correcta");
     }
}
