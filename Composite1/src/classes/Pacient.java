package classes;

public class Pacient implements IPacient {
    private String nume;
    private String afectiune;
    private int varsta;

    public Pacient(String nume, String afectiune, int varsta) {
        this.nume = nume;
        this.afectiune = afectiune;
        this.varsta = varsta;
    }

    @Override
    public void interneaza() {
        System.out.println("S-a internat pacientul cu numele "+this.nume+" varsta "+this.varsta+" si afectiunea"+this.afectiune);
    }

    @Override
    public void trateazaImediat() {
        System.out.println("S-a tratat imediat pacientul cu numele "+this.nume+" varsta "+this.varsta+" si afectiunea"+this.afectiune);

    }
}
