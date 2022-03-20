package it.petrovich.model.interfaces;

public interface Contextual {

  Object getGlobalContext();

  void setGlobalContext(Object context);
}
