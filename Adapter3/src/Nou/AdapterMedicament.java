package Nou;

import Existent.IMedicamentSpital;

public class AdapterMedicament implements IMedicamentSpital {
    private AMedicament medicament;

    public AdapterMedicament(AMedicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AdapterMedicament{");
        sb.append("medicament=").append(medicament);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("S-a achizitionat medicamentul: "+this.medicament);
    }

    @Override
    public void prezintaReteta() {
        medicament.cumparaMedicament();
    }
}
