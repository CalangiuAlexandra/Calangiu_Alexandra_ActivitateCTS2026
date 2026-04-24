package classes;

public class Utilizator {
    private String nume;
    private String rol; // "admin" sau "user"

    public Utilizator(String nume, String rol) {
        this.nume = nume;
        this.rol = rol;
    }

    public String getNume() {
        return nume;
    }

    public String getRol() {
        return rol;
    }
}