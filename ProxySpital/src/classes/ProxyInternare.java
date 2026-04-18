package classes;

public class ProxyInternare implements Internare {
    private Internare internare;

    public ProxyInternare() {
        this.internare = new InternareSpital();
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.hasAsigurare()) {
            internare.interneaza(pacient);
        } else {
            System.out.println("Internare refuzata pentru " + pacient.getNume() +
                    " - neasigurat.");
        }
    }
}
