package main;

import classes.PachetCuAnulare;
import classes.PachetStandard;
import classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet = new PachetStandard();
        pachet = new PachetCuAnulare(pachet);

        pachet.rezerva();
    }
}
