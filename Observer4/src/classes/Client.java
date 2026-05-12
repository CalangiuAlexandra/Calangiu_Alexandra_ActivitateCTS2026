package classes;

public class Client implements IClient{
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.nume + "a primit notificarea cu mesajul "+mesaj);
    }
}
