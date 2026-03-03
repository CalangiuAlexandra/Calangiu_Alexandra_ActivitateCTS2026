import factory.*;
import pachete.*;

public class Main {
    public static void main(String[] args) {

        // alegi familia
        FabricaPachete fabrica = new FabricaIeftina();
        // FabricaPachete fabrica = new FabricaScumpa();

        PachetCazare cazare = fabrica.createPachetCazare();
        PachetTransport transport = fabrica.createPachetTransport();

        System.out.println(cazare.descriere());
        System.out.println(transport.descriere());
    }
}