package Nou;

import classes.Existent.MedicamentSpital;

public class MedicamentFarmacie extends AMedicament {
    public MedicamentFarmacie(String nume, float pret, int nrBucati) {
        super(nume, pret, nrBucati);
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Se cumpara medicamentul "+super.nume);
    }
}
