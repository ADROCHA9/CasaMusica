
package ar.com.casamusica.proyectofinal.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente 
{protected String nombre_c;
 protected int DNI;
 private int telefono;
 private String email;
 private String direccion;
 private List<Pedido> pedidos;
     
     
 public Cliente() {}

 public Cliente(String nombre, int DNI, int telefono, String email, String direccion) 
     {this.setNombrec(nombre);
      this.setDNI(DNI);
      this.setTelefono(telefono);
      this.setEmail(email);
      this.setDireccion(direccion);
      this.pedidos = new ArrayList<>();}
       
       
 public String getDireccion() 
     {return direccion;}

 public void setDireccion(String direccion) 
     {this.direccion = direccion;}

 
 public String getEmail() 
     {return email;}

 public void setEmail(String email) 
     {this.email = email;}

 
 public int getTelefono() 
     {return telefono;}

 public void setTelefono(int telefono) 
     {this.telefono = telefono;}

 
 public int getDNI() 
     {return DNI;}

 public void setDNI(int DNI) 
     {if (DNI > 0 && DNI < 99999999 && DNI > -99999999)
             {this.DNI = DNI;} 
      else {System.out.println("DNI ingresado es incorrecto");}}

 
 public String getNombrec() 
     {return nombre_c;}

 public void setNombrec(String nombre) 
     { if (nombre.equals(nombre.toLowerCase())) 
             {this.nombre_c = nombre;} 
       else {nombre = nombre.toLowerCase();
             this.nombre_c = nombre;}}

     
 @Override
 public String toString() 
     {return "Nombre: " + nombre_c + ", DNI: " + DNI + ", Telefono: " + telefono + ", Email: " + email + ", Direccion: " + direccion;}
}
