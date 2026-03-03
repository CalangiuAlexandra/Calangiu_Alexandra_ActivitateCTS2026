package factory;

import pachete.*;

public class FabricaIeftina implements FabricaPachete {

    @Override
    public PachetCazare createPachetCazare() {
        return new CazareIeftina();
    }

    @Override
    public PachetTransport createPachetTransport() {
        return new TransportIeftin();
    }
}