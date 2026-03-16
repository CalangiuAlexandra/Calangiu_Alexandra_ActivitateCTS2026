package main;

import classes.AdapterMedicament;
import classes.MedicamentFarmacie;
import classes.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();

        MedicamentFarmacie medicamentFarmacie = new AdapterMedicament(medicamentSpital);
        medicamentFarmacie.cumparaMedicament();
    }
}
