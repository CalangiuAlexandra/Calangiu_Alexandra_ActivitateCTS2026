package classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ElementMeniu {
    private String nume;
    private List<ElementMeniu> elemente = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }

    public void adauga(ElementMeniu e) {
        elemente.add(e);
    }

    public void sterge(ElementMeniu e) {
        elemente.remove(e);
    }

    @Override
    public void afiseaza() {
        System.out.println("Sectiune: " + nume);
        for (ElementMeniu e : elemente) {
            e.afiseaza();
        }
    }
}
