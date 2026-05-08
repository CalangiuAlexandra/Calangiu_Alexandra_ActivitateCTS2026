package model.proiectExistent;

public class Pachet implements IPachetTuristic{

    private float pret;
    private String destinatie;
    private int nrNopti;

    public Pachet(float pret, String destinatie, int nrNopti) {
        this.pret = pret;
        this.destinatie = destinatie;
        this.nrNopti = nrNopti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("pret=").append(pret);
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", nrNopti=").append(nrNopti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Este un pachet cu destinatia "+this.destinatie);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("s-a rezervat pachetul cu "+this.nrNopti+" nopti, si pretul "+this.pret);
    }
}
