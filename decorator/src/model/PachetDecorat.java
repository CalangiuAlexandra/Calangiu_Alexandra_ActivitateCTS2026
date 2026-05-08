package model;

public class PachetDecorat extends APachetDecorat{
    public PachetDecorat(IPachet pachet) {
        super(pachet);
    }

    @Override
    public void anuleazaVanarePachet() {
        System.out.println("S-a anulat vanzarea pacheteului cu destinatia " +((Pachet)pachet).getDestinatie());
    }
}
