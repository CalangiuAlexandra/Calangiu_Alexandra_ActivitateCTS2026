package classes;

public class RezervareFacade {
    private PachetTuristic pachet;
    private Hotel hotel;
    private Zbor zbor;
    private SistemSalvare salvare;

    public RezervareFacade() {
        pachet = new PachetTuristic();
        hotel = new Hotel();
        zbor = new Zbor();
        salvare = new SistemSalvare();
    }

    public void rezervaPachet() {
        pachet.creeazaPachet();
        hotel.rezervaCamera();
        zbor.cautaZbor();
        salvare.salveaza();
    }
}
