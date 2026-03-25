package main;

import classes.Nota;
import classes.NotaCuFelicitare;
import classes.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata();
        nota = new NotaCuFelicitare(nota);

        nota.printeaza();
    }
}
