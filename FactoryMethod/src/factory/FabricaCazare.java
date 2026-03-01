package factory;

import pachete.*;

public class FabricaCazare extends FabricaPacheteTuristice {

    @Override
    public PachetTuristic crearePachet(String tipPachet) {
        switch (tipPachet.toLowerCase()) {
            case "hotel":
                return new CazareHotel();
            case "cabana":
                return new CazareCabana();
            default:
                throw new IllegalArgumentException("Tip cazare invalid");
        }
    }
}