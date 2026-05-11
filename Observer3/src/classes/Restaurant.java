package classes;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<Client> listaClientiFideli = new ArrayList<>();

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void clientAbonat(Client client) {
        listaClientiFideli.add(client);
    }

    @Override
    public void clientDezabonat(Client client) {
        listaClientiFideli.remove(client);
    }

    @Override
    public void notificareClient(String mesaj) {
        for(Client client : listaClientiFideli){
            client.notificare(mesaj);
        }
    }

    public void ofertaDePret(){
        notificareClient("A aparut o noua oferta de pret: ");
    }
    public void meniuNou(){
        notificareClient("A aparut un nou meniu: ");
    }
}
