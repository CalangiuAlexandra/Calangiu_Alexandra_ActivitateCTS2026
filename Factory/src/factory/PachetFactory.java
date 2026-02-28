package factory;

import pachete.*;

public class PachetFactory {
    public static PachetTuristic createPachet(String tip) {
        switch (tip.toLowerCase()) {
            case "cazare":
                return new PachetCazare();
            case "transport":
                return new PachetTransport();
            case "complet":
                return new PachetComplet();
            default:
                throw new IllegalArgumentException("Tip necunoscut!");
        }
    }
}