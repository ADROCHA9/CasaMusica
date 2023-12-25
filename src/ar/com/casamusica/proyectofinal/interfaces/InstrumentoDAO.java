package ar.com.casamusica.proyectofinal.interfaces;

import ar.com.casamusica.proyectofinal.entities.Instrumento;
import java.util.ArrayList;
import java.util.List;


public interface InstrumentoDAO 
 {List<Instrumento> consultarIntrumentos();
  void consultarIntrumento(int idInstrumento);
  ArrayList<Instrumento> cargarlista();
  void eliminar(int id);
  void agregar(Instrumento instrumento);}
