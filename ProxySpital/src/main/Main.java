package main;

import classes.Internare;
import classes.Pacient;
import classes.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Internare internare = new ProxyInternare();

        Pacient p1 = new Pacient("Alexandra", true);
        Pacient p2 = new Pacient("Damian", false);

        internare.interneaza(p1);
        internare.interneaza(p2);
    }
}
