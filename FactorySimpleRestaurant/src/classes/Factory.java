package classes;

public class Factory {
    public ISupa creeazaObiect(TipSupa tip) throws Exception {
        switch (tip) {
            case SupaCiuperci : return new SupaCiuperci();
            case SupaLegume: return new SupaLegume();
            case SupaVita: return new SupaVita();
            default: throw new Exception("Supa ceruta nu exista in meniu");
        }
    }
}
