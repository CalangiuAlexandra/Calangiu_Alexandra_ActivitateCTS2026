package main;

import classes.Item;
import classes.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune meniu = new Sectiune("Meniu");
        Sectiune bauturi = new Sectiune("Bauturi");
        Sectiune sucuri = new Sectiune("Sucuri");
        Item cola = new Item("Cola");
        Item apa = new Item("Apa");

        sucuri.adauga(cola);
        bauturi.adauga(sucuri);
        bauturi.adauga(apa);

        meniu.adauga(bauturi);
        meniu.afiseaza();
    }
}
