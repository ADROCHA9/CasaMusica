
package ar.com.casamusica.proyectofinal.entities;


public class Carrito 
 {private int id;
  private String nombre;
  private String tipo;
  private String marca;
  private double precio;
  private double total;
  
  
  public Carrito() {}

  public Carrito(int id, String nombre, String tipo, String marca, double precio, double total) 
     {this.setId(id);
      this.setNombre(nombre);
      this.setTipo(tipo);
      this.setMarca(marca);
      this.setPrecio(precio);
      this.setTotal(total);}
    
    
 public double getTotal() 
     {return total;}

 public void setTotal(double total) 
     {this.total = total;}


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
     {this.id = id;}

 
 @Override
 public String toString() 
     {return "ID: " + id + ", Nombre: " + nombre + ", Tipo: " + tipo + ", Marca: " + marca + ", Precio: " + precio + ", total: " + total;}
}
