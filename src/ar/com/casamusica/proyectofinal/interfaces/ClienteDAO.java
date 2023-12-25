package ar.com.casamusica.proyectofinal.interfaces;

import ar.com.casamusica.proyectofinal.entities.Cliente;
import java.util.ArrayList;
import java.util.List;

public interface ClienteDAO 
 {List<Cliente> consultarClientes();
  void consultarCliente(int dni);
  ArrayList<Cliente> cargarlista();
  void eliminar(int cliente_DNI);
  void agregar(Cliente cliente);}
