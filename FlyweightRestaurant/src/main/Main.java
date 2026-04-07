package main;

import classes.FabricaClienti;
import classes.IClient;
import classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabrica = new FabricaClienti();

        IClient c1 = fabrica.getClient("Alexandra", "0888", "alexandra@yahoo.com");
        IClient c2 = fabrica.getClient("Damian", "01444", "damian@yahoo.com");

        c1.afiseazaRezervare(new Rezervare(1, 2, "18:00"));
        c2.afiseazaRezervare(new Rezervare(5, 4, "19:00"));
    }
}
