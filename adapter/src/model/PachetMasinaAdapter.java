package model;

import model.proiectExistent.IPachetTuristic;
import model.proiectNou.AMasina;
import model.proiectNou.Masina;

public class PachetMasinaAdapter implements IPachetTuristic {

    private AMasina masina;

    public PachetMasinaAdapter(AMasina masina) {
        this.masina = masina;
    }

    @Override
    public void descriere() {
       System.out.println("Este un pachet cu destinatia ");
    }

    @Override
    public void rezervaPachet() {
        masina.inchiriazaMasina();
    }


}
