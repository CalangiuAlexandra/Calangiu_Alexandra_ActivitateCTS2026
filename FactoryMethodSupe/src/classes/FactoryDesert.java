package classes;

public class FactoryDesert implements IFactory {
    @Override
    public IFelMancare creeazaObiect(TipMancare tipMancare) throws Exception {
        switch (tipMancare) {
            case Cheesecake: return new Cheesecake();
            case Clatita: return new Clatita();
            default: throw new Exception("Felul de mancare nu exista");
        }
    }
}
