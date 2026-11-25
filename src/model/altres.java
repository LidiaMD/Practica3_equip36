package model;

public class altres extends pacient{
private String explicacio;

public altres(String nom, int edat){
 super(nom, edat);

 explicacio = "";


}

public String getExplicacio() {
    return explicacio;
}

public void setExplicacio(String explicacio) {
    this.explicacio = explicacio;
}

@Override
public String toString() {
    return "altres [explicacio=" + explicacio + ", getExplicacio()=" + getExplicacio() + ", getNom()=" + getNom()
            + ", getEdat()=" + getEdat() + ", isAlergia()=" + isAlergia() + "]";
}



}
