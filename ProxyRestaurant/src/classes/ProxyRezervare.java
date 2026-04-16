package classes;

public class ProxyRezervare implements Rezervare {
    private Rezervare rezervare;

    public ProxyRezervare() {
        this.rezervare = new RezervareRestaurant();
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane) {
        if (nrPersoane >= 4) {
            rezervare.rezerva(numeClient, nrPersoane);
        } else {
            System.out.println("Rezervarea nu poate fi realizata pentru mai putin de 4 persoane.");
            System.out.println("Va rugam sa veniti direct la restaurant.");
        }
    }
}
