package main;

import classes.Categorie;
import classes.Optiune;

public class Main {
    public static void main(String[] args) {
        Categorie meniuPrincipal = new Categorie("Meniu Principal");
        Categorie cazare = new Categorie("Cazare");
        Categorie transport = new Categorie("Transport");

        Optiune hotel = new Optiune("Hotel");
        Optiune pensiune = new Optiune("Pensiune");
        Optiune avion = new Optiune("Avion");

        cazare.adauga(hotel);
        cazare.adauga(pensiune);
        transport.adauga(avion);

        meniuPrincipal.adauga(cazare);
        meniuPrincipal.adauga(transport);
        meniuPrincipal.afiseaza();
    }
}
