package classes;

public abstract class PachetDecorator implements PachetTuristic {
    protected PachetTuristic pachet;

    public PachetDecorator(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void rezerva() {
        pachet.rezerva();
    }
}
