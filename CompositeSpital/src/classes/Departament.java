package classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements StructuraSpital {
    private String nume;
    private List<StructuraSpital> lista = new ArrayList<>();

    public Departament(String nume) {
        this.nume = nume;
    }

    public void adauga(StructuraSpital s) {
        lista.add(s);
    }

    public void sterge(StructuraSpital s) {
        lista.remove(s);
    }

    @Override
    public void afiseaza() {
        System.out.println("Departament: " + nume);
        for (StructuraSpital s : lista) {
            s.afiseaza();
        }
    }
}
