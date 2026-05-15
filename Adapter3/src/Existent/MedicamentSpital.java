package Existent;

public class MedicamentSpital implements IMedicamentSpital{
    private String nume;
    private float pret;
    private int nrBucati;

    public MedicamentSpital(String nume, float pret, int nrBucati) {
        this.nume = nume;
        this.pret = pret;
        this.nrBucati = nrBucati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrBucati=").append(nrBucati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Se achizitioneaza medicamentele din spital "+this.nume+" la pretul "+this.pret + "si nr de bucati "+this.nrBucati);
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Se prezinta reteta pentru medicamentele din spital "+this.nume);

    }
}
