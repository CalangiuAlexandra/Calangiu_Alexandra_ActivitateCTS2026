package classes;

public class Optiune implements Meniu {
    private String nume;

    public Optiune(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Optiune: " + nume);
    }
}
