package model;

public class Pachet implements IPachet{

    private float pret;
    private String destinatie;
    private int nrNopti;

    public Pachet(float pret, String destinatie, int nrNopti) {
        this.pret = pret;
        this.destinatie = destinatie;
        this.nrNopti = nrNopti;
    }

    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public void vindePachet() {
       System.out.println("S-a vandut pachetul cu pretul " + this.pret+" si destinatia "+this.destinatie);
    }

}
