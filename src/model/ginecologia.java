package model;

public class ginecologia extends pacient{
private boolean esPrimerFill;
private boolean diabetesGestional;

public ginecologia(String nom, int edat){
 super(nom, edat);
 esPrimerFill = false;
 diabetesGestional = false;
 
 
}

public boolean isEsPrimerFill() {
    return esPrimerFill;
}

public void setEsPrimerFill(boolean esPrimerFill) {
    this.esPrimerFill = esPrimerFill;
}

public boolean isDiabetesGestional() {
    return diabetesGestional;
}

public void setDiabetesGestional(boolean diabetesGestional) {
    this.diabetesGestional = diabetesGestional;
}
public String toString(){
   String t;
   String t2;
   String t3;

   if(esPrimerFill){
    t = "si";
   }
   else{
    t = "No";
   }

   if(super.isAlergia()){
     t2 = "si";

   }
   else{
     t2 = "No";
   }

   if(isDiabetesGestional()){
     t3 = "si";

   }
   else{
     t3 = "No";
   }
   

   return (super.toString()+"Primer fill: "+ t+ "Té diabetes gestional: "+t3);

}

public double grauUrgencia(){
   
    double urg;
    if(esPrimerFill){
      urg = (getEdat()/20) +0.3;
    }
    if(isDiabetesGestional()){
      urg = (getEdat()/20)+0.5;
    }
    if((isDiabetesGestional())&&(esPrimerFill())){
      urg = (getEdat()/20)+0.5+0.3;
    }
    else{
      urg = getEdat()/20;
    }

    return urg;
}







}