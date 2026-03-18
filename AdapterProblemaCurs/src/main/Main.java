package main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristic cazare = new PachetCazare();
        PachetTuristic transport = new PachetTransport();

        SistemMasini sistemMasini = new SistemMasini();
        PachetTuristic masina = new AdapterMasina(sistemMasini);

        cazare.rezerva();
        transport.rezerva();
        masina.rezerva();
    }
}
