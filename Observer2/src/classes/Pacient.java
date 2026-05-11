package classes;

public class Pacient implements IPacient{
    private String nume;
    private int id;

    public Pacient(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(this.nume + " a receptionat notificarea " + mesaj);
    }
}
