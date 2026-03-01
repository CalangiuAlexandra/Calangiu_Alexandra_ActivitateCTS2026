package factory;

import pachete.*;

public class FabricaTransport extends FabricaPacheteTuristice {

    @Override
    public PachetTuristic crearePachet(String tipPachet) {
        switch (tipPachet.toLowerCase()) {
            case "autobuz":
                return new TransportAutobuz();
            case "microbuz":
                return new TransportMicrobuz();
            default:
                throw new IllegalArgumentException("Tip transport invalid");
        }
    }
}