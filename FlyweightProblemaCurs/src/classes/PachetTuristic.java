package classes;

public class PachetTuristic implements IPachetTuristic {
    private int codPachet;
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
        this.codPachet = codPachet;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    @Override
    public void descrierePachet(Optiuni optiuni) {
        System.out.println("Cod: " + codPachet +
                ", Hotel: " + hotel +
                ", Destinatie: " + destinatie +
                ", Mic dejun: " + micDejun +
                ", Cina: " + optiuni.isCina() +
                ", Excursii: " + optiuni.getNumarExcursii());
    }
}
