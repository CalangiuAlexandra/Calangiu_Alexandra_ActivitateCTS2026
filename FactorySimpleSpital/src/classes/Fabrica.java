package classes;

public class Fabrica implements IFactory {
    @Override
    public IPersonal creeazaObiect(TipPersonal tip) throws Exception {
        switch (tip) {
            case Asistenta : return new Asistenta();
            case Brancardier: return new Brancardier();
            case Medic: return new Medic();
            default: throw new Exception("Nu exista acest personal");
        }
    }
}
