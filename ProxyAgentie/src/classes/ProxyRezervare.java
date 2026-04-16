package classes;

public class ProxyRezervare implements Rezervare {
    private Rezervare rezervare;

    public ProxyRezervare() {
        this.rezervare = new RezervarePachet();
    }

    @Override
    public void rezerva(String numeClient, int varsta) {
        if (varsta >= 65) {
            rezervare.rezerva(numeClient, varsta);
        } else {
            System.out.println("Acces interzis! Doar pensionarii pot rezerva.");
        }
    }
}
