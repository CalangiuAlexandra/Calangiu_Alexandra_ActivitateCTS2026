package factory;

import pachete.PachetCazare;
import pachete.PachetTransport;

public interface FabricaPachete {
    PachetCazare createPachetCazare();
    PachetTransport createPachetTransport();
}