package classes;

public class PlataPachet {
    private MetodaPlata metodaPlata;

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void executaPlata(double suma) {
        if (metodaPlata == null) {
            System.out.println("Nu a fost aleasa o metoda de plata valida!");
        } else {
            metodaPlata.plateste(suma);
        }
    }
}
