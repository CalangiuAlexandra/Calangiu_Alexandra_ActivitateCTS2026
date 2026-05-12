package classes;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism implements IAgentie {
    private String nume;
    private List<Client> listaClienti = new ArrayList<>();

    public AgentieTurism(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieTurism{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", listaClienti=").append(listaClienti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void aboneazaClient(Client client) {
        listaClienti.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {
        listaClienti.remove(client);
    }

    @Override
    public void notificare(String mesaj) {
        for(Client c:listaClienti){
            c.receptionareMesaj(mesaj);
        }
    }

    public void discount(){
        notificare("A aparut un discount");
    }
    public void pachetNou(){
        notificare("A aparut un nou pachet");
    }
}
