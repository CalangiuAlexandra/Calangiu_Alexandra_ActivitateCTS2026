package main;

import classes.RezultatAnalize;
import classes.RezultatOnline;
import classes.RezultatPrintat;

public class Main {
    public static void main(String[] args) {
        RezultatAnalize rezultat = new RezultatPrintat();
        rezultat = new RezultatOnline(rezultat);

        rezultat.afiseazaRezultat();
    }
}
