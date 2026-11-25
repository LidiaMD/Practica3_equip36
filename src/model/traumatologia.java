package model;

public class traumatologia extends pacient{
private String zonaLesio;


public traumatologia(String nom, int edat){
 super(nom, edat);
 zonaLesio = "";
 
 
}


public String getZonaLesio() {
  return zonaLesio;
}


public void setZonaLesio(String zonaLesio) {
  this.zonaLesio = zonaLesio;
}


@Override
public String toString() {
  return (super.toString()+"traumatologia [zonaLesio=" + zonaLesio + "]");
}


   

   
   
}
