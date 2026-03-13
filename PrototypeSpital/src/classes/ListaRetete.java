package classes;

import java.util.ArrayList;
import java.util.List;

public class ListaRetete {
    private List<IReteta> retete;

    public ListaRetete() {
        this.retete = new ArrayList<>();
    }

    public ListaRetete(List<IReteta> retete) {
        this.retete = retete;
    }

    public ListaRetete copiaza()
    {
        ListaRetete copie = new ListaRetete();
        for (IReteta elem: this.retete) {
            copie.retete.add(elem);
        }

        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaRetete{");
        sb.append("retete=").append(retete);
        sb.append('}');
        return sb.toString();
    }
}
