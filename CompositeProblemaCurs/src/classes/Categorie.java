package classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Meniu {
    private String nume;
    private List<Meniu> lista = new ArrayList<>();

    public Categorie(String nume) {
        this.nume = nume;
    }

    public void adauga(Meniu m) {
        lista.add(m);
    }

    public void sterge(Meniu m) {
        lista.remove(m);
    }

    public Meniu get(int index) {
        return lista.get(index);
    }

    @Override
    public void afiseaza() {
        System.out.println("Categorie: " + nume);
        for (Meniu m : lista) {
            m.afiseaza();
        }
    }
}
