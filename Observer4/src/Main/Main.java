package Main;

import classes.AgentieTurism;
import classes.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Aana",25);
        Client client1 = new Client("Dana",20);



        AgentieTurism agentieTurism = new AgentieTurism("Karpaten");
        agentieTurism.aboneazaClient(client);
        agentieTurism.pachetNou();
        agentieTurism.discount();
    }
}
