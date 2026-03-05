package prototype;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

    private List<String> oferte;

    public ListaOferte() {
        oferte = new ArrayList<>();

        oferte.add("City Break Paris");
        oferte.add("Vacanta Grecia");
        oferte.add("Excursie Roma");
    }

    @Override
    public IListaOferte copiaza() {
        ListaOferte lista = new ListaOferte();
        for (String elem : oferte) {
            lista.oferte.add(elem);
        }

        return lista;
    }

    @Override
    public String toString() {
        return "ListaOferte{" +
                "oferte=" + oferte +
                '}';
    }
}