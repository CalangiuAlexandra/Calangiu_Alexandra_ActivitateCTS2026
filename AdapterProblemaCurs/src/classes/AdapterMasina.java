package classes;

public class AdapterMasina implements PachetTuristic {
    private SistemMasini sistemMasini;

    public AdapterMasina(SistemMasini sistemMasini) {
        this.sistemMasini = sistemMasini;
    }

    @Override
    public void rezerva() {
        sistemMasini.inchiriazaMasina();
    }
}