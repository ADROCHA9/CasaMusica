package ar.com.casamusica.proyectofinal.interfaces;

import ar.com.casamusica.proyectofinal.entities.Amplificador;
import ar.com.casamusica.proyectofinal.entities.Carrito;
import ar.com.casamusica.proyectofinal.entities.Instrumento;
import java.util.ArrayList;
import java.util.List;

public interface CarritoDAO
 {List<Carrito> consultar();
  ArrayList<Carrito> cargarlista();
  void eliminar(double precio);
  void agregarI(Instrumento i);
  void agregarA(Amplificador a);
  double total();
  void eliminarTodo();
  boolean verificarDNIBaseDatos(int dni);}
    

