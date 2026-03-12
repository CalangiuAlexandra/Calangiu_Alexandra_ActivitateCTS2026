package main;

import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        IFabrica fabricaPersonalMedical = new FabricaMedical();
        IFabrica fabricaPersonalNonMedical = new FabricaNonMedical();

        IPersonal medic = fabricaPersonalMedical.creeazaObiect(TipPersonal.Medic);
        IPersonal secretar = fabricaPersonalNonMedical.creeazaObiect(TipPersonal.Secretar);

        System.out.println(medic.descriere());
        System.out.println(secretar.descriere());
    }
}
