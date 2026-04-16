package classes;

public class RezervarePachet implements Rezervare {
    @Override
    public void rezerva(String numeClient, int varsta) {
        System.out.println("Rezervare realizata pentru " + numeClient);
    }
}
