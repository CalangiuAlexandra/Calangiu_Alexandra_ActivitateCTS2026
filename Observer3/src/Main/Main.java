package Main;

import classes.Client;
import classes.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ana",2);
        Client client1 = new Client("Alex",5);
        Client client2 = new Client("Merle",6);

        Restaurant restaurant = new Restaurant("Pescarus");

        restaurant.clientAbonat(client);
        restaurant.clientAbonat(client1);
        restaurant.clientAbonat(client2);

        restaurant.meniuNou();
        System.out.println("------");
        restaurant.ofertaDePret();
    }
}
