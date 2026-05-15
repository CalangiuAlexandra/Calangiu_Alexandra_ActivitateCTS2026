package Main;

import classes.Internat;
import classes.Pacient;
import classes.TratatImediat;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana","gripa",20);
        Internat internat = new Internat(pacient);
        TratatImediat tratatImediat = new TratatImediat(pacient);

        pacient.trateazaImediat();
        pacient.interneaza();
    }
}
