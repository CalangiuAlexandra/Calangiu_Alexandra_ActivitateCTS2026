package classes;

public class PachetCuAnulare extends PachetDecorator {
    public PachetCuAnulare(PachetTuristic pachet) {
        super(pachet);
    }

    @Override
    public void rezerva() {
        super.rezerva();
        System.out.println("Pachetul poate fi anulat in maxim trei luni.");
    }

    public void anuleaza() {
        System.out.println("Pachet anulat.");
    }
}
