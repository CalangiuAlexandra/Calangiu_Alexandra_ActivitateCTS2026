package model;

public class Lautar {
    private String numeTrurpa;
    private float pret;

    public Lautar(String numeTrurpa, float pret) {
        this.numeTrurpa = numeTrurpa;
        this.pret = pret;
    }

    public void inchiriazaLautar(){
        System.out.println("S-a inchiriaat trupa "+this.numeTrurpa);
    }
}
