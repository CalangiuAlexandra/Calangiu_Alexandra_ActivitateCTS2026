package classes;

public class RezervareRestaurant implements Rezervare {
    @Override
    public void rezerva(String numeClient, int nrPersoane) {
        System.out.println("Rezervare realizata pentru " + numeClient +
                " pentru " + nrPersoane + " persoane.");
    }
}
