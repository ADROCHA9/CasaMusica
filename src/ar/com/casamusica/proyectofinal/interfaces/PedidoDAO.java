package ar.com.casamusica.proyectofinal.interfaces;

import ar.com.casamusica.proyectofinal.entities.Pedido; 
import java.util.ArrayList;
import java.util.List;

public interface PedidoDAO  
 {List<Pedido> consultarPedidos();
  void consultarPedido(int idPedido);
  ArrayList<Pedido> cargarlista();
  void eliminar(int idPedido);
  void agregar(Pedido pedido);}
