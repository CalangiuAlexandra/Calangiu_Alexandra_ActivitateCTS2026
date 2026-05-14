package classes;

public class Internat implements IPrimiriUrgente{
    private Pacient pacient;

    public Internat(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        pacient.interneaza();
    }
}
