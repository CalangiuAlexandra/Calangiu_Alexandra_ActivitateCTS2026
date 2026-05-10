package Main;

import classes.Agentie;
import classes.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1,"Andrei",20);
        Client client2 = new Client(2,"Ana",30);
        Client client3 = new Client(3,"Anda",25);

        Agentie agentie = new Agentie("Karpaten");
        agentie.adaugaClient(client1);
        agentie.adaugaClient(client2);
        agentie.adaugaClient(client3);

        agentie.notificaDiscount();
        System.out.println("---------------");
        agentie.notificaPachetNou();
    }
}
