package classes;

public class Rezervare {
    private boolean asezareGeam = false;
    private boolean scaundeErgonomice = false;
    private boolean decorareMese = false;
    private boolean muzicaAmbientala = false;
    private String genMuzica = "Niciuna";

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public boolean isScaundeErgonomice() {
        return scaundeErgonomice;
    }

    public void setScaundeErgonomice(boolean scaundeErgonomice) {
        this.scaundeErgonomice = scaundeErgonomice;
    }

    public boolean isDecorareMese() {
        return decorareMese;
    }

    public void setDecorareMese(boolean decorareMese) {
        this.decorareMese = decorareMese;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareGeam=" + asezareGeam +
                ", scaundeErgonomice=" + scaundeErgonomice +
                ", decorareMese=" + decorareMese +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
