package main;

import classes.ProxyRezervare;
import classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new ProxyRezervare();

        rezervare.rezerva("Ion Popescu", 5); // OK
        rezervare.rezerva("Maria Ionescu", 2); // Refuz
    }
}
