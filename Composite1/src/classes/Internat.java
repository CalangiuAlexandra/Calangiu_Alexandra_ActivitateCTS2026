package classes;

public class Internat implements IPrimiriUrgente {
    Pacient pacient;

    public Internat(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        pacient.interneaza();
    }
}
