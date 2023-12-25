
package ar.com.casamusica.proyectofinal.entities;

public class Instrumento {
     
 protected int id;
 private String nombre;
 private String tipo;
 private String marca;
 private double precio;
    
     
 public Instrumento() {}
     
 public Instrumento(int id, String nombre, String tipo, String marca, double precio) 
     {this.setId(id);
      this.setNombre(nombre);
      this.setTipo(tipo);
      this.setMarca(marca);
      this.setPrecio(precio);}
    
     
 public double getPrecio() 
     {return precio;}

 public void setPrecio(double precio) 
     {this.precio = precio;}
 
 
 public String getMarca() 
     {return marca;}
    
 public void setMarca(String marca) 
     {this.marca = marca;}
    
 
 public String getTipo() 
     {return tipo;}
    
 public void setTipo(String tipo) 
     {this.tipo = tipo;}
    
 
 public String getNombre()
     {return nombre;}
    
 public void setNombre(String nombre) 
     {this.nombre = nombre;}
    
 
 public int getId() 
     {return id;}

 public void setId(int id) 
     {if (id > 0) 
             {this.id = id;}
      else {System.out.println("Codigo Incorrecto");}}
     
     
 @Override
 public String toString() 
     {return "Id: " + id + ", Nombre: " + nombre + ", Tipo: " + tipo + ", Marca: " + marca +", Precio: " + precio;}         
}
