package builder;

public class PachetTransport {
    private boolean wifi;
    private boolean animaleCompanie;
    private boolean fumatori;
    private boolean aerConditionat;
    private boolean televizor;


    public PachetTransport(boolean wifi, boolean animaleCompanie, boolean fumatori, boolean aerConditionat, boolean televizor) {
        this.wifi = wifi;
        this.animaleCompanie = animaleCompanie;
        this.fumatori = fumatori;
        this.aerConditionat = aerConditionat;
        this.televizor = televizor;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "wifi=" + wifi +
                ", animaleCompanie=" + animaleCompanie +
                ", fumatori=" + fumatori +
                ", aerConditionat=" + aerConditionat +
                ", televizor=" + televizor +
                '}';
    }
}