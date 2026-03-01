import factory.*;
import pachete.PachetTuristic;

public class Main {
    public static void main(String[] args) {

        FabricaPacheteTuristice fabricaCazare = new FabricaCazare();
        FabricaPacheteTuristice fabricaTransport = new FabricaTransport();

        PachetTuristic p1 = fabricaCazare.crearePachet("hotel");
        PachetTuristic p2 = fabricaCazare.crearePachet("cabana");

        PachetTuristic p3 = fabricaTransport.crearePachet("autobuz");
        PachetTuristic p4 = fabricaTransport.crearePachet("microbuz");

        System.out.println(p1.descriere());
        System.out.println(p2.descriere());
        System.out.println(p3.descriere());
        System.out.println(p4.descriere());
    }
}