package classes;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IAgentie{
    private String nume;
    private List<Client> list = new ArrayList<>();

    public Agentie(String nume) {
        this.nume = nume;
    }



    @Override
    public void adaugaClient(Client client) {
       list.add(client);
    }

    @Override
    public void stergeClient(Client client) {
        list.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
        for(Client client: list){
            client.receptioneazaMesaj(mesaj);
        }
    }

    public void notificaDiscount(){
        notifica("Atentie este un discount");
    }
    public void notificaPachetNou(){
        notifica("A aparut un nou pachet");
    }
}
