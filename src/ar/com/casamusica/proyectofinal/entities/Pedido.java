
package ar.com.casamusica.proyectofinal.entities;

import java.util.ArrayList;
import java.util.List;


public class Pedido 
{private int id_pedido;
 private String cliente_nombre;
 private int cliente_DNI;
 private int id_instrumento;
 private int id_amplificador;
 private int contador = 0;
 private List<Instrumento> instrumentos;
 private List<Amplificador> amplificadores;
     
     
 public Pedido() {}

 public Pedido(int id_pedido, String cliente_nombre, int cliente_DNI, int id_instrumento, int id_amplificador) 
     {this.setId_pedido(id_pedido);
      this.setCliente_nombre(cliente_nombre);
      this.setCliente_DNI(cliente_DNI);
      this.setId_instrumento(id_instrumento);
      this.setId_amplificador(id_amplificador);
      this.instrumentos = new ArrayList<>();
      this.amplificadores = new ArrayList<>();}
     
     
 public int getId_amplificador() 
     {return id_amplificador;}

 public void setId_amplificador(int id_amplificador) 
     {this.id_amplificador = id_amplificador;}

 
 public int getId_instrumento() 
     {return id_instrumento;}

 public void setId_instrumento(int id_instrumento) 
     {this.id_instrumento = id_instrumento;}

 
 public int getCliente_DNI()
     {return cliente_DNI;}

 public void setCliente_DNI(int cliente_DNI) 
     {this.cliente_DNI = cliente_DNI;}

 
 public String getCliente_nombre() 
     {return cliente_nombre;}

 public void setCliente_nombre(String cliente_nombre) 
     {this.cliente_nombre = cliente_nombre;}

 
 public int getId_pedido() 
     {return id_pedido;}

 public void setId_pedido(int id_pedido) 
    {id_pedido = 0;
     this.id_pedido = id_pedido; }

     
 @Override
 public String toString() 
     {return "IDPedido: " + id_pedido + ", Nombre: " + cliente_nombre + ", DNI: " + cliente_DNI 
                 + ", IDinstrumento: " + id_instrumento + ", IDamplificador: " + id_amplificador;}
}
