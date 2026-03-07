package builder;

public interface BuilderContBancar {
    BuilderContBancar setContSalariu(boolean contSalariu);
    BuilderContBancar setCardAtasat(boolean card);
    BuilderContBancar setInternetBanking(boolean internet);
    ContBancar build();
}