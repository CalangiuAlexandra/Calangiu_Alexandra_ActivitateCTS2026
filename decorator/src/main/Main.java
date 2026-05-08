package main;

import model.APachetDecorat;
import model.IPachet;
import model.Pachet;
import model.PachetDecorat;

public class Main {
    public static void main(String[] args) {
        IPachet pachet = new Pachet(3000,"Roma",7);
        pachet.vindePachet();

        APachetDecorat pachetDecorat = new PachetDecorat(pachet);
        pachetDecorat.vindePachet();
        pachetDecorat.anuleazaVanarePachet();
    }
}
