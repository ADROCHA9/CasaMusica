
package ar.com.casamusica.proyectofinal.entities;

public class Amplificador 
 {protected int id;
  private String tipo;
  private String marca;
  private double precio;

    
 public Amplificador() {}
     
 public Amplificador(int id, String tipo, String marca,double precio) 
     {this.setId(id);
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
     
 
 public int getId() 
     {return id;}
     
 public void setId(int id) 
     {if (id > 0) 
         {this.id = id;}
      else {System.out.println("Codigo Incorrecto");}} 
         
     
 @Override
 public String toString() 
     {return "Id: " + id + ", Tipo: " + tipo + ", Marca: " + marca +", Precio: " + precio;}
}
