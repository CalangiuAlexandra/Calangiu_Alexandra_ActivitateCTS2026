package main;

import classes.ProxyRezervare;
import classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new ProxyRezervare();

        rezervare.rezerva("Ion Popescu", 70); // OK
        rezervare.rezerva("Maria Ionescu", 40); // Blocat
    }
}
