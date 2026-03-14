package main;

import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        IFactory factorySupe = new FactorySupe();
        IFactory factoryDesert = new FactoryDesert();

        IFelMancare clatita = factoryDesert.creeazaObiect(TipMancare.Clatita);
        IFelMancare supaLegume = factorySupe.creeazaObiect(TipMancare.SupaLegume);

        System.out.println(clatita);
        System.out.println(supaLegume);
    }
}
