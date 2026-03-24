package main;

import classes.InternareFacade;
import classes.Medic;
import classes.Pacient;
import classes.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient();
        Medic medic = new Medic();
        Salon salon = new Salon();

        InternareFacade facade = new InternareFacade(pacient, medic, salon);

        if (facade.verificaInternare()) {
            System.out.println("Pacientul poate fi internat");
        } else {
            System.out.println("Pacientul NU poate fi internat");
        }
    }
}
