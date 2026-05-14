package main;

import classes.Internat;
import classes.Pacient;
import classes.TratatImediat;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana", "gripa");

        Internat internat = new Internat(pacient);
        TratatImediat tratatImediat = new TratatImediat(pacient);

        internat.executa();
        tratatImediat.executa();
    }
}
