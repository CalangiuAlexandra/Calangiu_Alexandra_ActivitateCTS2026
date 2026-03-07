package builder;

public class ContBancar {
    private String titular;
    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public ContBancar(String titular, boolean contSalariu, boolean cardAtasat, boolean internetBanking) {
        this.titular = titular;
        this.contSalariu = contSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "titular='" + titular + '\'' +
                ", contSalariu=" + contSalariu +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }
}