
package ar.com.casamusica.proyectofinal.test;

import ar.com.casamusica.proyectofinal.dao.CarritoDAOImpl;
import ar.com.casamusica.proyectofinal.entities.Carrito;
import java.util.Scanner;


public class TestCt {
    public static void main(String[] args) {
        CarritoDAOImpl caD = new CarritoDAOImpl();
//          Carrito c = new Carrito(120, "guitarra", "Acustica", "Ginson", 123.7, 0);
 //      System.out.println(c);
//       
//        
//       caD.consultar();
//        caD.cargarlista();

//          
//            System.out.println("Insercion");
//            Scanner lector = new Scanner(System.in);
//            
//            System.out.println("ingrese el id: ");
//            int id = lector.nextInt();
//            
//            System.out.println("ingrese el nombre: ");
//            String nombre = lector.next();
//            
//            System.out.println("ingrese el tipo: ");
//            String tipo = lector.next();
//            
//            System.out.println("ingrese la marca: ");
//            String marca = lector.next();
//            
//            System.out.println("ingrese el precio: ");
//            double precio = lector.nextDouble();
//            
//            System.out.println("ingrese total: ");
//            double total = lector.nextDouble();
//            
//           
//           Carrito ca = new Carrito(id, nombre, tipo, marca, precio, total);
//             
//
//            caD.agregar(ca);
//            caD.consultar();
//            System.out.println("Insercion correcta");
//
//        System.out.println("----------------------------------------------------------------------------------------");
//
//            System.out.println("Eliminacion");
//            Scanner lector = new Scanner(System.in);
//            
//            System.out.println("ingrese el id a elimnar: ");
//            int id = lector.nextInt();
//            
//            
//            caD.eliminar(id);
//            caD.consultar();

//            System.out.println("Eliminacion correcta");

         System.out.println("Total");

            caD.total();
            
            caD.eliminarTodo();
            
            caD.total();
            
//            System.out.println("Eliminacion correcta");

    }

}
