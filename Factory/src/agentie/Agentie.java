package agentie;

import pachete.PachetTuristic;

import java.util.ArrayList;
import java.util.List;

public class Agentie {
    private static Agentie instanta;

    private List<PachetTuristic> pachete;
    private String nume;

    // constructor privat
    private Agentie(String nume) {
        pachete = new ArrayList<>();
        this.nume = nume;
    }

    // metodă publică pentru obținerea instanței
    public static Agentie getInstanta() {
        if (instanta == null) {
            instanta = new Agentie("AgenTur");
        }
        return instanta;
    }

    public void adaugaPachet(PachetTuristic pachet) {
        pachete.add(pachet);
    }

    @Override
    public String toString() {
        return "Agentie{" +
                "pachete=" + pachete.size() +
                ", nume='" + nume + '\'' +
                '}';
    }
}
