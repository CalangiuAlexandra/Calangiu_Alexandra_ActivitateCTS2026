package factory;

import classes.FelMancare;
import classes.Supa;

public class FabricaSupa extends FabricaMancare {
    @Override
    public FelMancare creeazaObiect(String tip) {
        return new Supa(tip);
    }
}
