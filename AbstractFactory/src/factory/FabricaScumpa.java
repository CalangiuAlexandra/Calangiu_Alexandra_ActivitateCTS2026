package factory;

import pachete.*;

public class FabricaScumpa implements FabricaPachete {

    @Override
    public PachetCazare createPachetCazare() {
        return new CazareScumpa();
    }

    @Override
    public PachetTransport createPachetTransport() {
        return new TransportScump();
    }
}