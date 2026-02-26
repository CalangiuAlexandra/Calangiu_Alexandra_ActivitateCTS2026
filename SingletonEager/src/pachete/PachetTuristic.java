package pachete;

public class PachetTuristic {
    private String destinatie;
    private double pret;

    public PachetTuristic(String destinatie, double pret) {
        this.destinatie = destinatie;
        this.pret = pret;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public double getPret() {
        return pret;
    }
}
