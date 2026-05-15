package Nou;

public abstract class AMedicament {
    protected String nume;
    protected float pret;
    protected int nrBucati;

    public AMedicament(String nume, float pret, int nrBucati) {
        this.nume = nume;
        this.pret = pret;
        this.nrBucati = nrBucati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMedicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrBucati=").append(nrBucati);
        sb.append('}');
        return sb.toString();
    }

    public abstract void cumparaMedicament();
}
