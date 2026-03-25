package classes;

public abstract class RezultatDecorator implements RezultatAnalize {
    protected RezultatAnalize rezultat;

    public RezultatDecorator(RezultatAnalize rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        rezultat.afiseazaRezultat();
    }
}
