package classes;

public class InternareFacade {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public InternareFacade(Pacient pacient, Medic medic, Salon salon) {
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public boolean verificaInternare() {
        return pacient.esteGrav() && medic.confirmaInternare() && salon.arePatLiber();
    }
}
