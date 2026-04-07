package classes;

public class Client implements IClient {
    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("Client: " + nume +
                ", Tel: " + telefon +
                ", Email: " + email +
                ", Masa: " + rezervare.getNrMasa() +
                ", Persoane: " + rezervare.getNrPersoane() +
                ", Ora: " + rezervare.getOra());
    }
}
