package model.proiectNou;

public abstract class AMasina {

    protected String marca;
    protected int nrKm;
    protected String culoare;

    public AMasina(String marca, int nrKm, String culoare) {
        this.marca = marca;
        this.nrKm = nrKm;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrKm=").append(nrKm);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public abstract void inchiriazaMasina();



}
