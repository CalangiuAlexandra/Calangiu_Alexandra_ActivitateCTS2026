package main;

import classes.Factory;
import classes.ISupa;
import classes.TipSupa;

public class Main {
    public static void main(String[] args) throws Exception {
        Factory facbricaSupe = new Factory();
        ISupa supaCiuperci = facbricaSupe.creeazaObiect(TipSupa.SupaCiuperci);
        ISupa supaLegume = facbricaSupe.creeazaObiect(TipSupa.SupaLegume);

        System.out.println(supaCiuperci);
        System.out.println(supaLegume);
    }
}
