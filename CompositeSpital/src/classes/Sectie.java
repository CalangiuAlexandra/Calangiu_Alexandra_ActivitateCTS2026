package classes;

public class Sectie implements StructuraSpital {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Sectie: " + nume);
    }
}
