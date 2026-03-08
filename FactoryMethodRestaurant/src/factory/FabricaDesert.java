package factory;

import classes.Desert;
import classes.FelMancare;

public class FabricaDesert extends FabricaMancare {
    @Override
    public FelMancare creeazaObiect(String tip) {
        return new Desert(tip);
    }
}
