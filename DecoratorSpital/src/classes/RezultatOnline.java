package classes;

public class RezultatOnline extends RezultatDecorator {
    public RezultatOnline(RezultatAnalize rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultat() {
        super.afiseazaRezultat();
        afiseazaOnline();
    }

    private void afiseazaOnline() {
        System.out.println("Rezultatul este afisat online!");
    }
}
