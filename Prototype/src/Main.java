import prototype.IListaOferte;
import prototype.ListaOferte;

public class Main {
    public static void main(String[] args) {
        // citim ofertele o singura data
        ListaOferte prototype = new ListaOferte();

        // pentru fiecare client clonam lista
        IListaOferte client1 = prototype.copiaza();
        IListaOferte client2 = prototype.copiaza();
        IListaOferte client3 = prototype.copiaza();

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
    }
}