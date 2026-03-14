package classes;

public class FactorySupe implements IFactory {

    @Override
    public IFelMancare creeazaObiect(TipMancare tipMancare) throws Exception {
        switch (tipMancare) {
            case SupaLegume: return new SupaLegume();
            case SupaVita: return new SupaVita();
            default: throw new Exception("Felul de mancare nu exista");
        }
    }
}
