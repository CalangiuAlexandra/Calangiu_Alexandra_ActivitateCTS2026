package classes;

public class FabricaMedical implements IFabrica {
    @Override
    public IPersonal creeazaObiect(TipPersonal tip) throws Exception {
        switch (tip) {
            case Asistent: return new Asistent();
            case Brancardier: return new Brancardier();
            case Medic: return new Medic();
            default: throw new Exception("Tipul de personal nu este acceptat");
        }
    }
}
