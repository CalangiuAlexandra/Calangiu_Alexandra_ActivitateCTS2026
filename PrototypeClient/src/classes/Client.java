package classes;

public class Client implements IClient {
    private String nume;
    private String email;

    public Client(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public Client() {
    }

    @Override
    public IClient copiaza() {
        Client copie = new Client();
        copie.nume = this.nume;
        copie.email = this.email;

        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
