package classes;

public class TratatImediat implements IPrimiriUrgente{
    Pacient pacient;

    public TratatImediat(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        pacient.trateazaImediat();
    }
}
