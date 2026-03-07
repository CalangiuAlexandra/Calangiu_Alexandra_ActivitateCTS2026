package builder;

public interface BuilderPachetTransport {
    BuilderPachetTransport setWifi(boolean wifi);
    BuilderPachetTransport setAnimaleCompanie(boolean animale);
    BuilderPachetTransport setFumatori(boolean fumatori);
    BuilderPachetTransport setAerConditionat(boolean aer);
    BuilderPachetTransport setTelevizor(boolean tv);
    PachetTransport build();
}