package model;


public class pacient  {
private String nom;
private int edat;
private boolean alergia;

public pacient(String nom, int edat){

 this.nom = nom;
 this.edat = edat;
 alergia = false;
 //codi
 
}
//codi

public String getNom() {
    return nom;
}

public int getEdat() {
    return edat;
}

public boolean isAlergia() {
    return alergia;
}

public void setAlergia(boolean alergia) {
    this.alergia = alergia;
}

@Override
public String toString() {
    return "pacient [nom=" + nom + ", edat=" + edat + ", alergia=" + alergia + "]";
}

public double grauUrgencia(){
   //getter i setter 
    return (edat/20);
}


}