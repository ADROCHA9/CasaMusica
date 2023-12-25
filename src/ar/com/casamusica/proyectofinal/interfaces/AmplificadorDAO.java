package ar.com.casamusica.proyectofinal.interfaces;

import ar.com.casamusica.proyectofinal.entities.Amplificador;
import java.util.ArrayList;
import java.util.List;


public interface AmplificadorDAO 
 {List<Amplificador> consultarAmplificadores();
  void consultarAmplificador(int idAmplificador);
  ArrayList<Amplificador> cargarlista();
  void eliminar(int idA);
  void agregar(Amplificador amplificador);}
