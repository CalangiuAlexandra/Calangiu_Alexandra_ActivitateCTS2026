package main;

import classes.Fabrica;
import classes.IFactory;
import classes.IPersonal;
import classes.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        IFactory factory = new Fabrica();
        IPersonal asistenta = factory.creeazaObiect(TipPersonal.Asistenta);
        IPersonal medic = factory.creeazaObiect(TipPersonal.Medic);
        IPersonal brancardier = factory.creeazaObiect(TipPersonal.Brancardier);

        asistenta.descriere();
        medic.descriere();
        brancardier.descriere();
    }
}
