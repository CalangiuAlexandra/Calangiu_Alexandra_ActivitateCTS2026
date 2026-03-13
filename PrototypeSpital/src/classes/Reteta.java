package classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta {
    private List<String> solutii = new ArrayList<>();
    private List<Integer> cantitati = new ArrayList<>();

    public Reteta(List<String> solutii, List<Integer> cantitati) {
        this.solutii = solutii;
        this.cantitati = cantitati;
    }

    public List<String> getSolutii() {
        return solutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }
}
