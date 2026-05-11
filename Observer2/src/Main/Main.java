package Main;

import classes.Pacient;
import classes.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ana",2);
        Pacient pacient2 = new Pacient("Stefan",3);
        Pacient pacient3 = new Pacient("Cristina",4);

        Spital spital = new Spital("Floreasca");

        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        spital.notificaVirusNou();
        System.out.println("--------");
        spital.notificaEpidemie();
    }
}
