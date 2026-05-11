package classes;

public class Client implements IClient{
    private String nume;
    private int nrRezervare;

    public Client(String nume, int nrRezervare) {
        this.nume = nume;
        this.nrRezervare = nrRezervare;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(this.nume + " a primit notificarea: " + mesaj);
    }
}
