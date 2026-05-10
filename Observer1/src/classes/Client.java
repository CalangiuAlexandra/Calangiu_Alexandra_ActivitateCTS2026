package classes;

public class Client implements IClient{
    private int id;
    private String nume;
    private int varsta;

    public Client(int id, String nume, int varsta) {
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println(this.nume + "a receptionat mesajul "+mesaj);
    }
}
