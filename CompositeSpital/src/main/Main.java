package main;

import classes.Departament;
import classes.Sectie;

public class Main {
    public static void main(String[] args) {
        Departament spital = new Departament("Spital");
        Departament cardiologie = new Departament("Cardiologie");
        Departament chirurgie = new Departament("Chirurgie");

        Sectie ATI = new Sectie("ATI");
        Sectie urgenta = new Sectie("Urgenta");
        cardiologie.adauga(ATI);
        chirurgie.adauga(urgenta);

        spital.adauga(cardiologie);
        spital.adauga(chirurgie);
        spital.afiseaza();
    }
}
