
package ar.com.casamusica.proyectofinal.test;

import ar.com.casamusica.proyectofinal.dao.ClienteDAOImpl;
import ar.com.casamusica.proyectofinal.entities.Cliente;
import java.sql.SQLException;
import java.util.Scanner;

public class TestC {
    public static void main(String[] args) {
        ClienteDAOImpl c = new ClienteDAOImpl();
//        c.consultarClientes();
//        c.consultarCliente(40379153);

//        c.cargarlista();

          
//            System.out.println("Insercion");
//            Scanner lector = new Scanner(System.in);
//            
//            System.out.println("ingrese el nombre del cliente: ");
//            String nombre = lector.next();
//            
//            System.out.println("ingrese el dni del cliente:  ");
//            int dni = lector.nextInt();
//            
//            System.out.println("ingrese el telefono del cliente: ");
//            int telefono = lector.nextInt();
//            
//            System.out.println("ingrese el mail del cliente: ");
//            String email = lector.next();
//            
//            System.out.println("ingrese la direccion del cliente: ");
//            String direccion = lector.next();
//            
//            Cliente cl = new Cliente(nombre, dni, telefono, email, direccion);
//             
//
//            c.agregar(cl);
//            c.consultarClientes();
//            System.out.println("Insercion correcta");

//        System.out.println("----------------------------------------------------------------------------------------");

            System.out.println("Eliminacion");
            Scanner lector = new Scanner(System.in);
            
            System.out.println("ingrese el dni del cliente: ");
            int dni = lector.nextInt();
            
            
            c.eliminar(dni);
            c.consultarClientes();
            System.out.println("Eliminacion correcta");
    }

}
