package Main;

import Existent.IMedicamentSpital;
import Existent.MedicamentSpital;
import Nou.AMedicament;
import Nou.AdapterMedicament;
import Nou.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        IMedicamentSpital medicamentSpital = new MedicamentSpital("Aspenter", 55.5f, 3);
        medicamentSpital.prezintaReteta();
        medicamentSpital.achizitioneazaMedicament();


        AMedicament medicament = new MedicamentFarmacie("Xanax", 20.5f, 2);
        medicament.cumparaMedicament();
        IMedicamentSpital medicament1 = new AdapterMedicament(medicament);

        medicament1.prezintaReteta();
        medicament1.achizitioneazaMedicament();
    }
}
