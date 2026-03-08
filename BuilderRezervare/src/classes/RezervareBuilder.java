package classes;

public class RezervareBuilder implements IRezervareBuilder {
    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare();
    }

    @Override
    public IRezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public IRezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    @Override
    public IRezervareBuilder setDecorareMese(boolean decorareMese) {
        this.rezervare.setDecorareMese(decorareMese);
        return this;
    }

    @Override
    public IRezervareBuilder setScaundeErgonomice(boolean scaundeErgonomice) {
        this.rezervare.setScaundeErgonomice(scaundeErgonomice);
        return this;
    }

    @Override
    public IRezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }


}
