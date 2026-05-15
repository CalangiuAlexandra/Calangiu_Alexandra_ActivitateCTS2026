package main;

import Existent.ISoftPrinare;
import Existent.SoftPrintare;
import Nou.ASoftOnline;
import Nou.AdapterSoft;
import Nou.SoftOnline;

public class Main {
    public static void main(String[] args) {
        ISoftPrinare soft = new SoftPrintare("Vechi");
        ASoftOnline softNou = new SoftOnline("Nou");

        ISoftPrinare adapter = new AdapterSoft(softNou);

        soft.afiseaza();
        adapter.afiseaza();
    }
}
