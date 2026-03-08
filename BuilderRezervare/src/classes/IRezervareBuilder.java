package classes;

public interface IRezervareBuilder {
    public IRezervareBuilder setGenMuzica(String genMuzica);
    public IRezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala);
    public IRezervareBuilder setDecorareMese(boolean decorareMese);
    public IRezervareBuilder setScaundeErgonomice(boolean scaundeErgonomice);
    public IRezervareBuilder setAsezareGeam(boolean asezareGeam);
    public Rezervare build();
}
