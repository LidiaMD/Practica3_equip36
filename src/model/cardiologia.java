package model;

public class cardiologia extends pacient {
    
    private int minuts;

    public cardiologia(nom, edat){
      super(nom, edat);
      minuts = 0;

 
    }
    @Override
    public String toString() {
        return "cardiologia [minuts=" + minuts + ", getMinuts()=" + getMinuts() + ", getNom()=" + getNom()
                + ", getEdat()=" + getEdat() + ", isAlergia()=" + isAlergia() + ", toString()=" + super.toString()
                + "]";
    }





    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }}
