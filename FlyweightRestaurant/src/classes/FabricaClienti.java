package classes;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, IClient> clienti = new HashMap<>();

    public IClient getClient(String nume, String telefon, String email) {
        if (!clienti.containsKey(email)) {
            clienti.put(email, new Client(nume, telefon, email));
        }
        return clienti.get(email);
    }
}