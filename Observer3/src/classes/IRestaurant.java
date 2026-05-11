package classes;

public interface IRestaurant {
    void clientAbonat(Client client);
    void clientDezabonat(Client client);
    void notificareClient(String mesaj);
}
