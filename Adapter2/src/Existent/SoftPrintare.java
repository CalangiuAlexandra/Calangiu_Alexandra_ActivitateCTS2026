package Existent;

public class SoftPrintare implements ISoftPrinare{
    private String denumire;

    public SoftPrintare(String denumire) {
        this.denumire = denumire;
    }


    @Override
    public void afiseaza() {
        System.out.println("Soft-ul de printare " + this.denumire + " a fost folosit!");
    }
}
