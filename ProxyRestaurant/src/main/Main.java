package main;

import classes.ProxyRezervare;
import classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new ProxyRezervare();

        rezervare.rezerva("Alexandra", 5);
        rezervare.rezerva("Damian", 2);
    }
}
