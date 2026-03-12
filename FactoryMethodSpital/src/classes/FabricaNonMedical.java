package classes;

public class FabricaNonMedical implements IFabrica {
    @Override
    public IPersonal creeazaObiect(TipPersonal tip) throws Exception {
        switch (tip) {
            case Registrator : return new Registrator();
            case Secretar: return new Secretar();
            default: throw new Exception("Tipul de personal nu este acceptat");
        }
    }
}
