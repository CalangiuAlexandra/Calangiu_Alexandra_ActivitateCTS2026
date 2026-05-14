package classes;

public class Pacient implements IPacient{
    private String nume;
    private String afectiune;

    public Pacient(String nume, String afectiune) {
        this.nume = nume;
        this.afectiune = afectiune;
    }

    @Override
    public void interneaza() {
        System.out.println("S-a internat pacientul " + this.nume + " cu afectiunea " + this.afectiune);
    }

    @Override
    public void trateazaImediat() {
        System.out.println("S-a tratat imediat pacientul " + this.nume + " cu afectiunea " + this.afectiune);
    }
}
