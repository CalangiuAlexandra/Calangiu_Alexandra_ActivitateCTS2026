package builder;

public class ContBancarBuilder implements BuilderContBancar {
    private String titular;
    private boolean contSalariu = false;
    private boolean cardAtasat = false;
    private boolean internetBanking = false;

    public ContBancarBuilder(String titular) {
        this.titular = titular;
    }

    @Override
    public BuilderContBancar setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
        return this;
    }

    @Override
    public BuilderContBancar setCardAtasat(boolean card) {
        this.cardAtasat = card;
        return this;
    }

    @Override
    public BuilderContBancar setInternetBanking(boolean internet) {
        this.internetBanking = internet;
        return this;
    }

    @Override
    public ContBancar build() {
        return new ContBancar(
                titular,
                contSalariu,
                cardAtasat,
                internetBanking
        );
    }
}