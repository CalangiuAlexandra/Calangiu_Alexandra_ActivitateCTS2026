package builder;

public class PachetTransportBuilder implements BuilderPachetTransport {

    private boolean wifi = false;
    private boolean animaleCompanie = false;
    private boolean fumatori = false;
    private boolean aerConditionat = false;
    private boolean televizor = false;

    @Override
    public BuilderPachetTransport setWifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    @Override
    public BuilderPachetTransport setAnimaleCompanie(boolean animale) {
        this.animaleCompanie = animale;
        return this;
    }

    @Override
    public BuilderPachetTransport setFumatori(boolean fumatori) {
        this.fumatori = fumatori;
        return this;
    }

    @Override
    public BuilderPachetTransport setAerConditionat(boolean aer) {
        this.aerConditionat = aer;
        return this;
    }

    @Override
    public BuilderPachetTransport setTelevizor(boolean tv) {
        this.televizor = tv;
        return this;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(
                wifi,
                animaleCompanie,
                fumatori,
                aerConditionat,
                televizor
        );
    }
}